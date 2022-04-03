public class Bike extends Vehichal {

    public Bike(int weight) {
        super(weight);
    }

    public void run(){
        System.out.println("go go fasttt!");
    }
    public static void main(String[] args) {
        Bike obj=new Bike(123);
        obj.run();
        obj.carry();
    }
}
