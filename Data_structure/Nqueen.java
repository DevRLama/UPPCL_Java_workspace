package Data_structure;

public class Nqueen {
    int n=4;
    int[][] chessboard=new int[n][n];
    
    void showBoard()
    {
        for(int i=0;i<n;i++)
        {    for(int j=0;j<n;j++)
                System.out.print(chessboard[i][j]+"\t");
            System.out.println("\n");
        }
    }
    
    void chessBoardInitialize()
    {
        for(int i=0;i<n;i++)
        {    for(int j=0;j<n;j++)
                chessboard[i][j]=0;
        }
    }



    boolean solveNQueen(int col)
    {
        if(col>n)
        {
            return true;
        }
        for(int i=0;i<n;i++)
        {
            if(isSafe(i,col))
            {
                chessboard[i][col]=1;
                if(solveNQueen(col+1)==true)
                    return true;
                chessboard[i][col]=0;
            }
        }
        return false;
    }

    boolean solveNQ()
    {
        chessBoardInitialize();
  
        if (solveNQueen( 0) == false) {
            System.out.print("Solution does not exist");
            return false;
        }
  
        showBoard();
        return true;
    }




boolean isSafe(int row,int col)
{
    int i,j;
    for(i=0;i<col;i++)  //row left side
        if(chessboard[row][i]==1)
            return false;
    for(i=row,j=col;i>=0 && j>=0; i--,j--) // upper  diagonal 
    {
        if(chessboard[i][j]==1)
            return false;

    }

    for(i=row,j=col;j>=0 && i<n;i++,j--) //lower diagonal
    {
        if(chessboard[i][j]==1)
            return false;
    }
    return true;
}
    

        public static void main(String[] args) {
            Nqueen n1=new Nqueen();
            //n1.showBoard();
            n1.solveNQ();
                
          
        }
   
    
}
