package exercises.integerReversal;

public class Solution {
    public int reverseInteger(Integer number){
        int sign = 1;
        if(number < 0){
            sign = -1;
            number = -number;
        }
        String stringNumber = String.valueOf(number);
        String resultString = "";
        for(int i = 0; i < stringNumber.length(); i++){
            resultString = stringNumber.charAt(i) + resultString;
        }

        return sign * Integer.parseInt(resultString);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases with expected results
        Integer[][] testCases = {
                {123, 321},       // 321
                {1001, 1001},     // 1001
                {789, 987},       // 987
                {400, 4},         // 4
                {0, 0},           // 0
                {-123, -321},     // -321 (Negative number handling)
                {4567, 7654},     // 7654
                {1200, 21},       // 21 (Leading zeros in the reversed number)
                {9, 9},           // 9 (Single digit)
                {-800, -8}        // -8 (Negative number with trailing zeros)
        };

        // Testing the reverseInteger function
        for (Integer[] testCase : testCases) {
            Integer testNumber = testCase[0];
            Integer expectedResult = testCase[1];
            Integer result = solution.reverseInteger(testNumber);
            System.out.println("Reverse of " + testNumber + " is " + result + ", Expected: " + expectedResult);
        }
    }
}
