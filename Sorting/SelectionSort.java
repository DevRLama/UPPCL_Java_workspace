package Sorting;

public class SelectionSort {
        int[] arr1={45,2,65,3,4,98,7,1,84};

        void showArray()
        {
            for(int i=0;i<arr1.length;i++)
            {
                System.out.print(arr1[i]+" ");
            }
        }

       

   

        public static void main(String[] args) {
            SelectionSort s1 =new SelectionSort();
            for(int i=0;i<s1.arr1.length;i++)
            {
                int min=s1.arr1[i];
                int index=i;
                System.out.print("\nPass :" +i+"-->");
                for(int j=i;j<s1.arr1.length;j++)
                {
                    if(s1.arr1[j]<min)
                    {
                        min=s1.arr1[j];
                        index=j;
                    }
                }
                if(index!=i)
                {
                    int temp=s1.arr1[index];
                    s1.arr1[index]=s1.arr1[i];
                    s1.arr1[i]=temp;
                }
                s1.showArray();System.out.print("   ");
            }

        }

}
