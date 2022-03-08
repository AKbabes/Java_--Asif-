
package Method;
import java.util.Scanner;

public class MathElements {

    public static void Maximum(int a, int b, int c) {
        int max = Math.max(a, b);
        if (max > c) {
            System.out.println(+max + " number is maximum");
        }
        else
            System.out.println(+c+" number is maximum");
    }
    //Error occure when try to return something;
    public static int Minimum(int a, int b, int c) {
        int min = Math.min(a, b);

        if (min < c) {
            return min;
        }
        else
            return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        double num;
        num = sc.nextDouble();

        System.out.println("\nAbsolute value of " + num + " = " + Math.abs(num));
        System.out.println("Floor value of " + num + " = " + Math.floor(num));
        System.out.println("Round value of " + num + " = " + Math.round(num));
        System.out.println("Ceil value of " + num + " = " + Math.ceil(num));

        System.out.println("\nEnter two more number : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        //int max=Math.max(a,(int)num);
        int c = (int) num;
        Maximum(a, b, c);

        //int min=Math.min(a,b,c);
        int res = Minimum(a, b, c);
        System.out.println(+res);
    }
}