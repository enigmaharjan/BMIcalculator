package com.example.bmicalculator;

public class Calculation {

    private Double BMI, height, weight;
    private Weight wt = new Weight();
    private Height ht = new Height();

    public Double calc() {
        height = ht.getHeight();
        weight = wt.getWeight();
        BMI = weight / (height*height);
        return BMI;
    }


}
