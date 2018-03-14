class Solution {
    public String convert(String s, int numRows) {
        char[] c = s.toCharArray();
        int len = c.length; 
        String[] result = new String[numRows];
        for(int indx=0;indx<numRows;indx++)
        {
            result[indx] = "";  
        }

        int i = 0;
        while( i <c.length)
        {
            for(int indx=0;indx<numRows&& i < len; indx++)
            {
                result[indx] = result[indx] + c[i++]; 
            }
            
            for(int indx=numRows-2 ;indx>0&& i < len;indx--)
            {
                result[indx] = result[indx] + c[i++];  
            }
        }
        
       String ans = "";
       for(int indx=0;indx<numRows;indx++)
       {
           ans = ans + result[indx];  
       }
        
        return  ans ;
    }
}