package com.project1;
import javafx.scene.canvas.GraphicsContext;

public class MyRectangle extends MyShape{
   
    //Variables 
    double w;    //The width of the rectangle
    double h;    //The height of the rectangle
    MyPoint Tlc; //Top left corner point

    //Constructors
    MyRectangle(double h, double w, MyPoint Tlc, MyColor color){
        super(Tlc, color);
        this.Tlc = Tlc; 
        this.h= h;
        this.w= w; 
    }

    //Getters 
    public MyPoint getP(){return this.p;}                      //returns the top left corner point
    public double getWidth(){return w;}                        //returns the the width of the rectangle
    public double getHeight(){return h;}                       //returns the height of the rectangle

    //Overriden methods
    @Override
    public double perimeter(){return (2 * w * h);}              //returns the perimeter of the rectangle

    @Override
    public double area(){return (w * h);}                      //returns the area of the rectangle

    @Override
    public String toString(){
        return "Rectangle top left corner X coordinate: " + Tlc. getXCoordinate()+
               "\nRectangle top left corner Y coordinate: " + Tlc.getYCoordinate() +
               "\nOval perimeter: " + perimeter() +
               "\nOval Area: " + area();
    }

    @Override
    public void Stroke(GraphicsContext GC){
        GC.setStroke(color.getJavaFXColor());
        GC.strokeRect(this.p.getXCoordinate(), this.p.getYCoordinate(), w,h);
    }

    @Override
    public void draw(GraphicsContext GC){
        GC.setFill(color.getJavaFXColor());
        GC.fillRect(this.p.getXCoordinate(), this.p.getYCoordinate(), w,h);
    }

} // end of the class MyRectangle
