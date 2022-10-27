package abstractclassinterface.baitap;

public class Circle extends Geometry{
    @Override
    public double area() {
     return radius*radius*3.14;
    }

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
