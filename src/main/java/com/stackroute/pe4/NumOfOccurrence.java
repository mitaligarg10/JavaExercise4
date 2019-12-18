package com.stackroute.pe4;

import java.util.InputMismatchException;

public class NumOfOccurrence {
    public int numOfOccurInString(String string, char ch) {
        if (string == null || string == "" || ch == '\0')
            throw new InputMismatchException();
        return string.length() - string.replaceAll(String.valueOf(ch), "").length();
    }
}


