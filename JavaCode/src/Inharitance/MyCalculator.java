
package Inharitance;
import java.util.Scanner;

public class MyCalculator extends Calculator {
    public void multiplication(int a , int b){
        System.out.println("Multiclication = "+(a*b));
    }
    public void division(int a, int b){
        System.out.println("Division = "+(a/b));
    }
    
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        MyCalculator obj=new MyCalculator();
        System.out.println("Enter a number : ");
        int z=sc.nextInt();
        obj.addition(z,z);
        obj.substraction(z, z);
        obj.multiplication(z, z);
        obj.division(z, z);
    }
}
