package Method;
import java.util.Scanner;

public class CheckInput {
    
    public static int Maximum(int a, int b, int c){
        int max=Math.max(a, b);
        int res=Math.max(max, c);
        return res;
    }
    
    public void Minimum(int a,int b,int c){
        int min=Math.min(a, b);
        int res=Math.min(min,c);
        System.out.println(+res+" is Minimum");
    }
    
    public static void main(String [] args){
        Scanner asif=new Scanner(System.in);
        CheckInput obj=new CheckInput();
        System.out.println("Enetr two number : ");
        int a=asif.nextInt();
        int b=asif.nextInt();
        int c=asif.nextInt();
        
        int ans = Maximum(a,b,c);
        System.out.println(+ans+" is Maximum");
        
        obj.Minimum(a,b,c);
        
    }
    
}
