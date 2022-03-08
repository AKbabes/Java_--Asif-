package Method;
import java.util.Scanner;

public class SumuCode {
    private String mName;
    private int mCode;
    private double mPrice;
    private String mBrand;
    
    public void insertValue(){
        Scanner input=new Scanner(System.in);
        System.out.println("Name");
        mName= input.nextLine();
        System.out.println("Code");
        mCode=input.nextInt();
        System.out.println("Price");
        mPrice=input.nextDouble();
        input.nextLine();
        System.out.println("Brand");
        mBrand=input.nextLine();
        //input.nextLine();
    }
    public void displayValue(){
        System.out.println("The modile name of:"+mName);
        System.out.println("The modile code of:"+mCode);
        System.out.println("The modile price of:"+mPrice);
        System.out.println("The modile brand of:"+mBrand);
      
    }
    public static void main(String[]args){
        SumuCode mob1=new SumuCode();
        mob1.insertValue();
        mob1.displayValue();
        
    }
    
}
