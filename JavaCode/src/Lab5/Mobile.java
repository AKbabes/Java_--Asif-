package Lab5;
import java.util.Scanner;
public class Mobile {
    private String name;
    private int code;
    private double price;
    private String brand;
    
    public void insertRecord(String name,int code,double price,String brand){
        this.name=name;
        this.code=code;
        this.price=price;
        this.brand=brand;
    }
    public void display(){
        System.out.println("Name = "+name+"\nCode = "+code+"\nPrice = "+price+"\nBrand = "+brand);
    }
}
