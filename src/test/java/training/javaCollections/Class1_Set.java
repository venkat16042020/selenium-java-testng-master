package training.javaCollections;

import java.util.*;

public class Class1_Set {
    public static void main(String[] args) {
        System.out.println("main method");
//       LinkedList<Integer> a = new LinkedList<Integer>();
//       Generic: Generic means: In collections framework, for classes or interfaces,
//       we need to mention the datatype.
        //set is not guaranteed with order of insertion
        Set<Integer> a = new HashSet<>();

//        Set<Integer> a = new LinkedHashSet<>();
//        TreeSet<Integer> a = new TreeSet<>();

//        Set e = new TreeSet();
//
//        Map f = new HashMap();
//        Map g = new LinkedHashMap();
//        Map h = new TreeMap();

        a.add(2); a. add(12); a.add(38); a.add(88); a.add(3); a.add(2);
        System.out.println(a);
        System.out.println("part1......");
        a.addAll(a);
        System.out.println("part2.....");
        System.out.println(a);
         /*System.out.println("reverse");
        TreeSet<Integer> de = (TreeSet<Integer>) a.descendingSet();
        System.out.println(de);
        System.out.println("reverse again");
        TreeSet<Integer> de1 = (TreeSet<Integer>) de.descendingSet();
        System.out.println(de1);*/
        a.remove(88);
        System.out.println(a);
        System.out.println("part1....");
        System.out.println(a.contains(5));
        System.out.println(a.containsAll(a));
        System.out.println(a.size());
        System.out.println(a.isEmpty());
        System.out.println("min value: " + Collections.min(a));
        System.out.println("max value: " + Collections.max(a));
        //using index, we cannot be able to access element from set.
//        System.out.println(a.get(1));
        System.out.println("part2.....");
        Iterator<Integer> i = a.iterator();
        Integer val;
        while (i.hasNext()){
            val = i.next();
            System.out.println(val);
        }
        System.out.println("part3......");
        a.removeAll(a);
        System.out.println(a);
        a.add(72); a. add(39);
        System.out.println("for-each loop");
        for(Integer p : a){
            System.out.println(p);
        }
        System.out.println(a);
        a.clear();
        System.out.println(a);

    }
}