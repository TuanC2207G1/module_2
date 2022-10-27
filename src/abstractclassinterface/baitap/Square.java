package abstractclassinterface.baitap;

public class Square extends Geometry implements Colorable{
    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }

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
