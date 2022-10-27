package abstractclassinterface.baitap;
public class ResizeableTest {

    public static void main(String[] args) {
        Geometry[] geometry =new Geometry[3];
        geometry[0]= new Circle(3);
        geometry[1]=new Rectangle(4,5);
        geometry[2]=new Square(6);
        System.out.println("Before random:");
        for(Geometry p:geometry){
            System.out.println(p.area());
        }
        System.out.println("After random:");
        for(Geometry p:geometry){
            System.out.println(p.area()*Math.random()*100+1);
        }
        for(Geometry p:geometry){
            if(p instanceof Square){
                ((Square) p).howToColor();
            };
    }
}}
