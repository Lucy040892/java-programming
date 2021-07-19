package day63_collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExamples {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        //list -> ArrayList
        set.add(100);// no ordering in set(added 100 in the beginning, but it is in another place)
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(2); //set does not allow duplicates, only unique value
                    //This is the benefit!

        System.out.println(set);

        Set<String> words = new HashSet<>();
        words.add("hello");
        words.add("world");
        words.add("java");
        words.add("java");
        words.add("collection");
        System.out.println(words);

        //convert your Set to a List

        List<String> wordList = new ArrayList<>(words);
        System.out.println(wordList.get(0));

    }
}
