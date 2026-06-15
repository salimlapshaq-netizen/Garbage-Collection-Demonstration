package victoria.vehicle;

public class Vehicles {
    String color;
    String model;
    String status;
    
    public Vehicles (String c, String m, String s){
        color = c;
        model = m;
        status = s;
    }

    public String getColor(){
        return color;
    }
}
