package edu.guilford;

public class Snake extends Animal{
    //Constructor
    public Snake(String type, String color, int legs, double size, String sound, boolean vegitarian) {
        super(type, color, legs, size, sound, vegitarian);
    }

    //Constructor with parameters
    public Snake() {
        // super("snake", "green", 0, 2.5, "hiss", true);
    }

    //override the sound method
    @Override
    public String getSound() {
        return "hiss";
    }

    //implement the compareTo method
    @Override
    public int compareTo(Animal other) {
        return this.getSound().compareTo(other.getSound());
    }
}
