package com.company;

import java.util.ArrayList;

//Write a Java program to create a new array list, add some colors (string) and print out the collection
public class Main {

    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        //adding objects
        colors.add("white");
        colors.add("yellow");
        colors.add("brown");
        colors.add("magenta");
        
        for(String color : colors){
            System.out.println(color);
        }
        //removing objects
        colors.remove(3);
        colors.remove(0);
        for(String color : colors){
            System.out.println(color);
        }
    }
}
