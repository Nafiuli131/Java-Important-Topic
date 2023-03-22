package org.example.Stream;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingBy {

    String text = "basacasti";

    //count each character in this string
    public void count(){
       Map<String,Long> countMap = Arrays.stream(text.split("")).collect(
                Collectors.groupingBy(
                        Function.identity(),Collectors.counting()
                        //identify indent which characters it is....
                )
        );
        System.out.println(countMap);
    }
}
