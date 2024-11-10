package easy.smallest_divisible_digit_product_i;

public class Solution {
    public int smallestNumber(int n, int t) {
        while (true) {
            int product = computeDigitProduct(n);
            if (product % t == 0) {
                return n;
            }

            n++;
        }
    }

    private int computeDigitProduct(int n) {
        int product = 1;
        while (n > 0) {
            int digit = n % 10;
            product *= digit;
            n = n / 10;
        }

        return product;
    }
}
