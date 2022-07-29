package Assignment;

class Location{
    private float lat;
    private float lon;
    public void randomLocation(){

        this.lat=(float) Math.random()*90;
        this.lon=(float) Math.random()*90;
    }

    public float getLat() {
        return lat;
    }
    public float getLon() {
        return lon;
    }
}


public class Unmanned_Veh{
    public static void main(String[] args) {
        Location l1=new Location();
        l1.randomLocation();
        System.out.println("Unmanned Vehicle location is:  \nLatitude: "+l1.getLat()+" E"+"\tLongitude: "+l1.getLon()+" N");
    }
}