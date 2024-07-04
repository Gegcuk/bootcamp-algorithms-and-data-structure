package exercises.palindrome;

public class Solution {
    public boolean isPalindrome(String s){
        int tail = s.length() - 1;
        for(int i = 0; i < s.length()/2; i++){
            if(s.charAt(i) != s.charAt(tail)){
                return false;
            }
            tail--;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases with expected results
        String[][] testCases = {
                {"racecar", "true"}, // true
                {"hello", "false"},   // false
                {"madam", "true"},   // true
                {"java", "false"},    // false
                {"level", "true"},   // true
                {"", "true"},        // true (empty string is considered a palindrome)
                {"a", "true"},       // true (single character is a palindrome)
                {"abccba", "true"},  // true
                {"abc", "false"},     // false
                {"A man, a plan, a canal, Panama", "false"} // false due to spaces and case sensitivity
        };

        // Testing the isPalindrome function
        for (String[] testCase : testCases) {
            String testString = testCase[0];
            boolean expectedResult = Boolean.parseBoolean(testCase[1]);
            boolean result = solution.isPalindrome(testString);
            System.out.println("Is \"" + testString + "\" a palindrome? Result: " + result + ", Expected: " + expectedResult);
        }
    }
}
