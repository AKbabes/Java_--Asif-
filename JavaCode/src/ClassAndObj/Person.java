
package ClassAndObj;

import java.util.Scanner;

public class Person {

    String name;
    int age;
    double height;
    
    public static void Input(){
        Person obj=new Person();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr details about person : ");
        System.out.println("Enetr person's name : ");
        obj.name = sc.nextLine();
        System.out.println("Enter person's age : ");
        obj.age = sc.nextInt();
        System.out.println("Enter Height : ");
        obj.height = sc.nextFloat();
        
    }
    
    public void Output(){
        
        System.out.println("Details about first person : ");
        System.out.println("Nmae = " + name + "\nAge = " + age );
        System.out.printf("Height = %.1f",height);
    }

    public static void main(String[] args) {
        Person details = new Person();
        //Input p1=new Input();
       
        Input();

        
        
        
        Person dt2 = new Person();
        dt2.Input();
//        System.out.println("Enetr details about second person : ");
//        System.out.println("Enetr person's name : ");
//        dt2.name = sc.nextLine();
//        System.out.println("Enter person's age : ");
//        dt2.age = sc.nextInt();
//        System.out.println("Enter Height : ");
//        dt2.height = sc.nextFloat();

        details.Output();
        dt2.Output();

//        System.out.println("Details about second person : ");
//        System.out.println("Nmae = " + dt2.name + "\nAge = " + dt2.age + "\nHeight = " + dt2.height);
    }
}
