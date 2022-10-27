package abstractclassinterface.baitap;

public class Square extends Geometry{
    @Override
    public double area() {
        return size*size;
    }

    private double size;

    public Square(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
}
