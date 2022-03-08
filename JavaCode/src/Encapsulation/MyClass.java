
package Encapsulation;
import java.util.Scanner;

public class MyClass {

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        Encapsulation obj1=new Encapsulation();
        System.out.println("Enetr your name = ");
        String name=sc.nextLine();
        obj1.setName(name);
        System.out.println("Enter your Age = ");
        int age=sc.nextInt();
        obj1.setAge(age);
        System.out.println("\nDetails...\nName = "+obj1.getName()+"\nAge = "+obj1.getAge());
    }
}
