package common;

public class PalindromeNumber {

    public static boolean isPalindrome(int number) {
        int reversed = 0;
        int temp = number;

        while (temp > 0) {
            int digit = (int) temp % 10;
            reversed = reversed * 10 + digit;
            temp = temp/10;
        }
        return number == reversed;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121)); //true
        System.out.println(isPalindrome(-121)); //false
        System.out.println(isPalindrome(127)); //false
    }
}
