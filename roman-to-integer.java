 public int romanToInt1(String s) {
        int result = 0;
        Map<String,Integer> map = new HashMap<>();
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);
        map.put("IV",4);
        map.put("IX",9);
        map.put("XL",40);
        map.put("XC",90);
        map.put("CD",400);
        map.put("CM",900);
        String temp = "";
        int n = s.length();
        int i = 0;
        while(i < n ){
            temp = s.substring(i,i+2>n?i+1:i+2);
            if(map.containsKey(temp)){
                result += map.get(temp);
                i+=2;
            } else {
                result += map.get(s.substring(i,i+1));
                i++;
            }
        }
        return result;
    }

 public int romanToInt2(String s) {
        int result = 0;
        Map<Character,Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        for (int i = 0; i < s.length(); i++) {
        char ch = s.charAt(i);
        int value = map.get(ch);
        if (i < s.length() - 1 && value < map.get(s.charAt(i+1))) {
            result -= value;
        } else {
            result += value;
        }
    }
        return result;
  }
