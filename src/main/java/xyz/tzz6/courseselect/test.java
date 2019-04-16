package xyz.tzz6.courseselect;

import java.util.ArrayList;
import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        String str = "1a33";
        test t = new test();
        int INT_MIN = (int) (-Math.pow(2, 31));
        int INT_MAX = (int) Math.pow(2, 31);
//        System.out.println(-912834723 * 10 <= INT_MIN);
        System.out.println(t.myAtoi(str));
//        t.myAtoi(str);
    }

    public int myAtoi(String str) {
        int res = 0;
        int INT_MIN = (int) (-Math.pow(2, 31));
        int INT_MAX = (int) Math.pow(2, 31);
        // System.out.println(INT_MIN);
        boolean flag = true, pos = true;
        for (int i = 0; i < str.length(); i++) {
            char n = str.charAt(i);
            System.out.println(n);
            if (n == ' ') {
                continue;
            }
            if (flag && (n == '+' || n == '-')) {
                if (n == '-') pos = false;
                flag = false;
            } else {
                flag = false;
                if (Character.isDigit(n)) {
                    if (pos) {
                        if (res > (INT_MAX - (n - '0')) / 10) {
                            return INT_MAX;
                        } else {
                            res = res * 10 + (n - '0');
                        }
                    } else {
                        if (res < (INT_MIN + (n - '0')) / 10) {
                            return INT_MIN;
                        } else {
                            res = res * 10 - (n - '0');
                        }
                    }
                } else {
                    return res;
                }
            }
        }
        return res;
    }
}
