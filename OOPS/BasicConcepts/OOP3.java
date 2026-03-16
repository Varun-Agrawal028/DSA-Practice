package OOPS.BasicConcepts;

public class OOP3 {
    public static void main(String args[]) {
        Student s1 = new Student();
        Student s2 = new Student("Varun");
        Student s3 = new Student(516);
        Student s4 = new Student("Lavish", 527);
        
        System.out.println(s1.name);
        System.out.println(s1.rollno);
        System.out.println();
        
        System.out.println(s2.getName());
        System.out.println(s2.getRollno());
        System.out.println();
        
        System.out.println(s3.getName());
        System.out.println(s3.getRollno());
        System.out.println();
        
        System.out.println(s4.getName());
        System.out.println(s4.getRollno());
    }
}

class Student {
    String name;
    int rollno;
    
    Student() {
        System.out.println("Constructor is called");
    }
    
    Student(String name) {
        this.name = name;
    }
    
    Student(int rollno) {
        this.rollno = rollno;
    }
    
    Student(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }
    
    String getName() {
        return name;
    }
    
    int getRollno() {
        return rollno;
    }
}
