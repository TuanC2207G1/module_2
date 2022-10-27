package accessmodifier.com.codegym;

public class Car {
    private String name;
    private String engine;
    public static int numberOfCar;
    public Car(String n, String e){
        this.name=n;
        this.engine=e;
        numberOfCar++;
    }
}
