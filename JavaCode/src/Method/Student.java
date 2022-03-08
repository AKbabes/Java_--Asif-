package Method;
import java.util.Scanner;

public class Student {
    static String name;
    static int code;
    static double price;
    static String brand;
    
    public void Insert(String a, int b, double c, String d){
        a = name;
        b = code;
        c = price;
        d = brand;
}
    
    public void Display(){
        System.out.println("\nName = "+name+"\nCode = "+code+"\nPrice = "+price+"\nBrand = "+brand);
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enetr how many details you want to insert : ");
        int n=sc.nextInt();
        
        Student [] ss=new Student[n];
        int i;
        for( i=0;i<n;i++){
        System.out.println("Enter details about person : "+(i+1));
        
        ss [i] = new Student();
        sc.nextLine();
        System.out.print("\nEnter name : ");
        name=sc.nextLine();
        System.out.print("\nEnter code : ");
        code=sc.nextInt();
        System.out.print("\nEnter price : ");
        price=sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter brand name : ");
        brand=sc.nextLine();
        
        ss[i].Insert(name,code,price,brand);
        ss[i].Display();
       }
        
        
        
//      //  s1.Insert(name1, code1, price1, brand1);
////        Student s2=new Student();
////        System.out.println("\nEnter details about second student : ");
//        
//        System.out.println("First student details : ");
//        s1.Display();
//        
////        System.out.println("Second student details : ");
////        s2.Display();
    }
}
