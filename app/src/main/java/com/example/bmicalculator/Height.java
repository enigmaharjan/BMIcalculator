package com.example.bmicalculator;

public class Height {
    private Double height;

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        Double mHeight = height/100;
        this.height = mHeight;
    }
}
