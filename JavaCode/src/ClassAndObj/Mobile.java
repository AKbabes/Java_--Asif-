package ClassAndObj;
import java.util.Scanner;

public class Mobile {
    
    String brand;
    int ram;
    int storage;
    int price;
    
    public void Input(){
        Scanner sc=new Scanner (System.in);
        
        System.out.println("Mobile Brand name : ");
        brand=sc.nextLine();
        System.out.println("Enter RAM (GB) : ");
        ram=sc.nextInt();
        System.out.println("Enter storage : ");
        storage=sc.nextInt();
        System.out.println("Enter price (BDT)");
        price=sc.nextInt();
        
    }
    
    public void Output(){
        System.out.println("Brand Name : "+brand+"\nRam : "+ram+"GB\nStorage : "+storage+"GB\nPrice : "+price+"/= taka");
        
    }
    
    
    public static void main(String [] args){
       
        Mobile M1=new Mobile();
        System.out.println("Specifications about first smart phone : ");
        M1.Input();
        
        Mobile M2=new Mobile();
        System.out.println("Specifications about second smart phone : ");
        M2.Input();
        
        Mobile M3=new Mobile();
        System.out.println("Specifications about third smart phone : ");
        M3.Input();
        
        System.out.println("\nFirst phone details : ");
        M1.Output();
        System.out.println("\nSecond phone details : ");
        M2.Output();
        System.out.println("\nThird phone details : ");
        M3.Output();
    }
    
}
