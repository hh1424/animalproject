package edu.guilford;

import java.util.Arrays;

public class AnimalScene 
{
    public static void main( String[] args )
    {
        //Create a cheeta object
        Cheeta cheeta = new Cheeta();
        System.out.println(cheeta);
        //Create a horse object
        Snake snake = new Snake();
        System.out.println(snake);
        //Create a crab object
        Crab crab = new Crab();
        System.out.println(crab + "\n");

        Animal[] animals = new Animal[5];
        for(int i = 0; i < animals.length; i++) {
            animals[i] = new Animal();
        }
        //print out the array of Animal objects
        for(int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);
        }
        //Sort the array using the selectionSort
        Animal.selectionSort(animals);

        System.out.println("\nAfter sorting: ");
        //print out the array of Animal objects
        for(int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);
        }

        Animal.sortOrder = Animal.SortOrder.REVERSE;
        Arrays.sort(animals);

        System.out.println("\nSort Reversed: ");
        //print out the array of Animal objects
        for(int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);
        }
    }
}
