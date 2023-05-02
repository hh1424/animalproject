package edu.guilford;

public class Crab extends Animal {
    //Constructor
    public Crab(String type, String color, int legs, double size, String sound, boolean vegitarian) {
        super(type, color, legs, size, sound, vegitarian);
    }

    //Constructor with parameters
    public Crab() {
        super("crab", "red", 8, 2.5, "click", true);
    }

    //implement the compareTo method
    @Override
    public int compareTo(Animal other) {
        return this.getSound().compareTo(other.getSound());
    }

}
