package medium.koko_eating_bananas;

import java.util.Arrays;

public class Solution {

    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = Arrays.stream(piles)
                .max()
                .getAsInt();

        while (left < right) {
            int mid = (right + left) / 2;

            if (canEatAll(piles, mid, h)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    private boolean canEatAll(int[] piles, int speed, int h) {
        int hours = 0;
        for (int pile : piles) {
            hours += Math.ceil((double) pile / speed);
        }
        return hours <= h;
    }
}
