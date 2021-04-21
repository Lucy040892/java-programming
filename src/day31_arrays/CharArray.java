package day31_arrays;

public class CharArray {
    public static void main(String[] args) {
        char[] letters = {'j', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'f', 'u', 'n' };
        //for(int i = 0; i < letters.length; i++){
        for(char each : letters){
            System.out.print(each);
        }
        System.out.println("");
        String sentence = new String(letters); // convert char array into string
        System.out.println("sentence = " +sentence);

        String item = "wooden spoon";
        char[] itemArray = item.toCharArray();
        System.out.println("itemArray length = " +itemArray.length);
        System.out.println("item length() = " +item.length());
          //                 0          1        2        3
        String[] fruits = {"bananas", "apples", "kiwi", "mango", "papaya", "strawberry"};
        String fruitStr = "";

        for(String each : fruits){
            System.out.print(each +"-");
            fruitStr += each +"-";
        }
        System.out.println("\nfruitStr = " +fruitStr);

        String[] languages = {"java", "python", "c++", "sql", "ruby", "javascript"};
        System.out.println(String.join(" | ", languages));
        String joinedlanguages = String.join("<>", languages);
        System.out.println("JoinedLanguages = " +joinedlanguages);

    }
}
