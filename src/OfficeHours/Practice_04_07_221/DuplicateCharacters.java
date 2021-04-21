package OfficeHours.Practice_04_07_221;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String str = "AAABCCDEEF";
        String checked = "";

        for(int i = 0; i < str.length(); i++){
            int count = 0;
            // str.charAt(i);
            if(checked.contains("" +str.charAt(i))){
                continue;
            }
            for(int j = 0; j < str.length(); j++){
                if(str.charAt(i) == str.charAt(j)){ // A == A
                    count++;

                }

            }
            if(count > 1){
                System.out.println(str.charAt(i) +" is duplicate");
            }
            checked += str.charAt(i);
        }


    }
}
