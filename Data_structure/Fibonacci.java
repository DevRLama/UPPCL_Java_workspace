package Data_structure;

import javax.naming.TimeLimitExceededException;

public class Fibonacci {
    int fib_val=0;
    public int fib(int data)
    {   
        if(data<2)
        {
           return data;
        }
        
        return(fib(data-1)+fib(data-2));
    }

    public static void main(String[] args) throws TimeLimitExceededException {
        Fibonacci s1=new Fibonacci();
        for(int i=0;i<10;i++)
            System.out.print(" "+s1.fib(i));
    }
}
