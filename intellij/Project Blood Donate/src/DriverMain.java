import java.util.ArrayList;
import java.util.Scanner;

public class DriverMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter patient number :");
        int x = scan.nextInt();
        ArrayList<patient> rugirdol = new ArrayList<patient>();
        scan.nextLine();

        int l=0;
        while(l==1){
            int choise;
            System.out.println("Enter 1 to add patient \n 0 to exit");
            choise = scan.nextInt();
            if(choise==1){
                for (int i=0;i<x;i++){

                    System.out.println("Enter name patient "+(i+1));
                    String tempname = scan.nextLine();
                    System.out.println("id :");
                    int tempid = scan.nextInt();
                    scan.nextLine();
                    System.out.println("blood group :");
                    String tempbg = scan.nextLine();
                    patient tempRugi = new patient(tempname,tempid,tempbg);
                    rugirdol.add(tempRugi);
                }
            }else if(choise==0){
                l=0;
            }
        }
        for(patient i:rugirdol){
            i.display();
        }
    }
}
