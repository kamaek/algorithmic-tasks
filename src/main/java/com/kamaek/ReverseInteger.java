package com.kamaek;

/**
 * Given a signed 32-bit integer x, return x with its digits reversed.
 * If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 *
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 */
public class ReverseInteger {

    public static int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int remainder = x % 10;
            long newResult = (long) result * 10 + remainder;
            boolean isOverflow = (int) newResult != newResult;
            if (isOverflow) {
                return 0;
            }
            result = (int) newResult;
            x /= 10;
        }
        return result;
    }
}
