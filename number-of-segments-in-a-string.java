 public int countSegments(String s) {
        s = s.trim();
        if(s.length() == 0) return 0;
        int count = 1;
        for (int i = 1 ; i < s.length() ; i++) {
            if(s.charAt(i) == ' ' && s.charAt(i-1) != ' ') count++;
        }
        return count;
    }
