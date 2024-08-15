package common;

import java.util.HashMap;
import java.util.Map;

/**
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 */
public class TwoSum {

    public int[] twoSum(int[] numbers, int target) {

        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i<numbers.length; i++) {
            int complement = target - numbers[i];
                if (map.containsKey(complement)) {
                    return new int[] {map.get(complement), i};
                } else {
                    map.put(numbers[i], i);
                }
        }
        throw new IllegalArgumentException("Exception!");
    }
}
