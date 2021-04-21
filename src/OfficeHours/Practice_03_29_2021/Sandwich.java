package OfficeHours.Practice_03_29_2021;

public class Sandwich {
    public static void main(String[] args) {
        String str = "breadjambread"; // 0 + 5 = 5 -> substring(5)
        boolean isValid = false;
        String result = "";
        if (str.contains("bread")) {
            int firstBread = str.indexOf("bread");
            if (str.substring(firstBread + 5).contains("bread")) { // jambread
                //int secondBread = str.substring(firstBread + 5).indexOf("bread");
                int secondBread = str.lastIndexOf("bread");
                result = str.substring(firstBread + 5, secondBread);
                isValid = true;
            }
        }
        if (!isValid || result.isEmpty()) {
            System.out.println("nothing");

        } else {
            System.out.println(result);
        }
    }
}



