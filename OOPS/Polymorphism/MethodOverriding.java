//////// Run time Polymorphism ( Dynamic polymorphism) 

package OOPS.Polymorphism;

class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() { // Overriding the method
        System.out.println("Dog barks");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.makeSound(); // Output: Animal makes a sound

        Dog myDog = new Dog();
        myDog.makeSound(); // Output: Dog barks

        Animal anotherDog = new Dog(); // Polymorphism
        anotherDog.makeSound(); // Output: Dog barks (Runtime Polymorphism)
    }
}



//////////////// Another Example /////////////////////////


// package Polymorphism;

// public class MethodOverriding {
//     public static void main(String[] args) {
//         Deer d = new Deer();
//         d.eat();

//         Animal a = new Animal();
//         a.eat();
//     }
// }


// class Animal{
//     void eat(){
//         System.out.println("eat something");
//     }
// }

// class Deer extends Animal{
//     void eat(){
//         System.out.println("eats grass");
//     }
// }