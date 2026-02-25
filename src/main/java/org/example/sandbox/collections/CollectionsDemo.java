package org.example.sandbox.collections;

import java.util.*;

public class CollectionsDemo {

    public static void main(String[] args) {

        // Sets
        Set<String> set = new LinkedHashSet<>();
        Set<String> set2 = new HashSet<>();
        Set<String> set3 = new TreeSet<>();

        // Lists
        List<String> list = new Vector<>();
        List<String> list2 = new ArrayList<>();
        List<String> list3 = new LinkedList<>();

        // Priority Queue
        Queue<String> queue = new PriorityQueue<>();
        Collection<String> queue2 = new PriorityQueue<>();
    }


}
