package OOPS.Inheritance;

public class HierarchicalInheritance {
    public static void main(String args[]){
        Mammal human = new Mammal();
        Fish shark = new Fish();
        Bird crow = new Bird();
        
        human.eat();
        human.breathe();
        human.walk();

        System.out.println();

        shark.eat();
        shark.breathe();
        shark.swim();

        System.out.println();

        crow.eat();
        crow.breathe();
        crow.fly();
    }
}
//Base class
class Animal{

    String skinColour;

    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathes");
    }
}

class Mammal extends Animal{
    void walk(){
        System.out.println("walks...");
    }
}

class Fish extends Animal{
    void swim(){
        System.out.println("swims...");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("flies...");
    }
}