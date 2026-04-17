class Solution {

    public static boolean isHappy(int n) {
        boolean isHappy = false;
        while (n == 1) {
            isHappy = true;
            int sum = 0;
            while (n != 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            n = sum
        }
        return isHappy;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
}
