package Data_structure;

public class SumRecursion {

    public int sum(int data)
    {
        if(data==0){
            return 0;
        }else
        {
            return(data+sum(data-1));
        }
    }

    public static void main(String[] args) {
        SumRecursion s1=new SumRecursion();
        System.out.println(s1.sum(10));
    }
}
