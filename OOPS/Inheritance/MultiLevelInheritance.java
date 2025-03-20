package OOPS.Inheritance;

public class MultiLevelInheritance {
    public static void main(String args[]){
        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 2;
        System.out.println(dobby.legs);
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
    int legs;
}

class Dog extends Mammal{
    String breed;
}