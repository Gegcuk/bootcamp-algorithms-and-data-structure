package exercises.c4palindrome;

@FunctionalInterface
interface PalindromeChecker{
    boolean isPalindrome(String s);
}

public class SolutionsWithLambda {
    public static void main(String[] args) {
        PalindromeChecker checker = s -> {
            int tail = s.length()-1;
            for(int i = 0; i < s.length()/2; i++){
                if(s.charAt(i) != s.charAt(tail)) return false;
                tail--;
            }
            return true;
        };

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

        for(String[] testCase : testCases){
            String testString = testCase[0];
            boolean testResult = Boolean.parseBoolean(testCase[1]);
            boolean result = checker.isPalindrome(testString);
            System.out.println("Is \"" + testString + "\" a palindrome? Result: " + result + ", Expected: " + testResult);
        }
    }
}


