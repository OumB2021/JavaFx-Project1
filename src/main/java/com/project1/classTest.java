package com.project1;
//import java.awt.Color;
import java.util.Random;

public class classTest {
    public static void main(String[] args) {

        Random rand = new Random();
        MyColor[] myColors = MyColor.getColors();
        int randomNum = rand.nextInt(myColors.length);
        MyColor color = myColors[randomNum];

        MyPoint p1 = new MyPoint(2,2,null);
        MyOval oval = new MyOval(10,20, p1, color);
        System.out.println(oval);
        System.out.println("-------------------------------------");
        MyRectangle rec = new MyRectangle(10, 20, p1, color);
        System.out.println(rec);
    }

} //end of classTest
