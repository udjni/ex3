package sample;

public class Square extends Rectangle {

    public Square() {}
    public Square(double side) {
        this.width = side;
        this.length = side;
    }
    public Square(double side, String color, boolean filled) {
        this.width = side;
        this.length = side;
        this.color = color;
        this.filled = filled;
    }
    public double getSide() {
        return this.width;
    }
    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }
    @Override
    public void setWidth(double width) {
        this.setSide(width);
    }
    @Override
    public void setLength(double length) {
        this.setSide(length);
    }
    @Override
    public String toString() {
        return "SQUARE'S INFO:\nWidth: " + this.width + "\nLength: " + this.length + "\nArea: " + this.getArea()
                + "\nPerimetr: " + this.getPerimeter();
    }
}
