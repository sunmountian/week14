package com.period4.week15;

/**
 * @version 1.0
 * @authoe 李祥基
 */
public class SubstringMatch {

    //暴力搜索
    public static int bruteforce(String s, String t) {
        if (s.length() < t.length()) return -1;
        //s[i , i + t.length - 1] == t ?
        for (int i = 0; i + t.length() - 1 < s.length(); i++) {
            int j = 0;
            for (; j < t.length(); j++) {
                if (s.charAt(i + j) != t.charAt(j))
                    break;
            }
            if (j == t.length()) return i;
        }
        return -1;
    }
}
