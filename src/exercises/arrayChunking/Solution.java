package exercises.arrayChunking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public List<List<Integer>> chunkArray(Integer[] array, int chunkSize){
        List<List<Integer>> resultList = new ArrayList<>();
        List<Integer> currentList = new ArrayList<>();
        for(int i = 0; i < array.length; i++){
            currentList.add(array[i]);
            if(currentList.size() == chunkSize) {
                System.out.println("Current list: " + currentList);
                resultList.add(new ArrayList<>(currentList));
                currentList.clear();
            }
        }
        if(!currentList.isEmpty()) resultList.add(new ArrayList<>(currentList));
        return resultList;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases with expected results
        Object[][] testCases = {
                {new Integer[]{1, 2, 3, 4, 5}, 2, Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4), Arrays.asList(5))},
                {new Integer[]{1, 2, 3, 4, 5, 6, 7, 8}, 3, Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6), Arrays.asList(7, 8))},
                {new Integer[]{1, 2, 3}, 1, Arrays.asList(Arrays.asList(1), Arrays.asList(2), Arrays.asList(3))},
                {new Integer[]{1, 2, 3, 4, 5}, 5, Arrays.asList(Arrays.asList(1, 2, 3, 4, 5))},
                {new Integer[]{1}, 1, Arrays.asList(Arrays.asList(1))}
        };

        // Testing the chunkArray function
        for (Object[] testCase : testCases) {
            Integer[] testArray = (Integer[]) testCase[0];
            int chunkSize = (int) testCase[1];
            List<List<Integer>> expectedResult = (List<List<Integer>>) testCase[2];
            List<List<Integer>> result = solution.chunkArray(testArray, chunkSize);
            System.out.println("Chunking array " + Arrays.toString(testArray) + " with chunk size " + chunkSize);
            System.out.println("Result: " + result);
            System.out.println("Expected: " + expectedResult);
            System.out.println();
        }
    }

}
