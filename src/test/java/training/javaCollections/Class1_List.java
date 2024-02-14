package training.javaCollections;

import java.util.*;
//hello----local repo
//hello-comment----updating by local repo---again edited from remote...updated by remote...
//comment is from local repo
public class Class1_List {
    public static void main(String[] args) {
        System.out.println("main method");
        int [] ids = new int[4];
        ids[0] = 22; ids[1] = 2; ids[2] = 42; ids[3] = 4;
        //1st run: 2;22;42;4
        // 2nd run

        System.out.println(Arrays.toString(ids));
        // Sort the array 'ids' elements in ascending order
        int temporary;
        for (int i = 0; i <= ids.length-1; i++) {
            System.out.println("iteration:" + i);
            for (int j = i + 1; j <= ids.length-1; j++) {
                if (ids[i] > ids[j]) {//2>4
                    temporary = ids[i];//temporary:22
                    ids[i] = ids[j];//0 th place is 4 now.
                    ids[j] = temporary;//4th place is 22 now;4th place is
                }
                System.out.println("iteration of j:" + j);
                System.out.println(Arrays.toString(ids));
            }
        }

        //collection is an interface with inbuilt methods:
        //collection interface members:
        // contains;containsAll; add; allAll; remove; removeAll; clear; size

        //ArrayList, LinkedList; HastSet; LinkedHashSet

        System.out.println("ascending order.......");
        System.out.println(Arrays.toString(ids));
        //To solve the common problems in java, any programming language needs some common methods.
        //Java has the collection interface which has some common methods
        //like: add, addAll; remove, removeAll; contains, containsAll
        //In addition to collection interface, java have Collections class which has sort method

        //ArrayList, Linked List classes implement List interface.
        //HashSet, LinkedHashSet classes implement Set interface.

        //List interface allows duplicates; Set interface does not allow duplicates.

        //Linked Items: In data set, each element holds information of
        // previous and next element information.
        //So insertion and deletion will be faster in case LinkedList and LinkedHashSet.
        //To access elements is faster in case of ArrayList and HashSet are faster.

//        ArrayList<Integer> a = new ArrayList<Integer>();
        LinkedList<Integer> a = new LinkedList<>();

//        Set c = new HashSet();
//        Set d = new LinkedHashSet();
//        Set e = new TreeSet();
//
//        Map f = new HashMap();
//        Map g = new LinkedHashMap();
//        Map h = new TreeMap();

        a.add(2); a. add(3); a.add(38); a.add(88); a.add(12); a.add(2);
        System.out.println("part1....");
        System.out.println(a);
        a.addAll(a);
        System.out.println("part2......");
        System.out.println();
        System.out.println(a);
        System.out.println(a.get(1));
        System.out.println("reverse");
        Collections.reverse(a);
        System.out.println(a);
        System.out.println("sort");
        Collections.sort(a);
        System.out.println(a);
        System.out.println("reverse order");
        Collections.sort(a, Collections.reverseOrder());
        System.out.println(a);
        System.out.println("min value: " + Collections.min(a));
        System.out.println("max value: " + Collections.max(a));

        System.out.println(a);
        a.remove(3);
        System.out.println(a);
        System.out.println("part1....");
        System.out.println(a.contains(5));
        System.out.println(a.containsAll(a));
        System.out.println(a.size());
        System.out.println(a.isEmpty());
        System.out.println("part2.....");
        Iterator<Integer> i = a.iterator();
        Integer val;
        while (i.hasNext()){
            val = i.next();//read current element; move the cursor to next element
            System.out.println(val);
        }
        System.out.println("part3......");
        a.removeAll(a);
        System.out.println(a);
        a.add(72); a. add(39);
        System.out.println(a);
        System.out.println("for each loop");
        for(Integer p : a){
            System.out.println(p);
        }
        a.clear();
        System.out.println(a);
    }
}








