class Solution {
    public int reverse(int x) {
        String s = Integer.toString(x);
        char[] c = s.toCharArray();
        String temp ="";
        for(int i = c.length-1; i>=0; i--)
        { 
            if( c[i] == '-')
            {
                temp = c[i] + temp ;  
            }
            else
            {
                temp = temp + c[i];  
            } 
        }
        
        try
        {
            int ans = temp.length() >0 ? Integer.parseInt(temp) : 0;  
            return ans;
        } 
        catch (Exception ex)
        {
            return 0;
        }
    }
}