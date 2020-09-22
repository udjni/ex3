package sample;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle(6);
        System.out.println(circle);

        circle.setColor("violet");
        circle.setFilled(true);

        System.out.println("\n" + circle);

        Rectangle rect = new Rectangle(2,5,"yellow",false);
        System.out.println("\n" + rect);

        Square square = new Square(4,"blue",true);
        System.out.println("\n" + square);

        Rectangle evenRect = new Square(6,"green",false);
        System.out.println("\n" + evenRect);

        Shape shapeCircle = new Circle(2,"black",false);
        Shape shapeRectangle = new Rectangle(1,1,"aqua", true);
        Shape shapeSquare = new Square(5,"pink",true);

        System.out.println("\n" +shapeCircle);
        System.out.println("\n" + shapeRectangle);
        System.out.println("\n" + shapeSquare);

    }

}
