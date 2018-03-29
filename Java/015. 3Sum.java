class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       
        List<List<Integer>> res  = new ArrayList<>();
        Arrays.sort(nums);
        
        for(int i=0 ; i<nums.length-2; i++)
        {     
             if(i>0 && nums[i]== nums[i-1]) continue;
             int mid = i+1, right = nums.length-1, total = 0- nums[i];
             while(mid < right){
                if(nums[mid] + nums[right] == total )
                {
                    res.add(Arrays.asList(nums[i], nums[mid], nums[right]));
                    while(mid < right && nums[mid] == nums[mid+1])  mid++;
                    while(mid < right && nums[right] == nums[right-1])  right--;
                    mid++;
                    right--;
                }else if(nums[mid] + nums[right] < total){
                     mid++ ;
                }else{
                    right--;
                }
            }
        }
        
        return res;
    }
}