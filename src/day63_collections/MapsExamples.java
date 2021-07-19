package day63_collections;

import java.util.HashMap;
import java.util.Map;

public class MapsExamples {
    public static void main(String[] args) {
        //id, names
        Map<Integer, String> map = new HashMap<>(); //we define datatype of key and value
        map.put(1, "James");
        map.put(2, "Anna");
        map.put(2, "Daria"); //duplicate update the key
        map.put(100, "Maxim");
        map.put(101, "Maxim");
        System.out.println(map.get(100));
        System.out.println(map.get(50)); //not exist, return null
        System.out.println(map);

        map.remove(1);//we can remove only by key (not value)
        map.remove("Maxim"); //does not work, but compile because of polymorphism (it takes as object)
        System.out.println(map);
        map.put(1, "Kinga");
        System.out.println(map); //not sorted

        System.out.println(map.containsKey(1));
        System.out.println(map.containsValue("Anna"));

        for(Integer key : map.keySet()){
            System.out.println(key + " - " +map.get(key));

            //if we need to find key by value
            if(map.get(key).equals("Daria")){
                System.out.println("this is our key " +key);
            }
        }

        //map.values()


    }
}
