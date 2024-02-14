package training.javaCollections;

import java.util.*;
//Map: If we want to save the data in key and value manner, then we have map concept in java.
//Country vs Currency; India: INR; USA: USD; GERMANY:EUR
public class Class1_Map {
    public static void main(String[] args) {
        System.out.println("main method");
        Map<String, Integer> a = new HashMap<>();
//        Map<String, Integer> a = new LinkedHashMap<>();
//        Map<String, Integer> a = new TreeMap<>();
//        Map g = new LinkedHashMap();
//        Map h = new TreeMap();
        a.put("G6", 0); a.put("G8", 32); a.put("G7", 247);
        a.put("CustomerDiscount", 100);
        a.put("EnterpriseSuperAdmin", 0);
        a.put("ServiceBranch", 50);
        System.out.println(a);
        System.out.println(a.get("ServiceBranch"));
        System.out.println("part1....");
        System.out.println(a.keySet());//keySet returns all the keys as Set
        System.out.println(a.values());
        Iterator<String> i = a.keySet().iterator();
        System.out.println("all keys-- one by one");
        String keyName;
        while (i.hasNext()){
            keyName = (String) i.next();
            System.out.println(keyName);
            System.out.println(a.get(keyName));
        }
        System.out.println("size: " + a.size());
        System.out.println("isEmpty: " + a.isEmpty());
        System.out.println("for-each.....");
        for(String key: a.keySet()){
            System.out.println(key);
            System.out.println(a.get(key));
        }
        a.clear();
        System.out.println("size: " + a.size());
        System.out.println("isEmpty: " + a.isEmpty());
    }
}