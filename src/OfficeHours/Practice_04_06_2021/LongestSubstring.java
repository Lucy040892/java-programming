package OfficeHours.Practice_04_06_2021;

public class LongestSubstring {
    public static void main(String[] args) {
        String str = "aaabbbcccccddddee ";
        String longestSubstring = "";
        String temp = "";

        for(int i=0; i < str.length()-1; i++){
            temp += str.charAt(i); // aaa

            if(str.charAt(i) != str.charAt(i+1) || i==str.length()-2){
                if(i == str.length()-2 && str.charAt(i) == str.charAt(i+1)){
                    temp += str.charAt(i+1);
                }
                if(temp.length() > longestSubstring.length()){
                    longestSubstring = temp; //aaa

                }
                temp = "";
            }
        }
        System.out.println("Longest substring " +longestSubstring);
    }
}
