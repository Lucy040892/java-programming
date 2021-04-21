package day17_ternary_nested_conditions;

public class MoreTernary {
    public static void main(String[] args) {
        int hourlyRate = 50;
        String reply = (hourlyRate > 50) ? "Accept" : "Reject";
        System.out.println("reply = " + reply);

        String todayClass = "Soft skills";
        String teacher = (todayClass.equals("Java")) ? "Morodil/Saim" : "Nadir";
        System.out.println("Today's teacher " +teacher);

        boolean isEligibleToDrive = true;
        String driving = (isEligibleToDrive) ? "Have DL, can drive" : "No DL, cant drive";
        System.out.println("driving = " + driving);

    }
}
