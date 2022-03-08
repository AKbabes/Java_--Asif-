
package Inharitance;

public class Car extends Vehicle {
    
    int ispeed = 100;
    
    public Car()
    {
        //super("Red");
        super(" Black");
        System.out.println("Car is Created\n");
    }
    
    public void display()
    {
        super.display();
        System.out.println("Vehicle Speed is: "+super.speed);
        System.out.println("Car Speed is: "+ispeed);
    }    
    
    public static void main(String[] args) {        
        
        Car c1 = new Car();       
        
        c1.display();      
      }
}
