package Data_structure;

import javax.lang.model.util.ElementScanner14;

public class BinarySearch {
    int m=10;
    int[] arr1={2,3,4,5,89,90,100};

    // void initializeArray()
    // {
    //     for(int i=0;i<m;i++)
    //     {
    //         arr1[i]=(int)(Math.random()*20);
            
    //     }
    // }
 

    void showArray()
    {
        for(int i=0;i<arr1.length;i++)
        {
           System.out.print(arr1[i]+" ");
        }
    }

    void binarySearch(int val)
    {
        binarySearch_recursive(0, arr1.length, val);
    }

    void binarySearch_recursive(int start,int end,int val)
    {
         int half=(start+end)/2;
        if(arr1[half]==val)
        {
            System.out.println("\nElement found at index :"+half);
        }else if(val<arr1[half] && half>start)
        {
            binarySearch_recursive(start,half, val);
        }else if(val>arr1[half] && half<end){
            binarySearch_recursive(half,end, val);
        }else{
            System.out.println("Element not found ");
        }
        
    }



        public static void main(String[] args) {
            BinarySearch b1=new BinarySearch();
            int val=100;
            System.out.println("Element to search is: " +val);
            b1.showArray();
            b1.binarySearch(val);
            
            
        }

    
}
