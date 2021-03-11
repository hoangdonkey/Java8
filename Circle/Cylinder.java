package Java8.Circle;
public class Cylinder extends Circle {
    private double height;

    public Cylinder(double height, double radius) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public double getVolume() {
        return super.getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder[height = " + this.height + ", " + super.toString() + "]";
    }
}