package LabTest;

import java.util.Scanner;
import java.util.Arrays;

public class Problem {

    public static void main(String[] args) {
        Scanner Asif = new Scanner(System.in);
        
        System.out.println("How many numbers you want to store : ");
        int ak = Asif.nextInt();
        
        int[] AsifArr = new int[ak];
        
        for (int k = 0; k < ak; k++) {
            AsifArr[k] = Asif.nextInt();
        }

        Arrays.sort(AsifArr);

        int count = 0;

        for (int i = 0; i < ak - 1; i++) {
            for (int j = i + 1; j < ak; j++) {
                if (AsifArr[i] == AsifArr[j]) {
                    count++;
                } else {
                    break;
                }
            }

        }
        System.out.println("total duplicate number -> " + (count-1));
        
        for(int i=0;i<ak;i++){  
            int div=0;                       
            for(int j=2;j<AsifArr[i];j++){
            if(AsifArr[i]%j==0){
                div++;
                break;
                }
            }
            if(div==0){
                System.out.println("Prime numbers ->"+AsifArr[i]);
            }
        }
    }
}
