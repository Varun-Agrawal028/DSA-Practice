package OOPS.Constructors;

public class CopyConstructor {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "varun";
        s1.roll = 516;
        s1.password = "abc";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        // ✅ Using Copy Constructor
        Student s2 = new Student(s1);
        s2.password = "xyz";

        // Print marks of s2
        System.out.println("Marks of s2:");
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }

        // Modify s2's marks to test deep copy
        s2.marks[0] = 50;

        // ✅ Print s1's marks to check if it remains unchanged
        System.out.println("Marks of s1 after modifying s2:");
        for (int i = 0; i < 3; i++) {
            System.out.println(s1.marks[i]);
        }
    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];

    Student() {
        marks = new int[3];  // Initialize array
        System.out.println("this constructor is called...");
    }

    // ✅ Fixed Copy Constructor (Deep Copy)
    Student(Student s1) {
        marks = new int[3]; // Allocate a new array
        this.name = s1.name;
        this.roll = s1.roll;

        // Deep copy of marks array
        for (int i = 0; i < 3; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    Student(String name) {
        marks = new int[3];
        this.name = name;
    }

    Student(int roll) {
        marks = new int[3];
        this.roll = roll;
    }
}
