package exercises.senctenceCapitalization;

public class Solution {
    public String capitalize(String s){
        StringBuilder resultString = new StringBuilder();
        boolean spaceFlag = true;

        for(char ch : s.toCharArray()){
            if(spaceFlag && Character.isLowerCase(ch)) ch = Character.toUpperCase(ch);
            if(ch == ' ') {
                spaceFlag = true;
                resultString.append(ch);
            }
            else {
                resultString.append(ch);
                spaceFlag = false;
            }
        }
        return resultString.toString().trim();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases with expected results
        Object[][] testCases = {
                {"hello world", "Hello World"},
                {"java is fun", "Java Is Fun"},
                {"capitalize each word", "Capitalize Each Word"},
                {"this is a test", "This Is A Test"},
                {"open ai", "Open Ai"},
                {"a b c", "A B C"},
                {"singleword", "Singleword"},
                {"  leading spaces", "Leading Spaces"},
                {"trailing spaces  ", "Trailing Spaces"}
        };

        // Testing the capitalize function
        for (Object[] testCase : testCases) {
            String testString = (String) testCase[0];
            String expectedResult = (String) testCase[1];
            String result = solution.capitalize(testString);
            System.out.println("Original: \"" + testString + "\"");
            System.out.println("Capitalized: \"" + result + "\"");
            System.out.println("Expected: \"" + expectedResult + "\"");
            System.out.println();
        }
    }
}
