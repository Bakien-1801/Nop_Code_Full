package Oop_basic;

public class RunningNumber {
    public static int numOfDigits(int n) {
        return String.valueOf(n).length();
    }

    public static String length(int n) {
        if (n == 1) {
            return "1";
        } else {
            return length(n - 1) + numOfDigits(n);
        }
    }

    public static void main(String[] args) {

        System.out.println(length(12));
    }
}
