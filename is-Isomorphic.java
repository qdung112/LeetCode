public boolean isIsomorphic(String s, String t) {
        //if(s.length() != t.length()) return false;
        Map<Character,Character> map = new HashMap<>();
        //char [] charS = s.toCharArrays;
        //char [] charT = t.toCharArrays;
        for(int i = 0 ; i < s.length() ; i ++){
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            if(map.containsKey(charS)){
                if(map.get(charS) != charT){
                    return false;  
                }  
            } else {
                if(map.containsValue(charT)){
                    return false;
                }
                map.put(charS,charT);
            }
        }
        return true;
    }
 public boolean isIsomorphic(String s, String t) {
     Map<Character, Integer> map1 = new HashMap<>();
     Map<Character, Integer> map2 = new HashMap<>();

     for(Integer i = 0; i <s.length(); i ++) {
         if(map1.put(s.charAt(i), i) != map2.put(t.charAt(i), i))
         return false;
     }
     return true;
    }
