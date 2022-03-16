
package Lab5;

import java.util.Scanner;

public class MyMobile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mobile[] obj = new Mobile[5];
        System.out.println("1. Input Info.");
        System.out.println("2. See details.");
        System.out.println("\nEnter your choice : ");
        int n = sc.nextInt();
        if (n == 1) {
            for (int i = 0; i < 3; i++) {
                obj[i] = new Mobile();
                sc.nextLine();
                System.out.print("Enter name : ");
                String name = sc.nextLine();
                System.out.println("Enter code : ");
                int code = sc.nextInt();
                System.out.println("Enter price : ");
                double price = sc.nextDouble();
                sc.nextLine();
                System.out.println("Enter brand : ");
                String brand = sc.nextLine();
                obj[i].insertRecord(name, code, price, brand);
            }
        }
        if (n == 2) {
            System.out.println("All details you entered : ");
            for (int j = 0; j < 3; j++) {
                obj[j].display();
            }
        }

    }
}
