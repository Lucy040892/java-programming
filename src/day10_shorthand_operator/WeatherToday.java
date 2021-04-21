package day10_shorthand_operator;

import java.util.Scanner;

public class WeatherToday {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("How is the weather today?");
        String weather = scan.nextLine();// next() accept words untill first empty space, nextLine() accept everything before Enter
        System.out.println(weather +" - is a nice today!");


    }
}
