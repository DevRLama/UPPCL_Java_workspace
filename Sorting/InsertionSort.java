package Sorting;

import javax.lang.model.util.ElementScanner14;

public class InsertionSort {
    int[] arr1={45,2,65,3,4,98,7};

    void showArray()
    {
        for(int i=0;i<arr1.length;i++)
        {
            System.out.print(arr1[i]+" ");
        }
    }


    public static void main(String[] args) {
        InsertionSort b1=new InsertionSort();
        for(int i=0;i<b1.arr1.length;i++)
        {
            int temp=b1.arr1[i];
            System.out.print("\nPass :" +i+"-->");
            for(int j=i-1;j>=0;j--) 
            {       
                if(b1.arr1[j]>temp)
                {
                    b1.arr1[j+1]=b1.arr1[j];
                    if(j==0)
                    {
                        b1.arr1[0]=temp;
                    }
             
                }else
                {
                    b1.arr1[j+1]=temp;
                    break;
                }
            }
                b1.showArray();System.out.print("   ");

        }
            
    }

}


