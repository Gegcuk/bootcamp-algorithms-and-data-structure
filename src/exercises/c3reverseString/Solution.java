package exercises.c3reverseString;

public class Solution {
    public static String reverse1(String str){
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }

    public static String reverse2(String str){
        if(str.isEmpty()) return str;
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = str.length()-1; i >= 0; i--){
            stringBuilder.append(str.charAt(i));
        }
        return stringBuilder.toString();
    }

    public static String reverse3(String str){
        String resultStr = "";
        for(int i = 0; i < str.length(); i++){
            resultStr = str.charAt(i) + resultStr;
        }
        return resultStr;
    }

    public static String reverse4lamda(String string){
        StringReverser reverser = str -> new StringBuilder(string).reverse().toString();
        return reverser.reverse4(string);
    }

    public static void main(String[] args) {
        System.out.println(Solution.reverse1("hello"));
        System.out.println(Solution.reverse2("hello"));
        System.out.println(Solution.reverse3("hello"));
        System.out.println(Solution.reverse4lamda("hello"));
    }

    @FunctionalInterface
    interface StringReverser{
        String reverse4(String s);
    }
}
