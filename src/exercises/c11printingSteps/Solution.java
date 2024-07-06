package exercises.c11printingSteps;

public class Solution {

    public static void printSteps(int n){
        for(int i = 0; i < n; i++){
            for(int x = 0; x < i; x++){
                System.out.println("#".repeat(x));
            }
        }
    }

    public static void main(String[] args) {
        printSteps(10);
    }

}
