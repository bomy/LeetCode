public class Solution {
    public int[] twoSum(int[] nums, int target)
    {
        int[] result = new int[2];
        for (int i = 0; i <= nums.length-1; i++) {
            int x = target - nums[i];
            for (int j = 0; j <= nums.length-1; j++)
            {
                if(i==j) continue;
                if(x == nums[j])
                {
                    result[0] = i;
                    result[1] = j;
                    return  result;
                }
            }
        }
         return  result;
    }
}
