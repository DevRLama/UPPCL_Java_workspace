// Program of Box to find the volume of Box with the help of parameterized constructor and method.

class Box{
    float a,b,c;
    Box(float a1,float b1, float c1){
        a=a1;
        b=b1;
        c=c1;
    }

    void display_vol(){
        System.out.println(a*b*c);
    }
}

public class Volume {
    public static void main(String[] args) {
        Box b1=new Box(2.5f,3.5f,6.5f);
        Box b2=new Box(3.5f,1.5f,4.5f);
        Box b3=new Box(1.5f,7.5f,5.5f);
        b1.display_vol();
        b2.display_vol();
        b3.display_vol();


    }
}
