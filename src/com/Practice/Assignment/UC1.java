package com.Practice.Assignment;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC1 {
    public static void main(String[] args) {
        String firstName="Kuldeep";
        String regex1="[A-Z]\\w*";
        System.out.println("My first name is : "+firstName.matches(regex1));
    }
}

