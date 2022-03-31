package blood.donate.test;
import java.util.Scanner;

public class BloodBank {
    public void password(){
        Scanner sc=new Scanner(System.in);
        final String passcode="wrongpass";
        System.out.println("******YOU HAVE TO ENTERD PASWORD******");
        System.out.println("# Password is given by the Authority.\n\n");
        System.out.print("ENTER PASSWORD : ");
        String pass=sc.nextLine();
        if(pass.equals(passcode)){
            System.out.println("*** PASSWORD MATHCHED !!!");
        }
        else{
            System.out.println("Password Not Matched");
            System.out.println("*** ILLIGAL ENTRY ***");
            System.out.println("TRY AGAIN");
            password();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BloodBank obj=new BloodBank();
        obj.password();
    }
}
