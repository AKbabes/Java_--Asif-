
package javacode;
import java.util.Scanner;

public class Lab2GradingSystem {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Marks (in %) : ");
        int n=sc.nextInt();
        if(n >= 80){
            System.out.println("Grade\tPoint\tRemarks");
            System.out.println("A+\t4.00\tOutstanding");
        }
        else if(n >= 75 && n < 80){
            System.out.println("Grade\tPoint\tRemarks");
            System.out.println("A\t3.75\tExcellent");
        }
        else if(n >= 70 && n < 75){
            System.out.println("Grade\tPoint\tRemarks");
            System.out.println("A-\t3.50\tVery Good");
        }
        else if(n >= 65 && n < 70){
            System.out.println("Grade\tPoint\tRemarks");
            System.out.println("B+\t3.25\tGood");
        }
        else if(n >= 60 && n < 65){
            System.out.println("Grade\tPoint\tRemarks");
            System.out.println("B\t3.00\tSatisfactory");
        }
        else if(n >= 55 && n < 60){
            System.out.println("Grade\tPoint\tRemarks");
            System.out.println("B-\t2.75\tAbove Average");
        }
        else if(n >= 50 && n < 55){
            System.out.println("Grade\tPoint\tRemarks");
            System.out.println("C+\t2.50\tAverage");
        }
        else if(n >= 40 && n < 45){
            System.out.println("Grade\tPoint\tRemarks");
            System.out.println("D\t4.00\tPass");
        }
        else if(n <= 40){
            System.out.println("You Are Failed In This Exam\t(RIP)");
        }
    }
}
