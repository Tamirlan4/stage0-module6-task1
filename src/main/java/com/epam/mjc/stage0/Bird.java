package com.epam.mjc.stage0;

public class Bird extends Animal{
    public Bird() {
        super();
    }

    @Override
    public String getDescription() {
        String text = "This animal is mostly blue. It has 2 paws and no fur. Moreover, it has 2 wings and can fly.";
        return text;
    }
}
