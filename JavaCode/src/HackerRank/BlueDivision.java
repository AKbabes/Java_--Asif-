
package HackerRank;
import java.util.Scanner;

public class BlueDivision {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,i,temp;
        while(true){
            a=sc.nextInt();
            b=sc.nextInt();
            if(a>b){
                temp=a;
                a=b;
                b=temp;
                System.out.println(+(b-a));
            }
            System.out.println(+(b-a));
        }
    }
}
