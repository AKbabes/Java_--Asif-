
package blood.donate.test;
import java.util.Scanner;
import java.util.ArrayList;

public class Patient extends Information{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many info tou want to insert : ");
        int n=sc.nextInt();
        ArrayList<Patient> p=new ArrayList<Patient>();
        for(int i=0;i<n;i++){
            Patient obj=new Patient();
            System.out.println("Enter name :");
            String nam=sc.nextLine();
            
        }
    }
}
