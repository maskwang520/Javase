package com.jms.consumer;

/**
 * Created by maskwang on 2017/7/26 0026.
 */
public class Solution {
    public static int LastRemaining_Solution(int n, int m) {
        int[] person = new int[n];
        int count = 0, temp = 0, k = 0, i, j = 0;
//        for ( i = 0; i < person.length; i++) {
//            person[i] = 1;
//        }
        while (count != n - 1) {
            while (k < person.length) {
                if (person[k] == 1) {
                    k++;
                    continue;
                } else {
                    j++;
                }
                if (j % m == 0) {
                    count++;
                    person[k] = 1;
                }
                k++;
            }
            if (k == person.length)
                k = 0;
        }
        for (i = 0; i < person.length; i++) {
            if (person[i] == 0) {
                temp = person[i];
                break;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        System.out.println(LastRemaining_Solution(5, 3));
    }
}
