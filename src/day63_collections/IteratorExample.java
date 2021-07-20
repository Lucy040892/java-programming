package day63_collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorExample {

    //Iterator: an interface used for reading and remove elements from collections
    //Think of the iterator as a pin that will iterate through each element of a collection

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("John");
        list.add("Jamie");
        list.add("Jorege");

        System.out.println(list);

        Iterator<String> it = list.iterator();

        it.next();
        it.remove();
        System.out.println(list);

        Set<String> names = new HashSet<>();
        names.add("James");
        names.add("Kinga");
        names.add("MJ");
        names.add("Pavrin");

        Iterator<String> iterator = names.iterator();

        while(iterator.hasNext()) {
            String currentName = iterator.next();
            System.out.println(currentName);

            if(currentName.length() < 3 || currentName.startsWith("J")) {
                iterator.remove();

            }
        }
        System.out.println(names);

    }
}
