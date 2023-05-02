package edu.guilford;

public class Animal implements Comparable<Animal>{
    
    //attributes
    private String color;
    private int legs;
    private double size;
    private String sound;
    private boolean vegitarian;

    //Constructor with parameters
    public Animal(String color, int legs, double size, String sound, boolean vegitarian) {
        super();
        this.color = color;
        this.legs = legs;
        this.size = size;
        this.sound = sound;
        this.vegitarian = vegitarian;
    }

    //constructor with random values
    public Animal(){
        //Choose random animal 
    }

    //getters and setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        if (legs > 0) {
            this.legs = legs;
        }
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        if (size > 0) {
            this.size = size;
        }
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        if (sound != null) {
            this.sound = sound;
        }
    }

    public boolean isVegitarian() {
        return vegitarian;
    }

    public void setVegitarian(boolean vegitarian) {
        this.vegitarian = vegitarian;
    }

    //toString 
    @Override
    public String toString() {
        return "Animal [color=" + color + ", legs=" + legs + ", size=" + size + ", sound=" + sound + ", vegitarian="
                + vegitarian + "]";
    }

    //Implement compareTo method that compares the sound of two animlas
    @Override
    public int compareTo(Animal other) {
        return this.sound.compareTo(other.sound);
    }

}
