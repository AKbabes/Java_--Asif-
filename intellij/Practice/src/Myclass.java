import java.util.ArrayList;
import java.util.Scanner;

public class Myclass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many info you want to insert ?");
        int num=sc.nextInt();
        ArrayList<Mobile>arral=new ArrayList<Mobile>(num);
        for(int i=0; i<num;i++){
            System.out.println("Enter The name of Mobile");
            String name=sc.nextLine();
            sc.nextLine();
            System.out.println("Enetr the code ");
            int code=sc.nextInt();
            System.out.println("Enter the price");
            double price=sc.nextDouble();
            sc.nextLine();
            System.out.println("Enter the brand name");
            String brand=sc.nextLine();
            Mobile obj=new Mobile(name,code,price,brand);
            arral.add(obj);
        }
        System.out.println("**********************");
        System.out.println("Details you entered : ");
        for(int i=0;i<num;i++){
            arral.get(i).displayrecord();
            System.out.println("-----------------------");
        }
//        obj.insertRecord("Xiomi",23,30000,"Realme");
//        obj.displayrecord();
    }
}
