package OOPS.Abstraction;

// super to Call Parent Constructor

// If a subclass constructor needs to call the parent constructor, use super().

class Animal {
    Animal() {
        System.out.println("Animal constructor called.");
    }
}

class Dog extends Animal {
    Dog() {
        super(); // Calls Animal() constructor
        System.out.println("Dog constructor called.");
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Dog myDog = new Dog();
    }
}



// super to Call Parent Method
// If a subclass overrides a method but still needs the parent method, use super.methodName().



// class Animal {
//     void makeSound() {
//         System.out.println("Animal makes a sound.");
//     }
// }

// class Dog extends Animal {
//     void makeSound() {
//         super.makeSound(); // Calls Animal's method
//         System.out.println("Dog barks.");
//     }
// }

// public class SuperMethodExample {
//     public static void main(String[] args) {
//         Dog myDog = new Dog();
//         myDog.makeSound();
//     }
// }






// super to Access Parent Variables
// If a subclass has a variable with the same name as the parent class, use super.variableName to refer to the parent class variable.


// class Animal {
//     String color = "Brown";
// }

// class Dog extends Animal {
//     String color = "Black";

//     void printColor() {
//         System.out.println("Dog's color: " + color); // Child class variable
//         System.out.println("Animal's color: " + super.color); // Parent class variable
//     }
// }

// public class SuperVariableExample {
//     public static void main(String[] args) {
//         Dog myDog = new Dog();
//         myDog.printColor();
//     }
// }


