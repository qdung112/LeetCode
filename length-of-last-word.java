   public int lengthOfLastWord(String s) {
        int result = 0;
        for(int i = s.length() - 1; i >= 0; i --){
            if(s.charAt(i) != ' '){
                result++;
                if(i != 0){
                    if(s.charAt(i-1) == ' '){
                          return result;                  
                    }
                }         
            }
        }
        return result;
    }
      
public int lengthOfLastWord(String s) {
        
        s = s.trim();
        int lastSpaceIndex = s.lastIndexOf(' ');
        
        if (lastSpaceIndex == -1) {
            return s.length();
        }
        return s.length() - lastSpaceIndex - 1;
    }
