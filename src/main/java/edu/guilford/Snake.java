package edu.guilford;

public class Snake extends Animal{
   //Constructor with parameters
    public Snake() {
        super("snake", "green", 0, 2.5, "hiss", true);
    } 
    
    //Constructor
    public Snake(String type, String color, int legs, double size, String sound, boolean vegitarian) {
        super(type, color, legs, size, sound, vegitarian);
    }

    //override the type method
    @Override
    public String getType() {
        return "snake";
    }

    //override the sound method
    @Override
    public String getSound() {
        return "hiss";
    }
}
