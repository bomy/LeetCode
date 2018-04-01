class Solution {
    
    private String Mapping[] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    
    public List<String> letterCombinations(String digits) {
        List<String> res  = new ArrayList<>();
        if(digits ==null || digits.length() == 0) {
            return res;
        }
        
        findLettComb(res, digits,"", 0);
        return res;
    }
  
    public void findLettComb( List<String> res, String digits, String s, int index) {
        if(index == digits.length()) {
            res.add(s);
            return;
        }
        
        String letters = Mapping[digits.charAt(index) - '0'];
        for(int i = 0; i< letters.length() ;i++) {
            findLettComb( res,  digits,  s + letters.charAt(i),  index + 1); 
        }
    }
}