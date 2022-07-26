//Write a java code for calculator addition,subtraction, multiplication, division and modulo and logical operator and, or , not.
import java.io.*;

class fun_num{
        float a;
        float b;

    fun_num(float val1,float val2){
        this.a=val1;
        this.b=val2;
    }

    float add(){
            return(a+b);
    }
    
    float sub(){
        return(a-b);
    }

    float mul(){
        return(a*b);
    }
    
    float div(){
    return(a/b);
    }

    float mod(){
        return(a%b);
    }
    

}

public class Calculator 
{
    public static void main(String[] args) throws IOException{
        float a1,b1;
        int choice;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Press \n1. Addition \n2. Subtraction \n3. Multiplication \n4. Division \n5. Modulo \n6. Logical AND \n7. Logical OR\n8. Logical NOT: ");
        choice=Integer.parseInt(br.readLine());
            System.out.println("Enter first number: ");
            a1=Float.parseFloat(br.readLine()); 
            System.out.println("Enter Second number: ");
            b1=Float.parseFloat(br.readLine());
            fun_num f1=new fun_num(a1, b1); 
         
        switch(choice)
        {
            case 1: 
            System.out.println(f1.add());
            break;

            case 2: 
            System.out.println(f1.sub());
            break;

            case 3: 
            System.out.println(f1.mul());
            break;

            case 4: 
            System.out.println(f1.div());
            break;

            case 5: 
            System.out.println(f1.mod());
            break;

            case 6:
            
            System.out.println((a1>1) && (b1<2));
            break;
            
            case 7: 
           
            System.out.println((a1>1) || (b1<2));
            break;
            
            case 8:
           
            System.out.println(!(a1>b1));
            break;

            default:
             System.out.println("Not Valid choice");
             break;

        }

    }
    
}

