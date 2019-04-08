package com.example.bmicalculator;

public class Calculation {

    private float BMI;
    private Double height;
    private Double weight;

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

    public float calculate() {
        BMI = (float) (weight / (height*height));
        float a = BMI;
        return  BMI;
    }


}
