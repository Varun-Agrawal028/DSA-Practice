// package OOPS;

// public class Constructor {
//     public static void main(String args[]){
//         Student s1 = new Student();
//     }
// }


// class Student{
//     String name;
//     int roll;

//     Student(){
//         System.out.println("this constructor is called...");
//     }
// }









package OOPS.Constructors;

public class Constructor {
    public static void main(String args[]){
        Student s1 = new Student("Varun");
        System.out.println(s1.name);
    }
}


class Student{
    String name;
    int roll;

    Student(String name){
        this.name = name;
    }
}

