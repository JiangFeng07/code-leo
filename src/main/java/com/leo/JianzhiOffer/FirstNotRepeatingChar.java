package com.leo.JianzhiOffer;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lionel on 18/2/12.
 */
public class FirstNotRepeatingChar {
    public static int FirstNotRepeatingChar(String str) {
        if (str == null || str.length() == 0) {
            return -1;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char ch : str.toCharArray()) {
            if (map.get(ch) == 1) {
                return str.indexOf(ch);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(FirstNotRepeatingChar("google"));
    }
}
