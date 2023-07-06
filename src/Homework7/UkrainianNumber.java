package Homework7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UkrainianNumber {
    public static void main(String[] args) {
        String[] phoneNumbers = {"+380683363384", "+3801234", "+380671553844"};

        for (String phoneNumber : phoneNumbers) {
            boolean isValid = isValidUkrainianPhoneNumber(phoneNumber);
            System.out.println(phoneNumber + " - " + (isValid ? "Valid" : "Invalid"));
        }
    }

    public static boolean isValidUkrainianPhoneNumber(String phoneNumber) {
        String regex = "^\\+380\\d{9}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }
}

