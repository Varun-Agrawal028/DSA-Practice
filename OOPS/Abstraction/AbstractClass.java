 package OOPS.Abstraction;

// public class AbstractClass {
//     public static void main(String[] args) {
//         Vehicle myCar = new Car();
//         myCar.start(); // Output: Car is starting with key ignition.
//         myCar.stop();  // Output: Vehicle stopped.
//     }
// }



// // Abstract Class
// abstract class Vehicle {
//     abstract void start(); // Abstract Method (No body)

//     void stop() { // Concrete Method (Has body)
//         System.out.println("Vehicle stopped.");
//     }
// }

// // Subclass (Concrete Class)
// class Car extends Vehicle {
//     @Override
//     void start() { // Providing implementation for abstract method
//         System.out.println("Car is starting with key ignition.");
//     }
// }


///////////// another example ////////////////////////////


public class AbstractClass{
    public static void main(String args[]){
        Horse h = new Horse();
        System.out.print("Horse ");
        h.eats();
        h.walks();
        System.out.println(h.skinColor);
        h.changeColor();
        System.out.println(h.skinColor);
        
        System.out.println();

        Chicken c = new Chicken();
        System.out.print("Chicken eats ");
        c.eats();
        c.walks();
        c.changeColor("Yellow");
        System.out.println(c.skinColor);
    }
}

// abstract class - implementing abstraction
abstract class Animal{
    String skinColor;
    // creating constructor for animal class - coz it can not have object
    Animal(){
        skinColor = "brown";
    }
    // non abstract method
    void eats(){
        System.out.println("eats");
    }
    
    // abstract method
    // implementation is not defined - sub class will gave the implementation 
    abstract void walks();
}

class Horse extends Animal{
    void walks(){
        System.out.println("Horse walks on 4 legs");
    }
    // fun to change horse color - by default horse color will be brown
    void changeColor(){
        skinColor = "Dark Brown";
    }
}

class Chicken extends Animal{
    void walks(){
        System.out.println("Chicken walks on 2 legs");
    }

    void changeColor(String color){
        skinColor = color;
    }
}