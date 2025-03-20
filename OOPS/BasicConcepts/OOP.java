package OOPS.BasicConcepts;

public class OOP {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        
        p1.setColor("yellow");
        System.out.println(p1.color);

        p1.setTip(5);
        System.out.println(p1.tip);

        p1.setColor("Blue");
        System.out.println(p1.color);

        p1.color = "Red";  //////////////   we can also do like that without calling function. but we dont want someone to change confidential information in main classs that is why we use acess modiefiers

    }
}

class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}
