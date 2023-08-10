public boolean isSubsequence(String s, String t) {
        int j = 0;
        int lenS = s.length();
        int lenT = t.length();
        if(lenS == 0) return true; 
        for(int i = 0; i < lenT ; i++){
            if(s.charAt(j) == t.charAt(i)){
                j++;
            }
            if(j == lenS) return true;
        }
        return false;
    }

public boolean isSubsequence(String s, String t) {
        int i=0,j=0;
        int n=t.length();
        int m=s.length();
        char ss[]=s.toCharArray();
        char tt[]=t.toCharArray();

        if(m<1)
            return true;

        while(i<n){
            if(tt[i]==ss[j]){
                j++;
            }
            i++;
            
        if(j==m)
            return true;
        }

            return false;
        }
