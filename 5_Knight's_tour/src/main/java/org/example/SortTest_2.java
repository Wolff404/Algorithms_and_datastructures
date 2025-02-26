package org.example;

import java.util.*;
import java.lang.System;


public class SortTest_2 {

    public static void main(String argv[]) {
        int n = 1000000;

        System.out.print("n        | tA     |  tL  |  tL/tA   \n");
        System.out.print("-----------------------------------");

        for (long i = n; n <= 10000000; n+=1000000 ){

            /***Array***/
            int A[] = new int[n];
            Random r = new Random();

            //Array - Første del
            for(int m = 0; m < n/3; m++) {
                A[m] = m;
            }

            //Array - Andre del
            for (int m = n/3; m < 2*n/3; m++){
                A[m] = r.nextInt(2*n);
            }

            //Array - Tredje del
            for(int m = 2*n/3; m < n; m++){
                A[m] = m - n/3;
            }


            /***Linked list***/
            LinkedList L = new LinkedList();

            //Linked list - Første del
            for(int m = 0; m < n/3; m++) {
                L.add(m);

            }

            //Linked list - Andre del
            for (int m = n/3; m < 2*n/3; m++){
                L.add(r.nextInt(2*n));

            }

            //Linked list- Tredje del
            for(int m = 2*n/3; m < n; m++){
                L.add(m - n/3);
            }

            long tA, tL, t;

            //Array tid
            t = System.currentTimeMillis();
            Arrays.sort(A);
            tA = System.currentTimeMillis() - t;

            //Linked list tid
            t = System.currentTimeMillis();
            Collections.sort(L);
            tL = System.currentTimeMillis() - t;

            System.out.printf("\n%d  |  %d   | %d  |  %-5.1f",n, tA,tL, (float) tL / (float) tA);

        }

    }
}