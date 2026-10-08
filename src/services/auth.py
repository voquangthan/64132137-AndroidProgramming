import time

class AuthService:
    def __init__(self):
        # Dummy user database
        self.users = {
            "testuser": {
                "password": "testpassword"
            }
        }
        self.tokens = {}

    def login(self, username, password):
        if not username or not password:
            raise ValueError("Missing credentials")

        user = self.users.get(username)
        if not user or user["password"] != password:
            raise ValueError("Invalid credentials")

        # Generate a dummy token and set expiry (e.g. 1 hour)
        token = f"token-{username}-{time.time()}"
        self.tokens[token] = {
            "username": username,
            "expiry": time.time() + 3600
        }
        return token

    def verify_token(self, token):
        if not token:
            raise ValueError("Missing token")

        token_data = self.tokens.get(token)
        if not token_data:
            raise ValueError("Invalid token")

        if time.time() > token_data["expiry"]:
            raise ValueError("Expired token")

        return True
