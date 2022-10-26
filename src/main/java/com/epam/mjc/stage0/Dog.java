package com.epam.mjc.stage0;

public class Dog extends Animal{
    private String color = "brown";
    private int numberOfPaws = 4;
    private boolean hasFur = true;
    public Dog(){
        super();
    }
    @Override
    public String getDescription() {
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
