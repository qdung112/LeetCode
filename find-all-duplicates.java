 public List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                list.add(nums[j]);
            }
        }
        return list;
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

 public List<Integer> findDuplicates(int[] nums) {
       List<Integer> res = new ArrayList<>();
       int [] count = new int [1000001];
       for(int n : nums){
           count[n]++;
           if(count[n] == 2) res.add(n);
       } 
       return res;
    }
