package com.Practice.Assignment;

public class UC3 {
    public static void main(String[] args) {
        String email="abc.xyz@bl.co.in";
        String regx1="[a-z.]+@bl.co.in";
        System.out.println(email.matches(regx1));
    }
}
