package Array;
import java.util.Scanner;

public class Practice {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int [] lol=new int [5];
        
        System.out.println("Enetr 5 integer Arrays : ");
        for(int i=0;i<5;i++){
            lol [i]=sc.nextInt();
        }
        System.out.println("Enter a number : ");
        int num=sc.nextInt();
        for(int j=0;j<5;j++){
            if(num==lol[j]){
                System.out.print("Yes!!! in index = "+j);
                return;
            }
        }
        System.out.println("Alas...Not Matched");
    }
}

