package com.example.hin_th_danh_sch_cc_i_tng;
public class Landscape {
    String landimage;
    String landcation;

    public String getLandimage() {
        return landimage;
    }

    public void setLandimage(String landimage) {
        this.landimage = landimage;
    }

    public String getLandcation() {
        return landcation;
    }

    public void setLandcation(String landcation) {
        this.landcation = landcation;
    }

    public Landscape(String landimage, String landcation) {
        this.landimage = landimage;
        this.landcation = landcation;
    }

}
