 public String mergeAlternately(String word1, String word2) {
        StringBuilder res = new StringBuilder();
        int len1 = word1.length();
        int len2 = word2.length();
        int i = 0,j = 0;
        while(i < len1 || j < len2){
            if(i < len1){
                res.append(word1.charAt(i++));
            }
            if(j < len2){
                res.append(word2.charAt(j++));
            }
        }
        return res.toString();
    }
