import java.io.*;

class Shape{
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
}
