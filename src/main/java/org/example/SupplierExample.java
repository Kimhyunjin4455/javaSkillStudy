package org.example;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> helloSupplier = () -> "Hello ";  /** 매개변수를 받지 않고 단순히 무엇인가를 반환하는 추상메서드 'Supplier.get' */
        System.out.println(helloSupplier.get() + "World");
        /** Supplier<T> 인터페이스는 추상 메서드 get()을 통해 Lazy Evaluation 이 가능 (불필요한 연산을 피함)*/
        /**  */
    }
}
