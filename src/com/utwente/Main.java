package com.utwente;

public class Main {

    public static void main(String[] args) {
        int[] testArray = {5,4,3,6,8,7,9,1,2};
        System.out.println(prettyPrintArray(testArray));

    }

    public static String prettyPrintArray(int[] array) {
        StringBuilder sb = new StringBuilder();

        sb.append("int[").append(array.length).append("] = {");
        for (int anArray : array) {
            sb.append(anArray).append(", ");
        }
        sb.setLength(sb.length() - 2);
        sb.append('}');

        return sb.toString();
    }
}
