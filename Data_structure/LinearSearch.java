package Data_structure;

import java.lang.Math;

public class LinearSearch {
    
    int m=10;
    int[] arr1=new int[m];

    void initializeArray()
    {
        for(int i=0;i<m;i++)
        {
            arr1[i]=(int)(Math.random()*20);
            
        }
    }

    void showArray()
    {
        for(int i=0;i<m;i++)
        {
           System.out.print(" "+arr1[i]);
        }
    }

    void linearSearch(int val)
    {
        int index=0;


        if(linearSearch_recursive(val,index)==false){
            System.out.println("Element not found");
        }
        
    }

    boolean linearSearch_recursive(int element,int index){
        if(index<m)
        {
            if(arr1[index]==element){
                System.out.println("Element first occurence found at: "+index);
                return true;
            }else
            {return(linearSearch_recursive(element, index+1));}
        }
        return false;
        
    }

        public static void main(String[] args) {
            LinearSearch l1=new LinearSearch();
            int val=8;
            l1.initializeArray();
            l1.linearSearch(val);
            System.out.println(val);
            l1.showArray();
        }



}
