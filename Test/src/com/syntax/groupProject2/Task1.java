package com.syntax.groupProject2;

public class Task1 {
    /* Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimiter.
    Create 2 classes Circle & Square that implements functionality defined in the Shape Interface.
    Test your code.
     */
    public static void main(String[] args) {
        Square square=new Square();
        square.calculateArea(6);
        square.calculatePerimeter(6);

        Circle circle=new Circle();
        circle.calculateArea(5);
        circle.calculatePerimeter(5);
    }
}

interface Shape {
    void calculateArea(double input);
    void calculatePerimeter(double input);
}

class Circle implements Shape {
    @Override
    public void calculateArea(double input) {
        double area=Math.PI*Math.pow(input,2);
        System.out.println(area);
    }
    @Override
    public void calculatePerimeter(double input) {
        System.out.println(2*Math.PI*input);
    }
}
class Square implements Shape {
    @Override
    public void calculateArea(double input) {
        System.out.println(Math.pow(input,2));
    }
    @Override
    public void calculatePerimeter(double input) {
        System.out.println(4*input);
    }
}