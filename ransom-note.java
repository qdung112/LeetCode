 public boolean canConstruct(String ransomNote, String magazine) {
        char [] rans =  ransomNote.toCharArray();
        char [] maga =  magazine.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for(char c : maga){
            map.put(c,map.getOrDefault(c,0) + 1);
        }
        for(char c : rans){
            if(map.containsKey(c) && map.get(c) > 0){
                    map.put(c,map.get(c) - 1);
            } else {
                return false;
            }
        }
        return true;
    }


public boolean canConstruct(String ransomNote, String magazine) {
		if (ransomNote.length() > magazine.length()) return false;
        int[] alphabets_counter = new int[26];
        
        for (char c : magazine.toCharArray())
            alphabets_counter[c-'a']++;

        for (char c : ransomNote.toCharArray()){
            if (alphabets_counter[c-'a'] == 0) return false;
            alphabets_counter[c-'a']--;
        }
        return true;
    }
