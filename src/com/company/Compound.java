package com.company;

import java.util.Scanner;

public class Compound {

    public static void solve(Scanner s) {
        Element element1, element2;
        int c = -1, index, e1c, e2c;
        String[] roman_numerals = new String[]{"", "I", "II", "III", "IV", "V"};
        String lowercase = "abcdefghijklmnopqrstuvwxyz", f_el = "", numbers = "0123456789";
        String uppercase = lowercase.toUpperCase(), splitAt = lowercase + numbers;
        System.out.println("Enter Compound");
        String in = s.nextLine();
        String[] spl = in.split("");
        for (int i = 0; i < in.length(); i++) {
            if (splitAt.contains(spl[i])) {
                c = i;
                break;
            }
        }
        if (c == 0) f_el = spl[0];
        else if (c == 1) f_el = spl[0] + spl[1];
        element1 = Element.getElementBySymbol(f_el);
        if(numbers.contains(in.charAt(c + 1) + ""))e1c = Integer.parseInt(in.charAt(c + 1) + "");


        System.out.println(element1.getName());

    }
}
