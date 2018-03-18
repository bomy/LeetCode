class Solution {
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        char[] tempChar =  s.toCharArray();
        int tempLength =  s.length() ;

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