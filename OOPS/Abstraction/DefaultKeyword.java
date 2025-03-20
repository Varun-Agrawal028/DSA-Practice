package OOPS.Abstraction;

interface Animal {
    void eat(); // Abstract method

    // Default method (has implementation)
    default void sleep() {
        System.out.println("Animals sleep.");
    }
}

// Implementing class
class Dog implements Animal {
    public void eat() {
        System.out.println("Dog eats food.");
    }
}

public class DefaultKeyword {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();   // Output: Dog eats food.
        myDog.sleep(); // Output: Animals sleep. (inherited default method)
    }
}

