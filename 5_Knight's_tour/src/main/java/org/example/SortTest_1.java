package org.example;

import java.util.*;
import java.lang.System;


public class SortTest_1 {

    public static void main(String argv[]) {

        int n = 1000000;
        System.out.print("n        | tA     |  tL  |  tL/tA   \n");
        System.out.print("----------------------------------");

        for (long i = 0 ; n <= 10000000; n+=1000000 ){

            int A[] = new int[n];
            Random r = new Random();
            for (int m = 0; m < n; m++)
                A[m] = r.nextInt(2*n);

            LinkedList L = new LinkedList();
            for (int j = n-1; j >= 0; j--)
                L.addFirst(Integer.valueOf(A[j]));

            long tA, tL, t;

            t = System.currentTimeMillis();
            Arrays.sort(A);
            tA = System.currentTimeMillis() - t;

            t = System.currentTimeMillis();
            Collections.sort(L);
            tL = System.currentTimeMillis() - t;

            System.out.printf("\n%d  |  %d   | %d  |  %-5.1f",n, tA,tL, (float) tL / (float) tA);

        }

    }
}