package src.com.xworkz.set;

import java.util.*;

public class Set {
    public static void main(String[] args) {
        java.util.Set<String> set = new HashSet<>();
        set.add("java");
        set.add("Java");
        set.add("JAVA");
        set.add("Java1");
        set.add("Java2");
        set.add("Java3");
        set.add("Java4");
        set.add("Java5");
        set.add("Java6");
        set.add("Java7");
        set.add("Java8");
        System.out.println(set.size());

        LinkedHashSet<String> set1=new LinkedHashSet<>();
        set1.add("1");
        set1.add("2");
        set1.add("3");
        set1.add("4");




        set1.forEach(System.out::println);


        TreeSet<Integer> set3=new TreeSet<>();
        set3.add(4);
        set3.add(2);
        set3.add(5);
        set3.add(1);
        set3.forEach(System.out::println);

        set3.forEach(System.out::println);

        System.out.println(set3.descendingSet());
        Iterator<Integer> treesetIt=set3.descendingIterator();
        while(treesetIt.hasNext()){
            System.out.println(treesetIt.next());
        }
       Iterator<String> setIt=set.iterator();
        while(setIt.hasNext()){
            System.out.println(setIt.next());
        }

        System.out.println(set3.ceiling(-1));
        System.out.println(set3.floor(8));
        set3.pollFirst();
        set3.pollLast();

        System.out.println(set3);
        set3.add(3);
        set3.add(2);
        System.out.println(set3.subSet(1,5));
    }
}
