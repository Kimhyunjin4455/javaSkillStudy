package org.example;

import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

public class SupplierFeature {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
//        printValidIndex(0,getExpensiveValue());
//        printValidIndex(-1,getExpensiveValue());
//        printValidIndex(-2,getExpensiveValue());
        printValidIndex(0,()->getExpensiveValue());
        printValidIndex(-1,()->getExpensiveValue());
        printValidIndex(-2,()->getExpensiveValue());
        System.out.println("It took: " + (System.currentTimeMillis() - start) / 1000 + " Seconds");

    }

    public static String getExpensiveValue(){ // 3초간 sleep 후 "HJ" 반환
        try{
            TimeUnit.SECONDS.sleep(3); // 3초간 sleep
        }catch (InterruptedException e){
            e.getStackTrace();
        }return "HJ";
    }

    //public static void printValidIndex(int num, String value){
    public static void printValidIndex(int num, Supplier<String> valueSupplier){
        //if (num >= 0) System.out.println("The value is " +value+ ".");
        if (num >= 0 ) System.out.println("The value is " + valueSupplier.get() +".");
        else System.out.println("Invalid");
    }
}
