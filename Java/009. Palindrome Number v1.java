class Solution {
    public boolean isPalindrome(int x) {
        
        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int input =  x;
        int revertedNumber = 0;
        while(x>0) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x = x/10;
        }
        
        return ((input - revertedNumber)==0);
    }
}