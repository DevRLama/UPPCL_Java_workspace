package DynamicProgramming;



public class fibonacciDP {
    
   long[] fib=new long[1000];
    long fibnacci(int n){
        if(n<=1)
        {
            return n;
        }
        if(fib[n]==-1)
        {
            fib[n]=fibnacci(n-1)+fibnacci(n-2);
           
            return fib[n];
        }
       
        return fib[n];
    }

   

    public static void main(String[] args) {
        fibonacciDP f1=new fibonacciDP();
        f1.fib[0]=0;
        f1.fib[1]=1;
        int n=3;
        for (int i = 2; i <=n; i++) {
           
            f1.fib[i]=-1;  
        }

       
       
        // for (int i = 0; i <n; i++) {
           
        //     System.out.println(f1.fib[i]);
        // }
            
        
        System.out.println(f1.fibnacci(n));
    }
}
