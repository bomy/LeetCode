public class Solution {
    public int[] twoSum(int[] nums, int target)
    {
    int[] result = new int[2];
       for (int i = 0; i <= nums.length-1; i++) {
            if(nums[i] > target)
                continue;
            else
            {
                int x = target - nums[i];
                for (int j = 0; j <= nums.length-1; j++)
                {
                     if(nums[j] == nums[i] || x > nums[j]) continue;
                     if(x == nums[j])
                     {
                         result[0] = i;
                         result[1] = j;
                         return  result;
                     }
                 }
            }

        }
         return  result;
    }
}
