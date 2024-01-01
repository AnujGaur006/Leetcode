package BinarySearch;

import java.util.Arrays;

class ShipWithinDays {
    public int shipWithinDays(int[] weights, int days) {

        int l = Arrays.stream(weights).max().getAsInt();
        int r = Arrays.stream(weights).sum();
        int res = r;

        while(l <= r){
            int cap = (l + r)/2;

            if(canShip(cap, weights, days)){
                res = Math.min(res,cap);
                r = cap - 1;
            }else l = cap + 1;
        }

        return res;
    }

    public boolean canShip(int capacity, int[] weights, int days){
        int ship = 1;
        int currCap = capacity;

        for(int weight : weights){
            if(currCap - weight < 0){
                ship++;
                currCap = capacity;
            }
            currCap -= weight;
        }

        return ship <= days;
    }
}
