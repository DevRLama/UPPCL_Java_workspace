package Sorting;

public class QuickSort {

    int[] arr1={45,2,65,3,4,98,7,65};

        void showArray()
        {
            for(int i=0;i<arr1.length;i++)
            {
                System.out.print(arr1[i]+" ");
            }
        }
    void quick_recursive(int start,int end)
        {
            if(start<end)
            {
               int loc=partition(start,end);
               //System.out.println(); showArray();
               quick_recursive(start, loc-1);
               quick_recursive(loc+1, end); 
            }
        }

    int partition(int lb,int ub)
    {
        int pivot=arr1[lb];
        int start=lb,end=ub;
        while(start<end){

            while(arr1[start]<pivot)
            {
                start++;
            }
            while(arr1[end]>pivot)
            {
                end--;
            }
            if(start<end)
            {
                int temp=arr1[start];
                arr1[start]=arr1[end];
                arr1[end]=temp;
            }

        }
        //arr1[lb]=arr1[end];
        arr1[end]=pivot;
        System.out.println(); showArray();
        return end;

    }  

    public static void main(String[] args) {
        QuickSort q1=new QuickSort();
        q1.quick_recursive(0, q1.arr1.length-1);
        System.out.println("\nSorted Array:");
        q1.showArray();

    }

    

    
    
}
