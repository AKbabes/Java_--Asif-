
package OwnPractice;


public class Exp {
    int b=20;
    static int c=30;
    
    public static void Print(){
        Exp New=new Exp();
        System.out.println(New.b);
        System.out.println(c);
    }
    
    public static void main(String[] args) {
        Exp obj=new Exp();
        //Print golu=new Print();
        int a=10;
        System.out.println(a);
        Print();
        System.out.println(c);
        System.out.println(obj.b);
    }
    
}
