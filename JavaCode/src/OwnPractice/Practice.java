
package OwnPractice;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args){
        System.out.println("Enter a number = ");
    
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("Mod by 2 = ");
        int res=a%2;
        System.out.println(res);
    }
    
}
