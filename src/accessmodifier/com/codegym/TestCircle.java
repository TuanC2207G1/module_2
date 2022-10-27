package accessmodifier.com.codegym;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle(4);
        System.out.println(circle1.GetArea());
        Circle circle2 = new Circle(12);
        System.out.println(circle2.GetRadius());
    }
}
