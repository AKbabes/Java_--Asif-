package Array;

import java.util.Scanner;
import java.util.Arrays;

public class ArraySort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers you want to insert : ");
        int n = sc.nextInt(); //5
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {    //[6,20,15,1,9]
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Asif");
        for (int j = n-1; j >=0; j--) {
            System.out.println(arr[j]);
        }
    }

}
