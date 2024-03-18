package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static int filterSum(Predicate<Integer> filter, List<Integer> list){
        int sum =0;
        for (Integer num: list){
            if (filter.test(num)) sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int sum;
        sum = filterSum(i->i%2==0, nums);
        System.out.println("짝수 합 = " + sum);

        sum = filterSum(i->i%2==1, nums);
        System.out.println("홀수 합 = " + sum);

    }
}
