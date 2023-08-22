  public char findTheDifference(String s, String t) {
       int num = 0;
       for(int i : s.toCharArray()){
           num -= i; 
       }
       for(int i : t.toCharArray()){
           num += i; 
       }
       return (char)num;
    }

 public char findTheDifference(String s, String t) {
        int [] countS = new int[26];
        int [] countT = new int[26];
   
        for(char c : s.toCharArray()){
            countS[c - 'a'] ++;
        }
        for(char c : t.toCharArray()){
            countT[c - 'a'] ++;
            if(countT[c - 'a'] > countS[c - 'a']) return c;
        }
        return 0;
    }
