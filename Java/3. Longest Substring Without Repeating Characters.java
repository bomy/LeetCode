public class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] longString = s.toCharArray();
        String  result = "" ;
        String  temp = "";
        int index = 0;

        for(int i=0; i<longString.length; i++)
        {
            index = temp.indexOf(longString[i]);

            if( index< 0)
                temp = temp + longString[i];
            else
                temp = temp.substring(index +1)+ longString[i];

            if( result.length() < temp.length())
                  result = temp ;
            
        }

        return result.length() ;
    }
}
