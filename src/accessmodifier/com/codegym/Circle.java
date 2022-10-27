package accessmodifier.com.codegym;

public class Circle {
    private double circle =1.0;
    private String color ="red";
    Circle(){}
    Circle(double circle){
        this.circle=circle;
    }
    public double GetRadius(){
        return circle*2*3.14;
    }
    public double GetArea(){
        return circle*circle*3.14;
    }
}
