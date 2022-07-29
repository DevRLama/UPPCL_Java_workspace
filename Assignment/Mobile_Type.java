package Assignment;

class Mobile{
    private float cost;
    private String camera;
    public String username;

    Mobile(String username){
        this.username=username;
    }

    public float getCost() {
        return cost;
    }
    public void setCost(float cost) {
        this.cost = cost;
    }
    
    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }
} 


public class Mobile_Type {
    
    public static void main(String[] args) {
        Mobile m1=new Mobile("Amit");
        Mobile m2=new Mobile("Mohan");
        Mobile m3=new Mobile("Raghav");
        m1.setCamera("Redmi");
        m1.setCost(16000f);
        m2.setCamera("Samsung");
        m2.setCost(15000f);
        m3.setCamera("LG");
        m3.setCost(12000f);
        System.out.println("\nName of user is: "+m1.username+"\tCamera is: "+m1.getCamera()+"\tCost is: "+m1.getCost());
        System.out.println("\nName of user is: "+m2.username+"\tCamera is: "+m2.getCamera()+"\tCost is: "+m2.getCost());
        System.out.println("\nName of user is: "+m3.username+"\tCamera is: "+m3.getCamera()+"\tCost is: "+m3.getCost());

    }
}
