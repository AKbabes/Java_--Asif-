
package Inharitance;

public class Vehicle {
    int speed = 50;
    
    public Vehicle(String color) {
        System.out.println("Vehicle is created with  color:" + color);
    }        

    public void display() {
        System.out.println("The vehicle Speed is: " + speed);
    }
}

