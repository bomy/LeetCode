class Solution {
    public int myAtoi(String str) {
        if (str == null || str.length() == 0) 
            return 0;  
        
        str = str.trim();  
        
        int sign = 1;
        int j =0;
        if(str.charAt(0) == '-') {
            sign = -1;
            j++;
        } else if(str.charAt(0) == '+') {
            j++;
        }
        
        double result = 0;
        for(int i = j; i<=str.length()-1;i++ )
        {
            int digit = str.charAt(i) - '0';
            if(digit<0 || digit>9)
                 break;  
            
            result = result*10+ digit;
        }
        
        result = result * sign;
        if(Integer.MAX_VALUE < result  )
        {
            result = Integer.MAX_VALUE;
        }
        else if(  Integer.MIN_VALUE > result)
        {
            result = Integer.MIN_VALUE;
        }
            
        int ans = (int)result;
        return ans;
    }
}