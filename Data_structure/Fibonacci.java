package Data_structure;

import javax.naming.TimeLimitExceededException;

public class Fibonacci {
    int fib_val=0;
    public int fib(int data)
    {   
        if(data==0){
            return 0;
        }
        if(data==1)
        {
            return 1;
        }
        return(fib(data-1)+fib(data-2));
    }

    public static void main(String[] args) throws TimeLimitExceededException {
        Fibonacci s1=new Fibonacci();
        System.out.println(s1.fib(50));
    }
}
