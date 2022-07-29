package Assignment;

abstract class Arithmetic{
    abstract void addition();
    abstract void subtraction();
    abstract void multiplication();
    abstract void divison();
}

class Add_num extends Arithmetic{
    int x,y;
    Add_num(int a1,int b1){
        this.x=a1;
        this.y=b1;
    }
    void addition(){
        System.out.println("Addition is : "+(x+y));
    }
    void subtraction(){
         
    }
    void multiplication(){
       
    }
    void divison(){
        
    }
}

class Sub_num extends Arithmetic{
    int x,y;
    Sub_num(int a1,int b1){
        this.x=a1;
        this.y=b1;
    }
    void addition(){
        
    }
    void subtraction(){
        System.out.println("Subtraction is : "+(x-y));
    }
    void multiplication(){
       
    }
    void divison(){
        
    }
}

class Mul_num extends Arithmetic{
    int x,y;
    Mul_num(int a1,int b1){
        this.x=a1;
        this.y=b1;
    }
    void addition(){
        
    }
    void subtraction(){
       
    }
    void multiplication(){
        System.out.println("Multiplication is : "+(x*y));
    }
    void divison(){
        
    }
}

class Div_num extends Arithmetic{
    int x,y;
    Div_num(int a1,int b1){
        this.x=a1;
        this.y=b1;
    }
    void addition(){
        
    }
    void subtraction(){
       
    }
    void multiplication(){
        
    }
    void divison() throws ArithmeticException{
        
        System.out.println("Division is : "+(x/y));
  
    }
}

public class Abstract_Calculator {

    public static void main(String[] args) {
        Add_num a1=new Add_num(10, 20);
        Sub_num s1=new Sub_num(20, 30);
        Mul_num m1=new Mul_num(15, 10);
        Div_num d1=new Div_num(10, 2);
        a1.addition();
        s1.subtraction();
        m1.multiplication();
        d1.divison();
    }
    
}
