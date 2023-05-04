package edu.guilford;

public class Cheeta extends Animal{

    //Constructor with parameters
    public Cheeta() {
        super("cheeta", "yellow", 4, 2.5, "meow", true);
    }

    //Constructor
    public Cheeta(String type, String color, int legs, double size, String sound, boolean vegitarian) {
        super(type, color, legs, size, sound, vegitarian);
    }

    //override the type method
    @Override
    public String getType() {
        return "cheeta";
    }

    //override the vegitarian method
    @Override
    public boolean isVegitarian() {
        return false;
    }

}
