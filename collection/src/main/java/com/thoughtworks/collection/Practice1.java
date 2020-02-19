package com.thoughtworks.collection;

import java.util.*;

public class Practice1 {
    public static void main(String[] args) {
        System.out.println(randomNumber());
    }

    /**
     *  生成10个0到20的随机整数，要求不能重复
     */
    public static Collection<Integer> randomNumber() {
        Collection<Integer> collection = new LinkedHashSet<>();
        Random r = new Random();
        while(collection.size() < 10) {
            collection.add(r.nextInt(21));
        }
        return collection;
    }
}
