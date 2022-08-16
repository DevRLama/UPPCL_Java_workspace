package DynamicProgramming;




public class LCS {

    int[][] seqdpmn=new int[20][20];

    void initialize_tab(int m,int n)
    {
        for (int i = 0; i <=m; i++) {
            for (int j = 0; j <=n; j++) {
                seqdpmn[i][j]=-1;
                
            }
            
        }
    }

    int lcs_recursive(String X, String Y, int m,int n)
    {
        if(m==0 || n==0)
        {
            return 0;
        }
        if(seqdpmn[m][n]!=-1)
        {
            return seqdpmn[m][n];
        }
        if(X.charAt(m-1)==Y.charAt(n-1))
        {
            seqdpmn[m][n]=1 + lcs_recursive(X, Y, m-1, n-1);
            return seqdpmn[m][n];
        }
        seqdpmn[m][n] = Math.max(lcs_recursive(X, Y, m, n - 1),lcs_recursive(X, Y, m - 1, n));
    return seqdpmn[m][n];
    }
    

    public static void main(String[] args) {
        String str1="ABCBDAB";
        String str2="BDCABA";
        LCS l1=new LCS();
        l1.initialize_tab(str1.length(), str2.length());
       

        System.out.println( l1.lcs_recursive(str1, str2, str1.length(), str2.length()));
        
        // for (int i = 0; i <=str1.length(); i++) {
        //     for (int j = 0; j <=str2.length(); j++) {
        //        System.out.print(" "+l1.seqdpmn[i][j]);
                
        //     }
        //     System.out.println();
        // }
    }


}
