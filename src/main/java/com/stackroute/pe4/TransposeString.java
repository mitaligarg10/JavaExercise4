package com.stackroute.pe4;

public class TransposeString {
    public String getTranspose(String str) {
        if (str == "")
            return null;
        String string = new String("");
        String[] strArr = str.split(" ");
        StringBuilder stringBuilder;
        for (int i = 0; i < strArr.length; i++) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(strArr[i]);
            stringBuilder.reverse();
            strArr[i] = new String();
            strArr[i] = stringBuilder.toString();
            string += strArr[i] + " ";
        }
        return string.trim();
    }
}
