package OfficeHours.Practice_08_03_2021;

import java.util.*;

public class CollectionReview {
    public static void main(String[] args) {


        Collection<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();  // polymorphic
        ArrayList<String> list3 = new ArrayList<>(); // not poly

        List<String> list4 = new Stack<>();

        list2.add("oscar");
        list2.add("funda");
        list2.add("andrey");

        list4.add("oscar");
        list4.add("funda");
        list4.add("andrey");

        System.out.println("list2 = " + list2);
        System.out.println("list4 = " + list4);


        //  list3 = new LinkedList<>();  will give error

        String str1 = ((Stack<String>) list4).pop();
        //   String str2 = ((Stack<String>) list2).pop();  can not be done


        System.out.println("list4 = " + list4);

        list2 = list4;
        String str2 = ((Stack<String>) list2).pop();
        System.out.println("list2 = " + list2);

        // I want to sort a list and print them out
        List<Integer> list5 = new Stack<>();
        list5.addAll(Arrays.asList(45,105,2910,459,450,759));
        // Collections.sort(list5);
        System.out.println(list5.toString());
        System.out.println("list5.size() = " + list5.size());
        for (int i = 0; i < list5.size(); ) {
            // since Stack.pop deletes each element my List size keeps shrinking
            int x = ((Stack<Integer>) list5).pop();
            // Last in First Out
            System.out.println(x);
        }
        System.out.println("list5.size() = " + list5.size());

        Queue<String> list6 = new ArrayDeque<>(); // LinkedListi de gÃ¶ster
        // Queue<String> list6 = new PriorityQueue<>();
        list6.add("OH");
        list6.add("VA");
        list6.add("LA");
        list6.add("NY");

        //  System.out.println(list6.toString());
        for (int i = 0; i < list6.size(); ) {
            // since Stack.pop deletes each element my List size keeps shrinking

            // First in First Out
            System.out.println(list6.poll());
        }
        System.out.println("list6.size() = " + list6.size());

        System.out.println("=======================================================================");
        LinkListExample();
        System.out.println("=======================================================================");
        IteratorExample();

        // SET EXAMPLE

        List<String> list = Arrays.asList("23","23","a","a","bb","jj","q","t","t");

        Set<String> unique = new HashSet<>(list);

        System.out.println(list.toString());   // [23, 23, a, a, bb, jj, q, t, t]
        System.out.println(unique.toString()); // [bb, jj, 23, a, q, t]   dublicates are gone  :)


    }



    public static void LinkListExample() {

        List<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(100);
        list.add(50);
        list.add(5000);

        System.out.println(((LinkedList<Integer>) list).getFirst());
        ((LinkedList<Integer>) list).addFirst(1);
        ((LinkedList<Integer>) list).addLast(99);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
    }

    public static void IteratorExample(){
        List<Integer> nums = new ArrayList<>();
        nums.add(50);
        nums.add(543);
        nums.add(1150);
        nums.add(550);
        nums.add(570);
        nums.add(93);
        nums.add(5000);
        nums.add(950);

        //Create Iterator object
        Iterator<Integer> it = nums.iterator();

        //Call hasNext method
        //hasNext return true, if there is still next value
        //returns false when it reaches the end or empty

        System.out.println("it.hasNext() : " + it.hasNext());  // WE PUT A POINTER BASICALLY AND OUR POINTER MOVES EACH TIME
        System.out.println("it.next(): " + it.next());
        System.out.println("it.next(): " + it.next());
        System.out.println("it.next(): " + it.next());
		/*	it.hasNext() : true
			it.next(): 50
			it.next(): 543
			it.next(): 1150 */

        System.out.println("======");

        while(it.hasNext()) {
            System.out.println(it.next());
        }


        //System.out.println("it.next(): " + it.next());  //??

        Iterator<Integer> it2 = nums.iterator();

        //What is the difference between for each loop and iterator?
        //we can remove objects while looping

        while(it2.hasNext()) {
            int val = it2.next();
            if(val>1000) {
                it2.remove();
            }
        }

        System.out.print(nums.toString() + "|");
/*
          List<String> cities = new ArrayList<>();
          cities.add("New York");
          cities.add("Boston");
          cities.add("Viriginia");
          cities.add("DC");

          for(String city : cities) {
              if(city.equals("Boston")) {  // ConcurrentModificationException
                  cities.remove(city);
              }
          }

 */
    }



}


