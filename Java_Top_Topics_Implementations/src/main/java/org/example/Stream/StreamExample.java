package org.example.Stream;

import java.util.Arrays;
import java.util.List;

public class StreamExample {

    List<Integer> list = Arrays.asList(23,4,5,223,445,1,235,34,1,2,3,546);

    //now want to print the numbers those are greater than 4 and print with it sorted order
    public void printNumbers(){
        list.stream().filter(i->i>4).sorted().forEach(StreamExample::printElement);
    }

    //we can create printelement method also to print value
    //non static method cannot access in StreamExample::printElement
    //so we need to use static method here
    static void printElement(int i){
        System.out.println("Number = "+i);
    }


}
