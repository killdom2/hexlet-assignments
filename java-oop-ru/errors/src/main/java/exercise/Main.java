package exercise;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(new Point(2, 3), 5);
        App.printSquare(circle);
        Circle circle1 = new Circle(new Point(2, 3), -5);
        App.printSquare(circle1);
        Circle circle3 = new Circle(new Point(1, 2), -2);
        App.printSquare(circle3);
        Circle circle4 = new Circle(new Point(1, 2), 10);
        App.printSquare(circle4);
        
    }
}
