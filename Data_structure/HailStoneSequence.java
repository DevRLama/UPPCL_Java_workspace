package Data_structure;

public class HailStoneSequence {
    
    void hailStone_display(int length)
    {
        if(length==1)
        {
            System.out.println(length);
        }else if(length%2==0)
        {
            System.out.println(length+" ");
           
            hailStone_display((int)length/2);
            
        }else
        {
            
            System.out.println(length+" ");
            hailStone_display((3*length)+1);
            
        }
    }

    public static void main(String[] args) {
        HailStoneSequence h1=new HailStoneSequence();
        h1.hailStone_display(27);
    }
}
