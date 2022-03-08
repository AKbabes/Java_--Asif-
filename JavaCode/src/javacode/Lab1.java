package javacode;

import java.util.Scanner;

public class Lab1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your full name : ");
        String in = sc.nextLine();
        System.out.println("\n**Your Server Information->\n\tName : " + in + "\n\tStudent ID : 211-15-14640 (Dep of CSE)\n\tAddress : Mohammadpur.");
        System.out.println("\tCGPA : 3.83\n\tFavorite Game : Football(Soccer).\n");

        System.out.print("Enter four integer number :\n\nFirst number : ");
        int a = sc.nextInt();
        System.out.print("\nSecond number : ");
        int b = sc.nextInt();
        System.out.print("\nThird number : ");
        int c = sc.nextInt();
        System.out.print("\nFourth number : ");
        int d = sc.nextInt();

        System.out.print("\n1st equation result = " + (a * b - c * d));
        System.out.print("\n2nd equation result = " + (2 * a - b + 3 * d));
        System.out.print("\n3rd equation result = " + (a * a + b * b - c * c + d * d));
        System.out.println("\n4th equation result = " + ((a * a * a) + b - c * c));
        System.out.println("\nArea of a circle : ");

        final double pi = 3.1416;

        System.out.println("(Here we count First value as Radius value)");
        System.out.printf("So, Area of a circle for %d radius is = %.3f\n", a, pi * (a * a));
        String name = "- Asif";
        System.out.println("\n\t\t\t\t\t" + name);
    }
}
