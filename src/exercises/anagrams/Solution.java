package exercises.anagrams;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static boolean isAnagram(String stringA, String stringB){
        stringA = stringA.replaceAll("[^\\w]", "").toLowerCase();
        stringB = stringB.replaceAll("[^\\w]", "").toLowerCase();
        if(stringB.length() != stringA.length()) return false;
        Map<Character, Integer> word1Map = new HashMap<>();
        Map<Character, Integer> word2Map = new HashMap<>();
        for(int i = 0; i < stringB.length(); i++){
            int countA = word1Map.getOrDefault(stringA.charAt(i), 0) + 1;
            int countB = word2Map.getOrDefault(stringB.charAt(i), 0) + 1;
            word1Map.put(stringA.charAt(i), countA);
            word2Map.put(stringB.charAt(i), countB);
        }
        return word1Map.equals(word2Map);
    }

    public static void main(String[] args) {
        String stringA1 = "Listen!";
        String stringB1 = "Silent.";
        boolean expected1 = true;
        System.out.println("Are the two strings anagrams? " + isAnagram(stringA1, stringB1) + " (expected: " + expected1 + ")");

        String stringA2 = "Hello, World!";
        String stringB2 = "world! hello";
        boolean expected2 = true;
        System.out.println("Are the two strings anagrams? " + isAnagram(stringA2, stringB2) + " (expected: " + expected2 + ")");

        String stringA3 = "The eyes";
        String stringB3 = "They see!";
        boolean expected3 = true;
        System.out.println("Are the two strings anagrams? " + isAnagram(stringA3, stringB3) + " (expected: " + expected3 + ")");

        String stringA4 = "Anagram";
        String stringB4 = "Nag a ram";
        boolean expected4 = true;
        System.out.println("Are the two strings anagrams? " + isAnagram(stringA4, stringB4) + " (expected: " + expected4 + ")");

        String stringA5 = "Astronomer";
        String stringB5 = "Moon starer";
        boolean expected5 = true;
        System.out.println("Are the two strings anagrams? " + isAnagram(stringA5, stringB5) + " (expected: " + expected5 + ")");

        String stringA6 = "Dormitory";
        String stringB6 = "Dirty room";
        boolean expected6 = true;
        System.out.println("Are the two strings anagrams? " + isAnagram(stringA6, stringB6) + " (expected: " + expected6 + ")");

        String stringA7 = "School master";
        String stringB7 = "The classroom";
        boolean expected7 = true;
        System.out.println("Are the two strings anagrams? " + isAnagram(stringA7, stringB7) + " (expected: " + expected7 + ")");

        String stringA8 = "Hello";
        String stringB8 = "Olelh!";
        boolean expected8 = true;
        System.out.println("Are the two strings anagrams? " + isAnagram(stringA8, stringB8) + " (expected: " + expected8 + ")");

        String stringA9 = "Test";
        String stringB9 = "Best";
        boolean expected9 = false;
        System.out.println("Are the two strings anagrams? " + isAnagram(stringA9, stringB9) + " (expected: " + expected9 + ")");

        String stringA10 = "Anagram";
        String stringB10 = "Notagram";
        boolean expected10 = false;
        System.out.println("Are the two strings anagrams? " + isAnagram(stringA10, stringB10) + " (expected: " + expected10 + ")");

        String stringA11 = "Cat";
        String stringB11 = "Dog";
        boolean expected11 = false;
        System.out.println("Are the two strings anagrams? " + isAnagram(stringA11, stringB11) + " (expected: " + expected11 + ")");
    }
}
