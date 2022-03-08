package ClassAndObj;
import java.util.Scanner;

public class UMLmobile {
    private String mName;
    private int mCode;
    private double mPrice;
    private String mBrand;
    
    public void insertValue(String a,String b){
       this.mName=a;
       this.mBrand=b;
    }
    
    public void insertValue(int a,double b){
       this.mCode=a;
       this.mPrice=b;
    }
    
    public void displayValue(){
        System.out.println("\nUser Name : "+mName+"\nMobile Brande : "+mBrand+"\nCode no. : "+mCode+"\nPrice : "+mPrice);
    }
    
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        UMLmobile obj=new UMLmobile();
        
        System.out.println("Enter name : ");
        String mName=sc.nextLine();
        System.out.println("Enetr Brand name : ");
        String mBrand=sc.nextLine();
        System.out.println("Enter code no. : ");
        int mCode=sc.nextInt();
        System.out.println("Enter price : ");
        double mPrice=sc.nextDouble();
        
        obj.insertValue(mName, mBrand);
        obj.insertValue(mCode, mPrice);
        obj.displayValue();
    }
}
