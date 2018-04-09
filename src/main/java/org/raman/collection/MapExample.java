package org.raman.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

/**
 * Created by haim on 13/03/2018.
 */
public class MapExample {

    public static void main(String[] args) {
        String[] names = new String[]{"Sam", "Sam", "Pamela", "Dave", "Erik", "Pascal", "Erik"};
        final Map<String, Integer> nameCounts = new HashMap<>();
        IntStream.range(0, names.length)
                .forEach(i ->
                {
                    String name = names[i];
                    Integer count = nameCounts.get(name);
                    if (count == null) nameCounts.put(names[i], 1);
                    else nameCounts.put(names[i], count + 1);
                });
        for (Map.Entry<String, Integer> name : nameCounts.entrySet()) {
            System.out.println(name.getKey() + ":" + name.getValue());
        }

    }
}
