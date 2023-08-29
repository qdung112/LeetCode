 public int pivotIndex(int[] nums) {
        int right = 0;
        int left = 0;
        for(int n : nums){
            right += n;
        }
        for(int i = 0 ; i < nums.length ; i++){
            if(left == right - left - nums[i]) return i;
            left += nums[i];
        }
        return -1;
    }
