package Java8.Shape;
public class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape[color = " + this.color + "]";
    }

    public double getArea() {
        System.err.println("Shape unknown! Can compute area!");
        return 0;
    }
}