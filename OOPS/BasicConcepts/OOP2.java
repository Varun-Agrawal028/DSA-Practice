package OOPS.BasicConcepts;

public class OOP2 {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();

        myAcc.username = "va8641";
        // myAcc.password = "dfdfdf";   /// now this will throw error as we cant directly change password in the main function due to private acess modifiers
        
        myAcc.setPassword("dfdfdf");

        System.out.println(myAcc.username);
        // System.out.println(myAcc.password);   //// i also can not now print the password due to private acess modifier

        myAcc.printPassword();
    }
}

class BankAccount{
    String username;
    private String password;

    public void setPassword(String pwd){
        password = pwd;
    }

    public void printPassword(){   ///////// creating a function to print the password
        System.out.println("The password is : " + password);
    }
}