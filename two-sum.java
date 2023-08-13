 public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        while( j > i){
            int sum = numbers[i] + numbers[j];
            if(sum > target){
                j--;
            } else if(sum < target){
                i++;
            } else {
                return new int[]{i+1,j+1};
            }
        }
        return null;
    }
