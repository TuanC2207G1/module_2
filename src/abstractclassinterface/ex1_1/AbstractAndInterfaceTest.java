package abstractclassinterface.ex1_1;

public class AbstractAndInterfaceTest {
    public static void main(String[] args) {
        Animal[] animals =new Animal[2];
        animals[0]=new Tiger();
        animals[1]=new Chicken();
        for(Animal p:animals) {
            System.out.println(p.makeSound());

            if (p instanceof Chicken) {
            Edible edible=(Chicken) p;
            System.out.println(((Chicken) p).howToEat());
            }
        }
        Fruit[] fruit=new Fruit[2];
        fruit[0]=new Apple();
        fruit[1]=new Orange();
        for(Fruit p: fruit){
            System.out.println(p.howToEat());
        }
    }
}
