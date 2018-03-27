class Solution {
    public int romanToInt(String s) {
    String  roman[] = {"M", "CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
         int value[] = {1000,900,500,400 ,100 ,90  ,50 ,40 ,10,  9,   5,  4,    1}; 
         int res = 0 ;
         int index = 0;
         for (int j = 0; j <= 12; j++) 
         {
            String V = roman[j];
            int Vlen = V.length();   
            while(index < s.length())
            {
                int x = s.indexOf(V, index);   
                if(index == x)
                {
                     res = res +  value[j];
                     index = index + Vlen;
                }
                else
                    break;
            }
         } 
         return res;
    }
}



    
