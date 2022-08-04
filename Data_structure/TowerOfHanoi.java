package Data_structure;

public class TowerOfHanoi {
    int count=0;
    public void moves(int n,char source,char destination,char aux)
    {
        if(n==1)
        {
            System.out.println("Move "+source+" to "+destination);
            count++;
        }else
        {
            moves(n-1,source,aux,destination);
            moves(1, source, destination, aux);
            moves(n-1, aux,destination, source);
        }
    }

    public static void main(String[] args) {
        TowerOfHanoi t1=new TowerOfHanoi();
        t1.moves(3, 'A', 'C', 'B');
        System.out.println("Total Moves: "+t1.count);

    }

}
