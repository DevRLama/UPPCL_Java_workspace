import java.io.*;

class consumer{
    int a;
    float b;
    consumer(){
        a=10;
        b=2.50f;
    }
    consumer(int val1,float val2){
        this.a=val1;
        this.b=val2; 
    }
    void info(){
        System.out.println(this.a+ " "+this.b);
    }
}

public class Dice {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //System.out.println("Enter the value between (<10^5)");
       // int a=Integer.parseInt(br.readLine());
        //System.out.println(a);
        consumer c1=new consumer();
        c1.info();
        //System.out.println(c1.a+ " "+c1.b);
        consumer c2=new consumer(50,2.9f);
        c2.info();
        //System.out.println(c2.a+ " "+c2.b);


    }
    
}
