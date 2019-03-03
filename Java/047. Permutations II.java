/**
Input: [1,1,2]
Output:
[
  [1,1,2],
  [1,2,1],
  [2,1,1]
]
*/
//time: O(n!) space:O(n);
class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) 
	{
        List<List<Integer>> res = new ArrayList<>();
		if(nums == null || nums.length == 0)
			return res;
		
		Arrays.sort(nums);
		helper(res, new ArrayList<>(), nums, new boolean[nums.length]);
		return res;
    } 
	
	public static void helper(List<List<Integer>> res, List<Integer> list, int[] nums, boolean[] used){
		if(list.size() == nums.length)
		{
			res.add(new ArrayList<>(list));
			return;
		}
		
		for(int i =0; i<nums.length; i++)
		{
			if(used[i] || i>0 && nums[i] == nums[i-1] && !used[i-1] )
				continue;
			used[i] = true;
			list.add(nums[i]);
			helper(res, list, nums, used);
			used[i] = false;
			list.remove(list.size()-1);
		}
	}
}
