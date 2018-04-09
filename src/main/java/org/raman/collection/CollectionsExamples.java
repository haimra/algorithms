package org.raman.collection;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by haim on 13/03/2018.
 */
public class CollectionsExamples {

    public static void main(String[] args) {
        String[] names = new String[]{"green","yellow","pink"};
        List<Apple> apples = IntStream.range(0, names.length)
                .mapToObj(i -> new Apple(names[i],i))
                .collect(Collectors.<Apple>toList());

        Collections.<Apple>sort(apples);
        apples.stream().forEach(a->System.out.println(a));
        Collections.<Apple>sort(apples,((a1,a2)->a2.getId()-a1.getId()));
        apples.stream().forEach(a->System.out.println(a));
    }


    public static class Apple implements Comparable<Apple> {
        private int id;
        private String name;

        public Apple(String name, int id) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return String.format("[%d,%s]", id, name);
        }

        @Override
        public int compareTo(Apple otherApple) {
            return otherApple.getName().compareTo(this.name);
        }
    }
}
