if(needle.length() > haystack.length()) return -1;
        int n = needle.length();
        int j = 0;
        boolean check = true;
        String temp = "";
        for (int i = 0 ; i <= haystack.length() - n ; i ++){
            temp = haystack.substring(i,i + n);
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
