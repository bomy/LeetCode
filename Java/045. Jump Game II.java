class Solution {
    public int jump(int[] nums) {
        if(nums == null || nums.length <2)
			return 0;
		int level = 0;
		int curMaxArea = 0;
		int maxNext = 0;
		int i =0;
		
		while(curMaxArea - i+1 <0)
		{
			level++;
			for(; i< curMaxArea ;i++)
			{
				maxNext = Math.max(maxNext, i + nums[i]);
				if(maxNext > nums.length-1)
				{
					return level;
				}			
			}			
		}
		
		return res;
    }
	
	public int jump2(int[] nums) {
        if(nums == null || nums.length <2)
			return 0;
		int res = 0;
		int curMaxArea = 0;
		int maxNext = 0;
		for(int i = 0; i< nums.length -1 ;i++)
		{
			maxNext = Math.max(maxNext, i + nums[i]);
			if(i == curMaxArea)
			{
				res++;
				curMaxArea = maxNext;
			}
		}
		
		return res;
    }
}