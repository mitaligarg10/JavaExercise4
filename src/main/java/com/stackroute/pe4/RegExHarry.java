package com.stackroute.pe4;

public class RegExHarry {
    public boolean isHarryHere(String string) {
        if (string == "" || string == null)
            return false;
        return string.toLowerCase().contains("harry");
    }
}
