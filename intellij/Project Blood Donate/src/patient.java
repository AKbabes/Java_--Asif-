import java.util.ArrayList;

public class patient {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    private int id;
    private String blood_group;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBlood_group() {
        return blood_group;
    }

    public void setBlood_group(String blood_group) {
        this.blood_group = blood_group;
    }

    public patient(String nm,int iid, String bg) {
        setName(nm);
        setId(iid);
        setBlood_group(bg);
    }
    private final ArrayList <String> patient_disease = new ArrayList<String>();
    public void display(){
        System.out.println("name :"+this.name+"\n"+" id: "+this.id+" blood gorop :"+this.blood_group);
    }
}
