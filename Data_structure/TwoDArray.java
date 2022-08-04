package Data_structure;
public class TwoDArray {
    public static void main(String[] args) {
        int[][] arr12=new int[5][5];
        int row=5,col=5;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++)
            {
                arr12[i][j]=i*(j+1);          //Input of elements of 2D arrray row-wise.
            }  
        }  
        System.out.println("Row-wise access of 2DArray element");
        for(int i=0;i<row;i++){
            //System.out.print((i+1)+" Row:");
            for(int j=0;j<col;j++)
            {
               System.out.print(" "+ arr12[i][j]); 
            } 
            System.out.print("\n"); 
        }  

        System.out.println("Column-wise access of 2DArray element");
        for(int i=0;i<row;i++){
            
            for(int j=0;j<col;j++)
            {
               System.out.print(" "+ arr12[j][i]);
            } 
            System.out.print("\n"); 
        }  
    }
}
