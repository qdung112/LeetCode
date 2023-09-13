 public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;
        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == target) return true;
            if(matrix[row][col] < target){
                row++;
            } else {
                col--;
            }
        }
        return false;
    }

 public boolean searchMatrix(int[][] matrix, int target) {
        int left = 0;
        int row = matrix.length;
        int col = matrix[0].length;
        int right = row*col - 1;
        
        while(left <= right){
            int mid = left + (right - left) / 2;
            int curr = matrix[mid/col][mid % col];
            if(curr == target)  return true;
            if(curr < target){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
