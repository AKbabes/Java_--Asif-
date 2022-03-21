
package arraylist;
import java.util.ArrayList;
public class precticeAL {

    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<Integer>(3);
        System.out.println("Four numbers is : ");
        al.add(23);
        al.add(34);
        al.add(56);
        al.add(67);
        System.out.println(al);
        al.set(1,97);
        System.out.println("After add 97 isted of 34 : "+al);
        System.out.println("Total Size = "+al.size());
        al.remove(0);
        System.out.println("After remove 23 : "+al);
        System.out.println("Total Size = "+al.size());
        al.clear();
        System.out.println("Clear everything "+al);
    }
    
}
