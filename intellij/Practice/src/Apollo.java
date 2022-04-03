public class Apollo extends SpaceCraft implements Drive, Shuttle {
    private int nowheel;

    public int getNowheel() {
        return nowheel;
    }

    public void setNowheel(int nowheel) {
        this.nowheel = nowheel;
    }

    public Apollo(String model, int nowheel) {
        super(model);
        this.nowheel=nowheel;
    }

    @Override
    public void drive(){
        System.out.println("Start Engine");
    }
    public void stop(){
        System.out.println("Stop Engine");
    }
    public void turn(){
        System.out.println("Turn the aircraft");
    }

    @Override
    public void startShuttle() {
        System.out.println("Start Firing");
    }

    @Override
    public void stopShuttle() {
        System.out.println("Stop Firing");
    }

    public void display() {
        System.out.println("Model Name : "+Model);
        System.out.println("Heel Time "+nowheel);
        drive();
        stop();
        turn();
        startShuttle();
        stopShuttle();
    }

    public static void main(String[] args) {
        Apollo ap=new Apollo("RTX",30);
        ap.display();
    }
}
