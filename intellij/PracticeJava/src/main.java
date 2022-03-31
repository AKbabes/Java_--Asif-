import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Encapsulation obj=new Encapsulation();
        System.out.println("Enter Name : ");
        String n=sc.nextLine();
        obj.setName(n);
        System.out.println("Name is : "+obj.getName());
        System.out.println("Enter to set another name : ");
        String n2=sc.nextLine();
        obj.setName(n2);
        System.out.println("New name = "+obj.getName());

    }
}
