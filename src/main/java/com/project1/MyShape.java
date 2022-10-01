package com.project1;
import java.util.Optional;
import javafx.scene.canvas.GraphicsContext;

public class MyShape{

    //Variables
    MyPoint p;                //Point of the javas display coordinate system
    MyColor color;            //Color of the shape

    //Constructors
    MyShape(MyPoint p, MyColor shapeColor){
        setPoint(p);
        setColor(shapeColor);
    }

    MyShape(int x, int y, MyColor shapeColor){
        setPoint(x,y);
        setColor(shapeColor);
    }

    //Setters
    public void setPoint(MyPoint p) { this.p = p; }            //sets the point p
    public void setPoint(int x, int y) { p.setPoint(x, y); }   //assigns x and y as the point's coordinates
    
    public void setColor(MyColor shapeColor){
        //default color of the shape is Black unless choser otherwise by the user
        this.color = Optional.ofNullable(shapeColor).orElse(MyColor.BLACK);
    }

    //Getters 
    public MyPoint getPoint() {return p;}                        //returns the point
    public MyColor getShapeColor() {return color;}               //returns the color of the shape
    public double getXCoordinate(){return p.getXCoordinate();}   //returns the x coordinate of the point
    public double getYCoordinate(){return p.getYCoordinate();}   //returns the y coordinate of the point

    public double area(){return 0;}                   //returns the area of the shape
    public double perimeter(){return 0;}              //returns the perimeter of the shape

    public void Stroke(GraphicsContext GC){
        GC.setStroke(color.getJavaFXColor());
        GC.strokeRect(0, 0, GC.getCanvas().getWidth(), GC.getCanvas().getHeight());
    } 

    public void draw(GraphicsContext GC){
        GC.setFill(color.getJavaFXColor());
        GC.fillRect(0, 0, GC.getCanvas().getWidth(), GC.getCanvas().getHeight());
    } 

    @Override
    public String toString() { return "This is My Shape"; }  //Object's description
    
} // end of the class MyShape



