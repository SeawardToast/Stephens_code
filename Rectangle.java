package com.company;

public class Rectangle {
    //private data members
    private double height;
    private double length;

    public Rectangle(){
    //set default values for no arg constructor
        this.length = 10;
        this.height = 5;
    }

    public Rectangle(double length, double height){
        this.length = length;
        this.height = height;
    }

    //this function returns the height to the user
    public double getHeight(){
        return this.height;
    }

    //this function returns length to the user
    public double getLength(){
        return this.length;
    }

    //this function sets height based off user input
    public void setHeight(double height){
        this.height = height;
    }

    //this function sets length based off user input
    public void setLength(double length){
        this.length = length;
    }

    //this function overrides the super method of the object class for system.out.println to return the value of toString
    @Override
    public String toString(){
        return "You just called the toString function of rectangle. The height of this rectangle is " + this.height + " and the length is " + this.length;
    }
}
