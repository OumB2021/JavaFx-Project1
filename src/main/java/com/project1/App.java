package com.project1;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import java.io.IOException;

public class App extends Application {

    @Override
    public void start(Stage PS) throws IOException {

        Canvas canvas = new Canvas(800, 800);
        GraphicsContext graphicContext = canvas.getGraphicsContext2D();
        
        double xValue, yValue;
        xValue = 600;
        yValue = 600;
        MyPoint referencePoint = new MyPoint(100, 75, null);
        
        MyShape shape = new MyShape(referencePoint, MyColor.CORNSILK);
        shape.draw(graphicContext);

        MyOval oval = Oval(graphicContext, referencePoint, xValue, yValue, MyColor.LIGHTSALMON);
        MyRectangle rect = rect(graphicContext, oval.getA(), oval.getB(), referencePoint, MyColor.DODGERBLUE);  
        oval = Oval(graphicContext, rect.Tlc, rect.getWidth(), rect.getHeight(), MyColor.YELLOW);     
        rect = rect(graphicContext, oval.getA(), oval.getB(), oval.p , MyColor.LIMEGREEN);
        oval = Oval(graphicContext, rect.Tlc, rect.getWidth(), rect.getHeight(), MyColor.IVORY);  

        Pane P = new Pane();
        P.getChildren().add(canvas);
        Scene newScene = new Scene(P);
        PS.setTitle("Project1");
        PS.setScene(newScene);
        PS.show();
    }

    public MyOval Oval(GraphicsContext GC, MyPoint p, double A, double B, MyColor color){
        MyOval oval= new MyOval(A, B, p, color);
        oval.Stroke(GC);
        oval.draw(GC);
        return oval;
    }

    //Returns a draws a MyRectangle object that fits inside the MyOval shape.
    public MyRectangle rect(GraphicsContext GC, double X, double Y, MyPoint ovalPoint, MyColor color){

        double width = Math.sqrt(2)*X/2;
        double height = Math.sqrt(2)*Y/2;

        double CoordinateX = (X-width)/2;
        double CoordinateY = (Y-height)/2;
        
        MyPoint point = new MyPoint(CoordinateX + ovalPoint.x, CoordinateY + ovalPoint.y, null);
        MyRectangle rectangle = new MyRectangle(height, width, point, color);

        rectangle.draw(GC);
        rectangle.Stroke(GC);

        return rectangle;
    }

    public static void main(String[] args) {
        launch();
    }

}