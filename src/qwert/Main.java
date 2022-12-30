package qwert;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        String[] array = {"Cat", "Cat", "Cit", "Cit", "Dog", "Dog", "KOT"};
      /*  Map<String, Long> map = Arrays.stream(array)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println( map.entrySet().stream()

                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .stream().collect(Collectors.joining())
        );*/


         Map<String, Long> frequencies = Arrays.stream(array)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        long max = frequencies.values().stream()
                .mapToLong(Long::longValue)
                .max()
                .orElse(0);
        //System.out.println("max = " + max);
        frequencies.entrySet().stream()
                .filter(entry -> entry.getValue() == max)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList())
                .forEach(System.out::println);//все
        Empls.avgEmploers();
        Empls.age(3);

    }
}
