package edu.guilford;

public class Crab extends Animal {
    
    //Constructor with parameters
    public Crab() {
        super("crab", "red", 8, 2.5, "click", true);
    }
    
    //Constructor
    public Crab(String type, String color, int legs, double size, String sound, boolean vegitarian) {
        super(type, color, legs, size, sound, vegitarian);
    }

    //override the type method
    @Override
    public String getType() {
        return "crab";
    }

    //override the color method
    @Override
    public String getColor() {
        return "red";
    }

    

}
