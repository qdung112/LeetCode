public boolean isAnagram(String s, String t) {
        /* int lenS = s.length();
        int lenT = t.length();
        if(lenS != lenT) return false;
        for(int ) */

        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        
        return Arrays.equals(sChars, tChars);
    }

public boolean isAnagram(String s, String t) {
     Map<Character,Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0) + 1);
        }

        for(char c : t.toCharArray()){
            map.put(c,map.getOrDefault(c,0) - 1);
        }

        for(int val : map.values()){
            if(val != 0) return false;
        }
        return true;
}


public boolean isAnagram(String s, String t) {

          int[] count = new int[26];
        
        // Count the frequency of characters in string s
        for (char x : s.toCharArray()) {
            count[x - 'a']++;
        }
        
        // Decrement the frequency of characters in string t
        for (char x : t.toCharArray()) {
            count[x - 'a']--;
        }
        
        // Check if any character has non-zero frequency
        for (int val : count) {
            if (val != 0) {
                return false;
            }
        }
        
        return true;
    }
