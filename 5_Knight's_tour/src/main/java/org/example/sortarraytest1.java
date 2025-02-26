package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class sortarraytest1 {
    public static void main(String argv[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("n? ");
        int n = in.nextInt();

        // Legger inn n tilfeldige tall i en array
        int A[] = new int[n];
        Random r = new Random();

        for(int m = 0; m < n/3; m++) {
            A[m] = m;
        }

        //Andre del
        for (int m = n/3; m < 2*n/3; m++){
            A[m] = r.nextInt(2*n);
        }

        //Tredje del
        for(int m = 2*n/3; m < n; m++){
            A[m] = m - n/3;
        }

        // Sorterer arrayen og skriver ut
        //Arrays.sort(A);
        System.out.println(Arrays.toString(A));
    }
}
