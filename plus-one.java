public int[] plusOne(int[] digits) {
        for(int i = digits.length - 1; i >= 0; i --){
                if(digits[i] < 9){
                    digits[i] ++;
                    return digits;
                } else {
                        digits[i] = 0;
                        if( i == 0 ){
                          return createNewArr(digits);
                        }
                }
            }
                    return digits;    
        }
    public static int[] createNewArr(int[] oldArr){
        int [] newArr = new int[oldArr.length + 1];
        for(int j = 1; j < newArr.length; j++ ){
            newArr[j] = 0;
        }
        newArr[0] = 1;
        return newArr;
    }

public int[] plusOne(int[] digits) {
  for (int i = digits.length - 1; i >= 0; i--) {
                if (digits[i] < 9) {
                    digits[i]++;
                    return digits;
                }
                    digits[i] = 0;
            }

                digits = new int[digits.length + 1];
                digits[0] = 1;
                return digits;
}
