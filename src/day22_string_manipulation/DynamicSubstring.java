package day22_string_manipulation;

public class DynamicSubstring {
    public static void main(String[] args) {
        String result = "result count: 12345";
        System.out.println(result.substring(13, 18));
        System.out.println(result.substring(13));

        //find the index of
        System.out.println(result.indexOf(":"));
        int colonIndex = result.indexOf(":");
        System.out.println(result.substring(colonIndex+1));
        //now we can combine them into 1 statement
        System.out.println(result.substring(result.indexOf(":") + 1));

        String today = "I learned a lot of [silenium] today";
        /**
         * find indexOf [
         * find index ]
         * provide them as start, end index for substring
         * to print java
         */
        int indexOfStart = today.indexOf("[");
        int indexOfEnd = today.indexOf("]");
        System.out.println(today.substring(indexOfStart+1, indexOfEnd));

    }
}
