package day63_collections;


import java.util.*;

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
        words.remove("world");
        System.out.println(words);

        //convert your Set to a List

        List<String> wordList = new ArrayList<>(words);
        System.out.println(wordList.get(0));

        //LinkedHashSet
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("24");
        linkedHashSet.add("java");
        linkedHashSet.add("$#");
        linkedHashSet.add("53");
        linkedHashSet.add("apple");
        linkedHashSet.add("cucumber");
        linkedHashSet.add("53");
        System.out.println(linkedHashSet);

        //TreeSet

        Set<String> linkedHashSet2 = new TreeSet<>(); //natural order: stores elements into their natural order(lexicographical)
        linkedHashSet2.add("24");
        linkedHashSet2.add("java");
        linkedHashSet2.add("$#");
        linkedHashSet2.add("53");
        linkedHashSet2.add("apple");
        linkedHashSet2.add("cucumber");
        linkedHashSet2.add("53");
        System.out.println(linkedHashSet2);

        ((TreeSet)linkedHashSet2).first();

    }
}
