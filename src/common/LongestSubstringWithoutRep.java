package common;

import java.util.HashSet;
import java.util.Set;

public class LongestNonRepeatingSubstring {

    public static int find(String s) {
        int left = 0;
        int right = 0;
        int max = 0;
        Set<Character> set = new HashSet<>();

        while(right < s.length()) {
            if (! set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                max = Math.max(set.size(), max);
                right++;
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(find(s));
    }
}
