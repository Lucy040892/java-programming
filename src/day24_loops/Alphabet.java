package day24_loops;

public class Alphabet {
    public static void main(String[] args) {
        //using while loop, print alphabet from a to z
        char letter = 'a';
        while (letter <= 'z'){
            System.out.print(letter +" ");
            letter++;
        }
        System.out.println();
        //print alphabet reverse order

        letter = 'z';
        while(letter >= 'a'){
            System.out.print(letter + " ");
            letter--;
        }

        }
    }

