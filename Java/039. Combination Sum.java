class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> result = new ArrayList<>();
		if(candidates == null || candidates.length == 0)
		{
			return result;
		}
		
		helper(result, new ArrayList<>(), candidates, target, 0);
		
		return result;
    }
	
	public void helper(List<List<Integer>> result, List<Integer> list, int[] candidates, int target, int start){
		if(target < 0) return ;
		if(target == 0){
			result.add(new ArrayList<>(list));
			return;
		}
		
		for(int i = start; i < candidates.length; i++){
			list.add(candidates[i]);
			helper(result, list, candidates, target - candidates[i], i);
			list.remove(list.size()-1);
		}
		
	}
}