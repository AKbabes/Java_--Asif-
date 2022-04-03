public abstract class Vehichal {
    public int Weight;

    public Vehichal(int weight) {
        Weight = weight;
    }
    public abstract void run();

    public void carry(){
        System.out.println("Vehicle can carry "+Weight);
    }
}
