package exercises.c11printingSteps;

public class Solution {

    public static void printSteps2(int n){
        for (int row = 0; row < n; row++){
            StringBuilder stair = new StringBuilder();
            for(int column = 0; column < n; column++){
                if(row >= column) stair.append("#");
                else stair.append(" ");
            }
            System.out.println(stair);
        }
    }


        public static void main(String[] args) {
        printSteps2(3);
    }

}
