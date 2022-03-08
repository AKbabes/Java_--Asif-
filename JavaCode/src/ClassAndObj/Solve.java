
package ClassAndObj;

import java.util.Scanner;

public class Solve {

    private String name;
    private String language;
    private int solve;
    private int time;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many details you want to entry : ");
        int n = sc.nextInt();
        Solve[] obj = new Solve[n];

        for (int i = 0; i < n; i++) {
            obj[i] = new Solve();
            System.out.println("Enetr person " + (i + 1) + " details : ");
            System.out.println("Enetr name : ");
            sc.nextLine();
            obj[i].name = sc.nextLine();
            System.out.println("Enter language : ");
            obj[i].language = sc.nextLine();
            System.out.println("Total solve : ");
            //sc.nextLine();
            obj[i].solve = sc.nextInt();
            System.out.println("Time spend for practice : ");
            obj[i].time = sc.nextInt();
        }
        System.out.println("****All details you entered****");

        for (int j = 0; j < n; j++) {
            System.out.println("Details of person " + (j + 1));
            System.out.println("Name : " + obj[j].name);
            System.out.println("Language : " + obj[j].language);
            System.out.println("Total solve : " + obj[j].solve);
            System.out.println("Total time : " + obj[j].time);
        }
    }
}
