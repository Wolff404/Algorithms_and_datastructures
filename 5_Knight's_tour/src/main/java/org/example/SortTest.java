package org.example;

import java.util.*;

public class SortTest
{
    public static void main(String argv[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("n? ");
        int n = in.nextInt();

        // Fyller array med tilfeldige tall
        int A[] = new int[n];
        Random r = new Random();
        for (int i = 0; i < n; i++)
            A[i] = r.nextInt(2*n);

        // Oppretter en lenket liste og fyller den med de samme
        // tallene i samme rekkefølge som i arrayen
        LinkedList L = new LinkedList();
        for (int i = n-1; i >= 0; i--)
            L.addFirst(Integer.valueOf(A[i]));

        long tA, tL, t;

        t = System.currentTimeMillis();
        Arrays.sort(A);
        tA = System.currentTimeMillis() - t;

        t = System.currentTimeMillis();
        Collections.sort(L);
        tL = System.currentTimeMillis() - t;

        System.out.printf("tA: %-5d   tL: %-5d   tL/tA: %-5.1f\n",
                tA, tL, (float) tL / (float) tA);
    }
}