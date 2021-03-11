package Java8.Shape;
public class Triangle extends Shape {
    private int base, heigth;

    public Triangle(String color, int base, int heigth) {
        super(color);
        this.base = base;
        this.heigth = heigth;
    }

    @Override
    public String toString() {
        return "Triangle[base = " + this.base + ", heigth = " + this.heigth + ", " + super.toString() + "]";
    }

    @Override
    public double getArea() {
        return 0.5 * base * heigth;
    }
}