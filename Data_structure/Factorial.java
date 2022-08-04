package Data_structure;

public class Factorial {
    public int fact(int data)
    {
        if(data==1){
            return 1;
        }else
        {
            return(data*fact(data-1));
        }
    }

    public static void main(String[] args) {
        Factorial s1=new Factorial();
        System.out.println(s1.fact(5));
    }
}
