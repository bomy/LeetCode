class Solution {
    public String intToRoman(int num) {

        String  roman[] = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int value[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1}; 
 
        String ans = "";
  
         for (int j = 0; j <= 12; j++) 
         {
            int x = num/value[j];
            for(int i =0 ; i<x; i++)
            {
                ans = ans + roman[j] ;
            }
            num = num % value[j];
         }    
        return ans;
    }
}