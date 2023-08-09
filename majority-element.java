 public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i = 0 ; i < nums.length ; i ++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);    
        }
        n = n/2;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                    if (entry.getValue() > n) {
                          return entry.getKey();
                        }
                      }
        return 0;
    }

public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;
        
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        
        return candidate;
    }

 public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n/2];
    }
