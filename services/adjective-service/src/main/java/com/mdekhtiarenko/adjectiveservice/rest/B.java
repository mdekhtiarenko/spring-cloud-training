package com.mdekhtiarenko.adjectiveservice.rest;

import java.util.HashSet;
import java.util.Set;

public class B {

    public static void main(String[] args) {
        Set<A> set = new HashSet<>();
   
        A a = new A();

        set.add(a);
        set.add(a);
        set.add(a);
        set.add(a);
        set.add(a);
        set.add(a);
        set.add(a);

        System.out.println(set.size());
    }

    static class A {
        static int a = 0;

        public int hashCode() {
            return a;
        }

        public boolean equals(Object obj) {
            return false;
        }
    }
}
