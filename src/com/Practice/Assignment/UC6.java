package com.Practice.Assignment;

public class UC6 {
    public static void main(String[] args) {
        String str="KuldeepSharma";
        String regex1="[A-Za-z]{8,}\\w*";
        System.out.println(str.matches(regex1));

    }
}
