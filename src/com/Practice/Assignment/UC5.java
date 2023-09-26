package com.Practice.Assignment;

public class UC5 {
    public static void main(String[] args) {
        String password="kuldeepharma";
        String regex1="[a-z]{8,}";
        System.out.println(password.matches(regex1));
    }
}
