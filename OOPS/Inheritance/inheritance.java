package OOPS.Inheritance;

public class inheritance {
    public static void main(String args[]){
        Fish shark = new Fish();
        shark.eat();
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

//Derived class
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("swims in water");
    }
}
