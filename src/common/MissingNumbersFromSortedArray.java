package common;

/**
 * This solution provides missing values between sorted arrays.
 * It's solved using two pointers technique.
 */
public class SortedArrayMissingNumbers {

    public static void find(int[] numbers) {
        int left = 0;
        for (int right = 1; right < numbers.length; right++) {
            if (numbers[left] + 1 != numbers[right]) {
                int diff = numbers[right] - numbers[left];
                int increment = 1;
                while (diff > 1) {
                    System.out.println(numbers[left] + increment);
                    diff--;
                    increment++;
                }
            } left++;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1,2,4,6,8,13};

        find(numbers);
    }
}

