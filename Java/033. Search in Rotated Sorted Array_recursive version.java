class Solution {
    public int search(int[] nums, int target) {
        return searchRotatedSorted(nums, 0, nums.length-1, target);
    }
    
    public int searchRotatedSorted(int[] nums, int start, int end, int target) {
        if(start>end) 
            return -1;
        
        int mid = (end-start)/2 + start;
        
        if(nums[mid] == target) 
            return mid;
        
        if(nums[mid]<nums[end]) { 
            if(target>nums[mid] && target<=nums[end])
                return searchRotatedSorted(nums, mid+1, end, target);
            else
                return searchRotatedSorted(nums, start, mid-1, target);
        }
        else {  
            if(target>=nums[start] && target<nums[mid]) 
                return searchRotatedSorted(nums, start, mid-1, target);
            else
                return searchRotatedSorted(nums, mid+1, end, target);
        }
    }
}