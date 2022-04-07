package com.mdekhtiarenko.adjectiveservice.rest;

public class Test1 {

 public static void main(String[] args) {
 Integer a = 128;
 int b = 1_2_8;
 System.out.println(a.equals(b));
 System.out.println(a == b);
 System.out.println(a == (Integer) b);
 System.out.println(new Integer(a) == new Integer(b));
 }

}
