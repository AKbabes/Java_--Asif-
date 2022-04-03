import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,y;
        Calculator [] objarr=new Calculator[1];
        objarr[0] = new Calculator();
        System.out.println("Enetr two number for add : ");
        x= sc.nextInt();
        y=sc.nextInt();
        //System.out.println();
        objarr[0].addition(x,y);
    }
}
