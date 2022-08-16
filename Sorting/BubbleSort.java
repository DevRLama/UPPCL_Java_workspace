package Sorting;

public class BubbleSort {
    
int[] arr1={45,2,65,3,4,98,7};

    

    void showArray()
    {
        for(int i=0;i<arr1.length;i++)
        {
            System.out.print(arr1[i]+" ");
        }
    }

    public static void main(String[] args) {
        BubbleSort b1=new BubbleSort();
        for(int i=0;i<b1.arr1.length-1;i++)
        {
            System.out.print("\nPass :" +i+"-->");
            for(int j=0;j<b1.arr1.length-i-1;j++)
            {
               
                if(b1.arr1[j]>b1.arr1[j+1] )
                {
                    b1.swap(j,j+1);
                }
                b1.showArray();System.out.print("   ");

            }
            
        }
    }

}
