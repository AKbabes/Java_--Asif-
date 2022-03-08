
package Encapsulation;

public class Mobile {

    private String name;
    private int code;
    private double price;
    private String brand;

    public void insertRecord(String newName, int newCode, double newPrice, String newBrand) {
        this.name = newName;
        this.code = newCode;
        this.price = newPrice;
        this.brand = newBrand;
    }

    public void displayRecord() {
        System.out.println(this.name);
        System.out.println(this.code);
        System.out.println(this.price);
        System.out.println(this.brand);
    }

    public void searchRecord(int code) {
        if (this.code == code) {
            System.out.println("Found! here is the details :");
            displayRecord();
        }
    }

    public void deleteRecord(int code) {
        if (this.code == code) {
            this.name = "";
            this.code = 0;
            this.price = 0;
            this.brand = "";
            System.out.println("found & all the information is deleted!");
        }
    }

}
