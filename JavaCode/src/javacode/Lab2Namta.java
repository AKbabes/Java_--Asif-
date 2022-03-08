package javacode;

import java.util.Scanner;

public class Lab2Namta {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter which Multiplication table you want to see(1 - 10) :");
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(+num + " x " + i + " = " + (num * i));
        }
    }

}
