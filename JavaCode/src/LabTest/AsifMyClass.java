package LabTest;

import java.util.Scanner;

public class AsifMyClass {

    public static void main(String[] args) {
        AsifLaptop obj1 = new AsifLaptop();
        Scanner ak = new Scanner(System.in);
        System.out.println("Enter model name : ");
        String a = ak.nextLine();
        obj1.setModelName(a);
        System.out.println("Enetr Code : ");
        int b = ak.nextInt();
        obj1.setCode(b);
        System.out.println("Enter brand name : ");
        ak.nextLine();
        String c = ak.nextLine();
        obj1.setBrand(c);
        System.out.println("Enter price : ");
        double d = ak.nextDouble();
        obj1.setPrice(d);

        AsifLaptop obj2 = new AsifLaptop();
        System.out.println("\nEnter model name : ");
        ak.nextLine();
        String a1 = ak.nextLine();
        obj2.setModelName(a1);
        System.out.println("Enetr Code : ");
        int b1 = ak.nextInt();
        obj2.setCode(b1);
        System.out.println("Enter brand name : ");
        ak.nextLine();
        String c1 = ak.nextLine();
        obj2.setBrand(c1);
        System.out.println("Enter price : ");
        double d1 = ak.nextDouble();
        obj2.setPrice(d1);

        AsifLaptop obj3 = new AsifLaptop();
        System.out.println("\nEnter model name : ");
        ak.nextLine();
        String a2 = ak.nextLine();
        obj3.setModelName(a2);
        System.out.println("Enetr Code : ");
        int b2 = ak.nextInt();
        obj3.setCode(b2);
        System.out.println("Enter brand name : ");
        ak.nextLine();
        String c2 = ak.nextLine();
        obj3.setBrand(c2);
        System.out.println("Enter price : ");
        double d2 = ak.nextDouble();
        obj3.setPrice(d2);

        System.out.println("***Details***");
        obj1.display();
        obj2.display();
        obj3.display();

        System.out.println("\nMost Expensive Laptop in this list ->");
        if (d > d1 && d > d2) {
            obj1.display();
        } else if (d1 > d && d1 > d2) {
            obj2.display();
        } else {
            obj3.display();
        }
    }
}
