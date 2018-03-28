class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        if(strs.length == 0)
        {
            return "";
        }
      
        String Min = strs[0];
        
        for(int i=0 ; i<strs.length;i++)
        {
            if(Min.length()>strs[i].length())
            {
                Min  = strs[i];
            }
        }
        
        String res = "";
        int j =0;

        char[] Small = Min.toCharArray();
        while(j<Min.length())
        {
            for(int i=0 ; i<strs.length;i++)
            {
                 char[] c = strs[i].toCharArray();
                if( Small[j] != c[j] )
                {
                    return res;
                }
            }
            res = res + Small[j] ;
            j++;
        }
        
        return res;
    }
}
