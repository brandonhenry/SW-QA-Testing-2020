package com.sw.a3;

public enum BMI {
    UNDERWEIGHT("Underweight"),
    NORMAL("Normal Weight"),
    OVERWEIGHT("Overweight"),
    OBESE("Obese");

    String name;
    BMI(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
