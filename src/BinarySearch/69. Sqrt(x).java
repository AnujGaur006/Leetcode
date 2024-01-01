package BinarySearch;

class SquareRoot {
    public int mySqrt(int x) {
        int left = 1,right = x;
        if(x == 0) return 0;

        while(left < right){
            int mid = left + (right - left)/2;
            if(mid <= x/mid && (mid + 1) > x/(mid + 1)){
                return mid;
            }
            else if(mid > x/mid){
                right = mid;
            }else left = mid + 1;
        }
        return left;
    }
}
