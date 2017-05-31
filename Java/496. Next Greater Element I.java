public class Solution {
    public int[] nextGreaterElement(int[] findNums, int[] nums)
    {
        int[] result = new int[findNums.length];

        for ( int i = 0;i<findNums.length;i++)
        {
            for(int j = 0 ;j<nums.length;j++)
            {
                if(findNums[i] == nums[j])
                {
                    for(int k = j+1 ;k<nums.length;k++)
                    {
                        if(k == nums.length)
                        {
                            result[i] =-1;
                        }
                        else if(nums[k]>nums[j])
                        {
                            result[i] = nums[k];
                            break;
                        }
                    }
                }

              if( result[i]> 0)
                break;
               result [i] =-1;
            }
        }
        return result;
    }
}
