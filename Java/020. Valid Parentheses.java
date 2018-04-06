class Solution {
    public boolean isValid(String s) {
        if(s==null || s.length()== 0) {
            return  true;
        }
        
        Stack<Character> temp = new Stack<Character>();
        char[] c = s.toCharArray();
        
        for(int i=0 ;i< c.length; i++)  {
            char ch = c[i];
            if(ch == '(') {
                temp.push(')');
            } else if( ch == '[' ) {
                temp.push(']');
            } else if(ch == '{'  ){
                 temp.push('}');
            } else {
                if(temp.isEmpty() || temp.pop() != ch  )   
                {
                    return false;
                }
            }
        }
        
        return temp.isEmpty();  
    }
}