import java.util.*;
class Main{
    public static void main(String args[])
    {
        Solution obj = new Solution();
        int[] nums = {0,1,0,3,12};
        obj.moveZeroes(nums);
    }
}

class Solution {
    public void moveZeroes(int[] nums)
    {
        int c=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]!=0)  nums[c++]=nums[i]; 
        }
        for(int i=c;i<n;i++)  nums[i]=0;
        System.out.println(Arrays.toString(nums));
    }
}
