package com.java.StreamAPI.ConsumerAppl;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class DemoConsumerInterfaceAppl {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);

//        Consumer<Integer> consumer = new Consumer<Integer>() {
//            @Override
//            public void accept(Integer i) {
//                System.out.println(i);
//            }
//        };

        /*The above commented lines can also be written i lambda as below commented code*/

//        Consumer<Integer> consumer = i -> System.out.println(i);

        /*This is again shortened and written as below*/

        numbers.forEach(i -> System.out.println(i));
    }

}
