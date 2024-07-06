package exercises.c11printingSteps;

public class Solution {

    public static void printSteps(int n){
        for(int i = 1; i <= n; i++){
            for(int x = 1; x <= i; x++){
                int stringLength = i;
                StringBuilder s = new StringBuilder();
                for(int j = 0; j < x; j++){
                    s.append("#");
                    stringLength--;
                }
                for(int j = 0; j < stringLength; j++){
                    s.append(" ");
                }
                System.out.println(s);
            }
        }
    }

    public static void main(String[] args) {
        printSteps(3);
    }

}
