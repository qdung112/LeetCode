 public int firstUniqChar(String s) {
        int ans = Integer.MAX_VALUE;
        for(char c = 'a' ; c <= 'z'; c++){
            int index = s.indexOf(c);
            if(index != -1 && index == s.lastIndexOf(c)){
                ans = Math.min(ans,index);
            }
        }
        return ans == Integer.MAX_VALUE? -1:ans;
}

   public int firstUniqChar(String s) {
       int table[] = new int[26];
        for(int i=0; i<s.length(); i++){
            table[s.charAt(i) - 'a']++;
        }
     
        for(int i=0; i<s.length(); i++){
            if(table[s.charAt(i) - 'a'] == 1){
                return i;
            }
        }
        return -1;
    }

 for(char c : s.toCharArray()){
            if(s.indexOf(c) == s.lastIndexOf(c)) return s.indexOf(c);
       }
       return -1; 
