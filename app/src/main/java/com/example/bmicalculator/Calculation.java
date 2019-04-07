package com.example.bmicalculator;

public class Calculation {

    private Double BMI, height, weight;

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        double mheight = height/100;
        this.height = mheight;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double calculate() {
        BMI = weight / (height*height);
        return BMI;
    }


}
