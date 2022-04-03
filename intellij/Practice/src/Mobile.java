public class Mobile {
    private String name;
    private int code;
    private double price;
    private String brand;

    public void insertRecord(String name,int code, double price, String brand){
        this.name=name;
        this.code=code;
        this.price=price;
        this.brand=brand;
    }
    public void displayrecord(){
        System.out.println("Mobile Name = "+this.name);
        System.out.println("Mobile Code = "+this.code);
        System.out.println("Mobile Price = "+this.price);
        System.out.println("Mobile Brand = "+this.brand);
    }

    public Mobile(String name, int code, double price, String brand) {
        this.name = name;
        this.code = code;
        this.price = price;
        this.brand = brand;
    }

    public void searchrecord(String a, int b){

    }
}
