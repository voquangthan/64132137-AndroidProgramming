import pytest
import time
from src.services.auth import AuthService

def test_successful_login():
    auth_service = AuthService()
    token = auth_service.login("testuser", "testpassword")
    assert token is not None
    assert auth_service.verify_token(token) == True

def test_invalid_password():
    auth_service = AuthService()
    with pytest.raises(ValueError, match="Invalid credentials"):
        auth_service.login("testuser", "wrongpassword")

def test_missing_credentials():
    auth_service = AuthService()
    with pytest.raises(ValueError, match="Missing credentials"):
        auth_service.login("", "testpassword")

    with pytest.raises(ValueError, match="Missing credentials"):
        auth_service.login("testuser", "")

    with pytest.raises(ValueError, match="Missing credentials"):
        auth_service.login(None, None)

def test_expired_token():
    auth_service = AuthService()
    token = auth_service.login("testuser", "testpassword")

    # Manually expire the token
    auth_service.tokens[token]["expiry"] = time.time() - 3600

    with pytest.raises(ValueError, match="Expired token"):
        auth_service.verify_token(token)

def test_missing_token():
    auth_service = AuthService()
    with pytest.raises(ValueError, match="Missing token"):
        auth_service.verify_token(None)

    with pytest.raises(ValueError, match="Missing token"):
        auth_service.verify_token("")

def test_invalid_token():
    auth_service = AuthService()
    with pytest.raises(ValueError, match="Invalid token"):
        auth_service.verify_token("invalid-token")
