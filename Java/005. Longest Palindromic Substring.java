public class Solution {
    public String longestPalindrome(String s) {
        char[] longString = s.toCharArray();
        int strLength = longString.length;
        String temp = "";
   
        if(longString.length<2)
        {
            return s;
        }
        
        String answer = ""+longString[0];
        
        for(int i=0; i<strLength; i++)
        { 
            temp = temp + longString[i];
            int tempLength = temp.length() ;
            if(tempLength >= 2)
            {
                String Check = CheckAfterString(temp, longString, i, answer);
                if(Check.length() > answer.length())
                {
                    answer = Check;
                }
                temp = temp.substring(1, tempLength ); 
            } 
        }
        
        return answer;
    }
    
    public String CheckAfterString(String temp, char[] longString, int i, String answer)
    {
        String result = "";
        String checktemp = temp;
        for(int j=i; j< longString.length; j++)
        {
            if (j> i) {
                checktemp = checktemp + longString[j ];
            }
       
            if( CheckPalindromic(checktemp) )
            {
                result = checktemp;
            }
        }

        return result; 
    }
    
    public boolean CheckPalindromic(String temp)
    {
        char[] tempChar = temp.toCharArray();
        int tempLength = temp.length() ;

        for(int j=0; j<tempLength/2; j++)
        {
            if(tempChar[j] != tempChar[tempLength -j -1] )
            {
                return false;
            }
        }

        return  true;
    }
}