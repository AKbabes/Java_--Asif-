
package LabTest;
//import java.util.Scanner;

public class AsifLaptop {
    private String modelName;
    private int code;
    private String brand;
    private double price;
    
    public void setModelName(String a){
        this.modelName=a;
    }
    public void setCode(int b){
        this.code=b;
    }
    public void setBrand(String c){
        this.brand=c;
    }
    public void setPrice(double d){
        this.price=d;
    }
    public void display(){
        System.out.println("\nName : "+modelName+"\nCode : "+code+"\nBrand : "+brand+"\nPrice : "+price);
    }
}
