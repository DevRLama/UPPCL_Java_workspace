import java.io.*;

abstract class Shape{
    
    String objname="";
    Shape(String name){
        this.objname=name;
    }
    abstract void area();  // Abstract method without functionlity.
    public void message(){System.out.println("Hello");} // Normal method with functionality.

}

class Rectangle extends Shape{
    int length,breadth,height;
    Rectangle(int a1,int b1,int c1,String name){
        
        super(name); // Parent constructor calling.
        
        length=a1;
        breadth=b1;
        height=c1;
    }
    void area(){
        System.out.println("Area of " +objname+ " is= "+(length*breadth*height));
    }
    

}

class Circle1 extends Shape{
    int radius;
    Circle1(int a1,String name){
        super(name); // Parent constructor calling.
        radius=a1;    
    }
    void area(){
        System.out.println("Area of " +objname+ " is= "+(3.14f*radius*radius));
    }

}

class Area{
    public static void main(String[] args) {
        Shape s1=new Rectangle(1, 2, 3,"Rectangle");
        Shape s2=new Circle1(3,"Circle");
        s1.area();
        s2.area();
        s1.message();
        s2.message();
    }
}
















// Program to calculate area of rectangle and circle.
/* class Shape{
    float radius;
    float length,breadth,height;
    Shape(float r){
        radius=r;
    }
    Shape(float l,float b,float h){
        length=l;
        breadth=b;
        height=h;
    }

    void display(int choice){
        if(choice==1)
        {
            System.out.println("Area of circle is = "+(3.14f*radius*radius));
        }else
        {
            System.out.println("Area of Rectangle is = "+(length*breadth*height));
        }

    }
}

class Area {
    public static void main(String[] args) throws IOException{
        int choice;
        System.out.println("Enter your choice:\n1. Area of circle \n2. Area of rectangle\n");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        choice=Integer.parseInt(br.readLine());
        if(choice==1)
        {       Shape s1=new Shape(10.5f);
                s1.display(choice);
        }
        if(choice==2)
        {
            Shape s1=new Shape(10.5f,2.5f,6.5f);
            s1.display(choice); 
        }
        if(choice==3)
        {
            System.out.println("Invalid Choice");
        }

    }
} */
