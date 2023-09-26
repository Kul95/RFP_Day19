package com.Practice.Assignment;

public class UC4 {
    public static void main(String[] args) {
        String number="9919819801";
        String regex1="((91)?[0-9]{10})";
        System.out.println(number.matches(regex1));
    }
}
