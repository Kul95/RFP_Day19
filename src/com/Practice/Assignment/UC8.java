package com.Practice.Assignment;

public class UC8 {
    public static void main(String[] args) {
        String password="KuldeepSharma12@12";
        String regex1="[A-Za-z]{8,}[0-9]{1}[@#!]{1}\\w*";
        System.out.println(password.matches(regex1));
    }
}
