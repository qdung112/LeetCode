public int[] sortArrayByParityII(int[] nums) {
        int odd = 1;
        int even = 0;
        while(true){
            while(even<nums.length && nums[even]%2 == 0){
                even += 2;
            }
            while(odd<nums.length && nums[odd]%2 == 1){
                odd += 2;
            }

            if(odd >= nums.length || even >= nums.length) break;

            int temp = nums[odd];
            nums[odd] = nums[even];
            nums[even] = temp;
        }
        return nums;
    }

  public int[] sortArrayByParityII2(int[] nums) {
        int odd = 1;
        int even = 0;
        int[] res = new int[nums.length];
        for(int a: nums){
            if(a%2==0){
                res[even] = a;
                even += 2;
            }else{
                res[odd] = a;
                odd+=2;
            }
        }
        return res;
    }
