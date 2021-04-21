package day08_casting_scanner;

public class CastingExamples {
    public static void main(String[] args){
        //byte - short - int - long
        byte num1 = 100;
        short num2 = num1;
        int num3 = num1;
        int num4 = 1000;
        long num5 = num4;
        float num6 = 124.4F;
        double num7 = num6;

        int num8 = 3456;
        double num9 = num8;
        System.out.println(num8); //3456
        System.out.println("num9 = " + num9); //3456.0
        
        double num13 = 55.3;
        float num14 = (float)num13;
        System.out.println("num14 = " + num14);
        
        double num15 = 1234.5;
        int num16 = (int)num15;
        
        int num17 = 300;
        byte num18 = (byte)num17;
        System.out.println("num18 = " + num18); //shortcut soutv

        char letter = 'L';
        int numLetter = letter;
        System.out.println("numLetter = " + numLetter);// 76


    }
}
