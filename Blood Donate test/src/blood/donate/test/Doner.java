
package blood.donate.test;
import java.util.Scanner;

public class Doner {
    public String name;
    public int id;
    public String phnumber;
    public String sex;
    public String bloodgrp;
    public String report;
    public String address;
    public String last_donation;
    
    public Doner(String name,String sex,String bloodgrp){
        this.name=name;
        this.sex=sex;
        this.bloodgrp=bloodgrp;
    }
    public void donarMenue(){
        System.out.println("");
    }
    
    public void create_donarList(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Doner Name : ");
        
    }
}
