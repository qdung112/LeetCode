public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        //List<List<Integer>> list = new ArrayList<>();
        for(int i = 0 ; i < nums.length ; i ++){
            int j = i + 1;
            int k = nums.length - 1;
            while(j < k ){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    //set.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    set.add(list);
                    j++;
                    k--;
                } else if(sum < 0){
                    j++;
                } else {
                    k--;
                }
            }
        }
        List<List<Integer>> list = new ArrayList<>(set);
        // list.addAll(set);
        return list;
    }
