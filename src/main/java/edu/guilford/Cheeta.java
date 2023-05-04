package edu.guilford;

public class Cheeta extends Animal{

    //Constructor
    public Cheeta(String type, String color, int legs, double size, String sound, boolean vegitarian) {
        super(type, color, legs, size, sound, vegitarian);
    }

    //Constructor with parameters
    public Cheeta() {
        // super("cheeta", "yellow", 4, 2.5, "meow", true);
    }

    //override the vegitarian method
    @Override
    public boolean isVegitarian() {
        return false;
    }

    //implement the compareTo method
    @Override
    public int compareTo(Animal other) {
        return this.getSound().compareTo(other.getSound());
    } 

}
