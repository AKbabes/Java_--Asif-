package arraylist;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab6_Person {
    private String name;
    private int age;
    
    public Lab6_Person(String name,int age){
       this.name=name;
       this.age=age;
    }
    public void Display(){
        System.out.println("Name = "+this.name+"\nAge = "+this.age);
    
}
    public static void main(String[] args) {
        Lab6_Person obj1=new Lab6_Person("Asif",21);
        Lab6_Person obj2=new Lab6_Person("Nafi",78);
        
        
        ArrayList<Lab6_Person> li=new ArrayList<Lab6_Person>();
        
        li.add(obj1);
        li.add(obj2);
        
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter Name ");
//        String name=sc.nextLine();
//        System.out.println("Enter age ");
//        int age=sc.nextInt();
        
        obj1.Display();
        obj2.Display();
    }
    
}
