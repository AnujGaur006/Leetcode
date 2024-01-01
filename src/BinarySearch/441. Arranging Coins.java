package BinarySearch;

class ArrangingCoins {
    public int arrangeCoins(int n) {
        int left = 1;
        int right = n;
        long completedRows = 0;

        while(left <= right){
            long mid = left + (right - left)/2;
            long coinsUsed = mid*(mid+1)/2;

            if(coinsUsed > n) {
                right = (int) mid - 1;
            }else {
                completedRows = (int) Math.max(completedRows, mid);
                left = (int) mid + 1;
            }
        }
        return (int)completedRows;
    }
}
