package com.nevzorov.dev;

public class Person  {
    public  String name;
    protected int old, height, weight, girth;
    public Person (String name, int old, int height, int weight, int girth) {
        this.name = name;
        this.old = old;
        this.height = height;
        this.weight = weight;
        this.girth = girth;
    }
    public void printPerson (){
        System.out.println("I'm Person. My name is: " + name);
        System.out.println("My old is: " + old);
        System.out.println("My height is: " + height);
        System.out.println("My weight is: " + weight);
        System.out.println("My girth is: " + girth);
    }
}
