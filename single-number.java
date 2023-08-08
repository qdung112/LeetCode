public int singleNumber(int[] nums) {
        if(nums.length == 1) return nums[0];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length; i ++){
            if(!map.containsKey(nums[i])) {
                map.put(nums[i],1);
            } else {
                map.remove(nums[i]);
            }
        }
        //map.values().toArray()[0]
        //To get the value of the "first" key:
        //map.get(map.keySet().toArray()[0])
        // map.keySet().toArray(new Integer[0])[0]
        // map.keySet().toArray(new Integer[0])[0].intValue();
        return map.keySet().toArray(new Integer[0])[0].intValue();
    }

  int ans=0; //since XOR with 0 returns same number 
        for(int i=0; i<nums.length; i++){
            ans ^= nums[i];  // ans = (ans) XOR (array element at i) 
        }
        return ans;    
