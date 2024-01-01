package BinarySearch;

public class BinarySearchIn2DArray {
    public boolean searchMatrix(int[][] matrix, int target) {
        //i = 0,  j = 3
        int i = 0, j = matrix[0].length - 1;
        while (i < matrix.length && j >= 0) {
            if (matrix[i][j] == target) {
                return true;
            } else if (matrix[i][j] > target) { //
                j--;
            } else {
                i++;
            }
        }
        return false;

    }

    public boolean searchMatrix2(int[][] matrix, int target) {
        if(matrix.length == 0) return false;

        int row = matrix.length;
        int cols = matrix[0].length;

        int low = 0;
        int high = row*cols;

        while(low < high){
            int mid = (low + high )/2;

            if(matrix[mid/cols][mid%cols] == target) {
                return true;
            } else if (matrix[mid/cols][mid%cols] < target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return false;
    }
}
