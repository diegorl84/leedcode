package longest_substring_without_repeating_characters;

import java.util.HashSet;
import java.util.Set;

/**
 * 3. Longest Substring Without Repeating Characters
 * Given a string s, find the length of the longest substring without repeating characters.
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {

        char[] letters = s.toCharArray();
        int max = 0;
        Set<Character> temp = new HashSet<>();

        if (letters.length == 0) {
            return 0;
        }
        int max_temp = 0;
        for (int i = 0; i < letters.length; i++) {
            for (int j = i; j < letters.length; j++) {
                if (temp.add(letters[j])) {
                    max_temp++;
                } else {
                    break;
                }
            }
            max = max_temp > max ? max_temp : max;
            max_temp = 0;
            temp.clear();
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "pwwkew";
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLongestSubstring(s));

    }
}
