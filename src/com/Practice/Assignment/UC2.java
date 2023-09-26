package com.Practice.Assignment;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UC2 {
    public static void main(String[] args) {
        String lastName="Sharma";
        String regex1="[A-Z]{1}[a-z]{3,10}";
        System.out.println("My first name is : "+lastName.matches(regex1));
    }
}
