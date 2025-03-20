package OOPS.Abstraction;

public class Interfaces {
    public static void main(String args[]){
        Queen q = new Queen();
        q.moves();
    }
}

interface chessPlayer{
    void moves();
}

class Queen implements chessPlayer{
    public void moves(){
        System.out.println(" Queen Can move in all directions - up, down, left, right, diagonal");
    }
}

class Rook implements chessPlayer{
    public void moves(){
        System.out.println(" Rook Can move only horizontally or vertically");
    }
}

class King implements chessPlayer{
    // methods needs to be public
    public void moves(){
        System.out.println("King can move in all direction by 1 step at a time");
    }
}

//////////////// another example //////////////////////



// // Defining an Interface
// interface Animal {
//     void eat();  // Abstract method (no implementation)
//     void walk();
// }

// // Implementing the Interface in a Class
// class Dog implements Animal {
//     public void eat() {  // Must be public
//         System.out.println("Dog eats bones.");
//     }

//     public void walk() {
//         System.out.println("Dog walks on 4 legs.");
//     }
// }

// public class InterfaceExample {
//     public static void main(String[] args) {
//         Dog myDog = new Dog();
//         myDog.eat();   // Output: Dog eats bones.
//         myDog.walk();  // Output: Dog walks on 4 legs.
//     }
// }
