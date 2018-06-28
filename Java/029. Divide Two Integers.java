/*
x*2^i = x<<i
*/
class Solution {
    public int divide(int dividend, int divisor) {
        
        if(dividend==Integer.MIN_VALUE && divisor==-1) 
            return Integer.MAX_VALUE;  //overflow
                
        int sign = 1;
        if((dividend<0 && divisor>0) || (dividend>0 && divisor<0))  
            sign = -1;
        
        long dvd = Math.abs((long)dividend);
        long dvs = Math.abs((long)divisor);
        long dvs_original = dvs;
        
        int res = 0;
        int i = 0;
        while(dvs<<(i+1) <= dvd)
            i++;
        
        while(dvd>=dvs_original) {
            if(dvd >= dvs<<i) {
                dvd = dvd - (dvs<<i);
                res = res+ (1<<i);
            }
            i--;
        }
        
        return sign* res ;
    }

}