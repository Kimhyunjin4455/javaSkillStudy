package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FunctionalInterFaceExamples {

    // List , Predicate를 인자로 받고, List의 원소들이 특정 조건을 만족할 경우(test) 다른 리스트(result)에 저장합니다.
    private static <T> List<T> filter(List<T> list, Predicate<T> filters){
        List<T> result = new ArrayList<>();
        for(T input: list) {
            if (filters.test(input)) result.add(input); // test(input)이 true이면 add
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(-5,-4,-3,-2,-1,0,1,2,3,4,5);
        Predicate<Integer> isPositive = i -> i>0;
        List<Integer> positiveNums = new ArrayList<>();

        for(int num:nums){
            if(num > 0) positiveNums.add(num);
        }

        System.out.println("positive Integer = " + positiveNums);

        Predicate<Integer> lessThan3 = i -> i<3;
        List<Integer> numberLessThan3 = new ArrayList<>();

        for(Integer num: nums){
            if (lessThan3.test(num)) numberLessThan3.add(num); // test함수가 i -> i<3 람다식으로 치환
        }

        System.out.println("numberLessThan3 = " + numberLessThan3);
        System.out.println("Positive Integers = " + filter(nums, isPositive));
        System.out.println("numberLessThan3 = " + filter(nums, lessThan3));
    }
}
