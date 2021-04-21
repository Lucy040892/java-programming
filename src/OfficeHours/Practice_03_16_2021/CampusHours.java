package OfficeHours.Practice_03_16_2021;

public class CampusHours {
    public static void main(String[] args) {
        int time = 7;
        if(time < 0 || time >24){
            System.out.println("Invalid time");
        }else if(time >=8 && time<=23){
            System.out.println("Campus opened");
        }else{
            System.out.println("Campus closed");
        }

    }
}
