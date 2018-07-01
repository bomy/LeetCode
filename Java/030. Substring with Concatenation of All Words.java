class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        if(s.length() == 0 || words.length == 0) 
            return  new ArrayList<>();
        
        List<Integer> res = new ArrayList<>();
        
        int n = words.length;
        int m = words[0].length();
        HashMap<String, Integer> map = new HashMap<>();
        
        for(String str : words){
            map.put(str, map.getOrDefault(str, 0)+1);
        }
        
        for(int i =0; i<= s.length()-n*m;i++){
            HashMap<String, Integer> copy = new HashMap<>(map);
            int k = n;
            int j = i;
            while(k > 0){
                String str = s.substring(j, j + m);
                
                if(!copy.containsKey(str) || copy.get(str) < 1){
                    break;
                }
                copy.put(str, copy.get(str) -1);
                k--;
                j =j + m;
            }
            
            if(k == 0) res.add(i);
        }
        
        return res;
    }
}