package leetcode;

import java.util.ArrayList;

class NumArray {

    ArrayList<Integer> num_array=new ArrayList<>();
    public NumArray(int[] nums) {
        
        for (int i = 0; i < nums.length; i++)
            num_array.add(nums[i]);
      
    }
    
    public void update(int index, int val) {
        this.num_array.set(index, val);
    }
    
    public int sumRange(int left, int right) {
        int sum=0;
        for(int i=left;i<right;i++)
        {
            sum=sum+num_array.get(i);
        }
        return sum;
    }
}


public class OperationOnNumArray {
    public static void main(String[] args) {
        int [] n_array={1,3,5};
        NumArray obj=new NumArray(n_array);
        obj.update(1, 2);
        System.out.println(obj.sumRange(0, 2));
    }
}
