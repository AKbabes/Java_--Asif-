package another.project;
import java.util.Scanner;

public class AddFoodForMenu {
    public int serial;
    public String name;
    public float price;

    public AddFoodForMenu(int serial, String name, float price) {
        this.serial=serial;
        this.name =name;
        this.price=price;
    }

    public void CreateMenu() {
        Scanner input =new Scanner(System.in);
        System.out.println();
        System.out.print("Enter Serial No: ");
        serial = input.nextInt();
        input.nextLine();
        System.out.print("Enter Food Name: ");
        name=input.nextLine();
        System.out.print("Enter Food Price: ");
        price=input.nextFloat();
    }

    public int getSerial(){
        return serial;
    }
    public String getName(){
        return name;
    }
    public float getPrice(){
        return price;
    }

    public void setName(String Name) {
        this.name=Name;
    }
    public void setPrice(float Price) {
        this.price=Price;
    }

}
