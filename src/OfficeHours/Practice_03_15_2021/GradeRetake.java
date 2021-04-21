package OfficeHours.Practice_03_15_2021;

public class GradeRetake {
    public static void main(String[] args) {
        int baseGrade = 90;
        int numberOfAttempts = 1;
        int retakePenalty = 0;

        if (numberOfAttempts == 1) {
            retakePenalty = (int) (baseGrade * 0.1);
        }
        if (numberOfAttempts == 2) {
            retakePenalty = (int) (baseGrade * 0.2);
        }
        if (numberOfAttempts == 3) {
            retakePenalty = (int) (baseGrade * 0.3);
        }
        System.out.println("Grade after retake attempt " + numberOfAttempts + "was:" + (baseGrade - retakePenalty));
    }
}
