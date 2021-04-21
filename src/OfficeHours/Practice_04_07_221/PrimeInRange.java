package OfficeHours.Practice_04_07_221;

public class PrimeInRange {
    public static void main(String[] args) {
        // prime number, number which can be divided by 1 and this number( 3, 5, 7, 11,...)
        int number = 50;
        // 5/2, 5/3, 5/4
        for (int j = 2; j <= number; j++) {
            boolean isPrime = true;
            int checkNumber = j;
            for (int i = 2; i < checkNumber / 2; i++) {
                if (checkNumber % i == 0) { //means number divided by i(2,3,4,...) so number IS NOT PRIME
                    isPrime = false;
                    break;

                }

            }
            if (isPrime) {
                System.out.print(j + " ");
            }
        }

    }
}
