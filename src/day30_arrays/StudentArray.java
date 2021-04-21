package day30_arrays;

public class StudentArray {
    public static void main(String[] args) {
        String[] student1 = new String[5];
        student1[0] = "AD1234";
        student1[1] = "Adam";
        student1[2] = "Smith";
        student1[3] = "B22";
        student1[4] = "204-233-1234";
        String[] student2 = {"AS3426", "Mike", "Bloomer", "B22", "342-876-9997"};
        System.out.println("student ID = " +student1[0]);
        System.out.println("student first name = " +student1[1]);
        System.out.println("student last name = " +student1[2]);
        System.out.println("student batch num = " +student1[3]);
        System.out.println("student mobile num = " +student1[4]);

        System.out.println("Student data length = " +student2.length);

        if(student1.length == 5){
            System.out.println("PASS. Data array has correct num of Data");
        }else{
            System.out.println("FAIL. Data array has not correct num of Data");
        }

        if(student1.length == student2.length){
            System.out.println("PASS. Students have the same num of data");
        }else{
            System.out.println("FAIL. Students have different num of data");
        }

        System.out.println((student1[1] + " " +student1[2]).toUpperCase());

        String mobileNum = student1[4];


    }
}
