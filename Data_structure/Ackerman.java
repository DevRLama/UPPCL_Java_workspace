package Data_structure;

public class Ackerman {

    void Ackermancall(long m,long n)
    {
        long x=ackerman_recursive(m,n);
        if(x==0)
        {
            System.out.println("Not Valid");
        }else
        {
            System.out.println("Value is : "+x);
        }
    }

    long ackerman_recursive(long m,long n)
    {
        if(m==0)
        {
         return n+1;
        }
        if(m>0 && n==0){
            return(ackerman_recursive(m-1, 1));
        }else if(m>0 && n>0){
            return(ackerman_recursive(m-1, ackerman_recursive(m, n-1)));
        }else{ return 0;}
    }

    public static void main(String[] args) throws StackOverflowError {
        Ackerman a1=new Ackerman();
        a1.Ackermancall(3, 10);
    
    }
    
}
