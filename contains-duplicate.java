 public boolean containsDuplicate(int[] nums) {
         if(nums.length == 1) return false;
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length - 1 ; i ++){
            if(nums[i] == nums[i+1]) return true;
        }
        return false;
    }


 public boolean containsDuplicate(int[] nums) {
   HashSet<Integer> set = new HashSet<>();
        for(int n : nums){
            if(!set.add(n)) {
                return true;
            }
        }
            return false;
 }
