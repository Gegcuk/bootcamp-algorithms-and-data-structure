package exercises.maxChars;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public Character maxChars(String s){
        if(s.isEmpty()) return ' ';
        Map<Character, Integer> charsMap = new HashMap<>();
        for (char ch : s.toCharArray()){
            int count = charsMap.getOrDefault(ch, 0) + 1;
            charsMap.put(ch, count);
        }
        char maxchar = s.charAt(0);
        int currentMax = charsMap.get(maxchar);
        for(char ch : charsMap.keySet()){
            if(charsMap.get(ch) > currentMax){
                maxchar = ch;
                currentMax = charsMap.get(ch);
            }
        }
        return maxchar;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases with expected results
        String[][] testCases = {
                {"hello", "l"},         // l (appears twice)
                {"test", "t"},          // t (appears twice)
                {"java", "a"},          // a (appears twice)
                {"character", "c"},     // c (appears twice)
                {"example", "e"},       // e (appears twice)
                {"aaaabbbb", "a"},      // a (appears four times, b also appears four times)
                {"abcd", "a"},          // a (all appear once, but return the first in order)
                {"mississippi", "i"},   // i (appears four times)
                {"", " "},              // No characters, expect a placeholder or handle as needed
                {"aabbbcc", "b"}        // b (appears three times)
        };

        // Testing the maxChars function
        for (String[] testCase : testCases) {
            String testString = testCase[0];
            String expectedResult = testCase[1];
            char result = solution.maxChars(testString);
            System.out.println("Max char in \"" + testString + "\" is \"" + result + "\", Expected: \"" + expectedResult + "\"");
        }
    }
}
