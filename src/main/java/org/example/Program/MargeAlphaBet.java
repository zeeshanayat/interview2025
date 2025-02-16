package org.example.Program;

public class MargeAlphaBet {

    public static void main(String[] args) {

        System.out.println(margeString("abc", "pqr"));
        System.out.println(margeString("abcd", "pqr"));
        System.out.println(margeString("abc", "pqrst"));


    }

    private static String margeString(String str1, String str2) {

        StringBuilder sb = new StringBuilder();
        int length1 = str1.length();
        int length2 = str2.length();
        int maxLength = Math.max(length1, length2);

        // Merge characters alternately from both strings
        for (int i = 0; i < maxLength; i++) {
            if (i < length1) {
                sb.append(str1.charAt(i)); // Append character from first string
            }
            if (i < length2) {
                sb.append(str2.charAt(i)); // Append character from second string
            }


        }
        return sb.toString();
    }
}





