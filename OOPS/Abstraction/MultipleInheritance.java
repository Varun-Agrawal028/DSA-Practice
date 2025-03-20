package OOPS.Abstraction;

public class MultipleInheritance {
    public static void main(String[] args) {
        Bear b1 = new Bear();
        b1.eatsMeat();
        b1.eatsGrass();
    }
}

interface Carnivore{
    void eatsMeat();
}

interface Herbivore{
    void eatsGrass();
}

class Bear implements Carnivore, Herbivore{
    public void eatsMeat(){
        System.out.println("Bear eats Meat");
    }

    public void eatsGrass(){
        System.out.println("Bear eats Grass");
    }
}




////////////////// another example of multiple inheritance ////////////////////////




// // Interface 1
// interface Animal {
//     void eat();
// }

// // Interface 2
// interface Pet {
//     void play();
// }

// // Class implementing multiple interfaces
// class Dog implements Animal, Pet {
//     public void eat() {
//         System.out.println("Dog eats.");
//     }

//     public void play() {
//         System.out.println("Dog plays fetch.");
//     }
// }

// public class MultipleInterfaceExample {
//     public static void main(String[] args) {
//         Dog myDog = new Dog();
//         myDog.eat();  // Output: Dog eats.
//         myDog.play(); // Output: Dog plays fetch.
//     }
// }
