class Solution {
    public int maxArea(int[] height) {
        int result = 0;
        int L = 0;
        int R =  height.length-1;
        while(L<R)
        { 
            int H = Math.min(height[L], height[R]);
            result = Math.max(result, H * (R - L));
            if(height[L] <  height[R])
            {
                L++;
            }else{
                R--;
            }
        }
        
        return result;
    }
}