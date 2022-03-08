
package javacode;
import java.util.Scanner;

public class Lab2Maximum {

    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("You can do only 3 operation ->");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Enter three integer numbers -");
            int a = ss.nextInt();
            int b = ss.nextInt();
            int c = ss.nextInt();
            if (a > b && a > c) {
                System.out.println(+a + " number is Maximum.");
            } 
            else if (b > a && b > c) {
                System.out.println(+b + " number is Maximum.");
            } 
            else {
                System.out.println(+c + " number is Maximum.");
            }
        }
    }

}
