package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public Animal() {

    }


    public String getDescription(){
        String p;
        String f;
        if(numberOfPaws > 1){
            p = "paws";
        }else {
            p = "paw";
        }
        if(hasFur == false){
            f = "no";
        }else {
            f = "a";
        }
        String text = ("This animal is mostly " + "" + color + "." + " It has " + "" + numberOfPaws + " " + p + " " + "and " + f + " fur.");
        return text;
    }
}
