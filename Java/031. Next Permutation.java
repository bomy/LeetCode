class Solution {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length == 0) 
            return;
        int n = nums.length;
        int j = n-2;
        while(j>=0 && nums[j]>=nums[j+1])  j--;
        
        if(j<0) {
            reverse(nums, 0, nums.length-1);
            return;
        } 
        
        int i=j+1;
        while(i<n && nums[i]>nums[j])   i++;
        i--;
        swap(nums, i, j );
        reverse(nums, j+1, nums.length-1);
    }
    
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i++] = nums[j];
        nums[j--] = temp;
    }
    
    public void reverse(int[] nums, int i, int j){
        while(i <j){
            swap(nums, i++, j--);
        }
    }
}