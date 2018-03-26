// 採DP解法 分兩種比對方式
//1. 先一般字串比對
//2. "*"類型比對

class Solution {
    public boolean isMatch(String s, String p) {
         if(p.length() == 0)
            return s.length() == 0;
          
        if( p.length() == 1 ||  p.charAt(1) != '*')
        {
            if(  s.length()>0 && (s.charAt(0)== p.charAt(0)|| p.charAt(0) == '.' ))
            {
               return isMatch(s.substring(1), p.substring(1)); 
            } 
        
            return false;    
        }
        else
        {
            int len = s.length();
 
            int i = -1; 
            while(i<len && (i < 0 || p.charAt(0) == '.' ||  s.charAt(i) == p.charAt(0)))
            {
                if( isMatch(s.substring(i+1), p.substring(2))    )
                    return true;
                i++;
            }
            return false;
            
        }
    }
}