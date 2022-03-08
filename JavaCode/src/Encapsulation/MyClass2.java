
package Encapsulation;

import java.util.Scanner;

public class MyClass2 extends Mobile {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the mobile number :");
        int t = scan.nextInt();
        Mobile[] box = new Mobile[t];
        for (int i = 0; i < t; i++) {
            box[i] = new Mobile();
            scan.nextLine();
            System.out.println("Enter name :");
            String proxyName = scan.nextLine();
            System.out.println("Enter Brand :");
            String proxyBrand = scan.nextLine();
            System.out.println("Enter code :");
            int proxyCode = scan.nextInt();
            System.out.println("Enter price :");
            double proxyPrice = scan.nextDouble();
            box[i].insertRecord(proxyName, proxyCode, proxyPrice, proxyBrand);
        }
        for (Mobile value : box) {
            value.displayRecord();
        }
        System.out.println("Enter the code You want to search :");
        int src_code = scan.nextInt();
        for (Mobile mobile : box) {
            mobile.searchRecord(src_code);
        }

        System.out.println("Enter the code You want to delete :");
        int del_code = scan.nextInt();
        for (Mobile mobile : box) {
            mobile.deleteRecord(del_code);
        }

    }
}
