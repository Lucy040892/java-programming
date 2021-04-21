package day14_multi_branch_if_statements;

import java.sql.SQLOutput;

public class MultiBranchIfStatement {
    public static void main(String[] args) {
        byte day = 2;
        if (day == 1) {
            System.out.println("Monday");
        } else {
            System.out.println("Not Monday");
        }
        if (day == 2) {
            System.out.println("Tuesday");
            if (day == 3) {
                System.out.println("Wednesday");
            }
            System.out.println("******");

            day = 1;
            if (day == 1) {
                System.out.println("Monday");
            }else if (day == 2){
                System.out.println("Tuesday");
            }else if (day == 3){
                System.out.println("Wednesday");
            }else{
                System.out.println("java day");
            }
        }
    }
}

