package com.project1;

import javafx.scene.canvas.*;

public class MyOval extends MyShape{
    
    //variables 
    double a, b;            //major and minor axis of the oval
    MyPoint center;         //Top left corner point of the oval

    //constructors
    MyOval(double a, double b, MyPoint center, MyColor color){
        super(center, color);     //calls the super class constructor
        this.center = center;     //sets the center of the oval
        this.a = a;
        this.b = b;                                         
    }


    //Getters
    public double getX(){return center.getXCoordinate();}           //returns top left corner point x coordinate
    public double getY(){return center.getYCoordinate();}           //returns top left corner point y coordinate
    public double getA(){return a;}                                 //returns the absissa of the oval
    public double getB(){return b;}                                 //returns the abscissa axis of the oval
    public double getMajorAxis(){return Math.max(this.a, this.b);}  //returns major axis
    public double getMinorAxis(){return Math.min(this.a, this.b);}; //returns minor axis
     
     //returns the perimeter of the oval
     @Override
     public double perimeter() {return 2 * Math.PI * Math.sqrt(((a * a) + (b * b)) / 2);}   

     //returns the perimeter of the oval
     @Override 
     public double area() {return 2 * a * b; }                           

     @Override
     public String toString(){
        return "Oval center X coordinate: " + center.getXCoordinate() +
               "\nOval center Y coordinate: " + center.getYCoordinate() +
               "\nOval major axis: " + getMajorAxis() +
               "\nOval minor axis: " + getMinorAxis() +
               "\nOval perimeter: " + perimeter() +
               "\nOval Area: " + area();       
    }

    @Override
    public void Stroke(GraphicsContext GC){
        GC.setStroke(color.getJavaFXColor());
        GC.strokeOval(center.getXCoordinate(), center.getYCoordinate(), a, b);
    }

    @Override
    public void draw(GraphicsContext GC){
        GC.setFill(color.getJavaFXColor());
        GC.fillOval(center.getXCoordinate(),center.getYCoordinate(),a, b);
    }

 } // end of the class MyOval
