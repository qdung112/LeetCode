public int strStr(String haystack, String needle) {
        if(needle.length() > haystack.length()) return -1;
        int needlength = needle.length();
        int j = 0;
        boolean check = true;
        String temp = "";
        for (int i = 0 ; i <= haystack.length() - needlength ; i ++){
            temp = haystack.substring(i,i + needlength);
            j = i;
            check = true;
            for(int k = 0; k < n; k++){
                if(needle.charAt(k) != temp.charAt(k)){
                    check = false;
                    break;
                }
            }
            if(check) {return j;}
        }
        return -1;
    }

public int strStr1(String haystack, String needle) {
        int haylength = haystack.length();
        int needlength = needle.length();
        if(needlength > haylength) return -1;
        for (int i = 0 ; i <= haylength - needlength ; i ++){
            if(haystack.substring(i,i + needlength).equals(needle)){
                return i;
            }
        }
        return -1;
    }
