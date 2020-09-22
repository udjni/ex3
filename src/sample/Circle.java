package sample;

import java.lang.Math;

public class Circle extends Shape {

    protected double radius;
    public Circle() {}
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }
    public double getRadius() {
        return this.radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.radius,2);
    }
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }
    @Override
    public String toString() {
        return "CIRCLE'S INFO:\nRadius: " + this.radius + "\nArea: " + this.getArea() + "\nCircumference: " + this.getPerimeter();
    }

}
