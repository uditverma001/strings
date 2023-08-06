package com.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapPlay {

    public static void main(String[] args) {

        long time00 = System.nanoTime();
        List<String> list = new ArrayList<>();
        list.add("annye");
        System.out.println("list is " + list);
        /*list.add(new Object());
        list.add(new Book());*/


        Map<String, String> map = new HashMap<>();

        map.put("india", "delhi");
        map.put("usaa", "wash");
        map.put("uk", "london");
        map.put("germany", "berlin");
        map.put("candana", "tronoto");

        for (int i = 0; i < 100000; i++) {
            map.put("country" + i, "captital" + i);

        }


        String val = map.get("uk");

        long time = System.nanoTime();

        String vald = map.get("country9999");
        long time2 = System.nanoTime();
        System.out.println("it took ms:" + (time2 - time));


        System.out.println("value is " + val);
        System.out.println("value is " + vald);
        System.out.println("value3 is " + vald);


        long time01 = System.nanoTime();

        List<String> all = new ArrayList<>();
        all.addAll(map.values());
        long time10 = System.nanoTime();
        boolean contains = all.contains("capital99999");
        long time11 = System.nanoTime();
        System.out.println("contains tool " + (time11 - time10) + "contains:" + contains);
        System.out.println("total took ms:" + (time01 - time00));

    }
}
