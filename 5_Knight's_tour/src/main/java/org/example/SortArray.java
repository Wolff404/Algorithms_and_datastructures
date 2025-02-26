package org.example;
import java.util.*;


public class SortArray
{
    public static void main(String argv[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("n? ");
        int n = in.nextInt();

        // Legger inn n tilfeldige tall i en array
        int A[] = new int[n];
        Random r = new Random();
        for (int i = 0; i < n; i++)
            A[n-i-1] = r.nextInt(2*n);

        // Sorterer arrayen og skriver ut
        Arrays.sort(A);
        System.out.println(Arrays.toString(A));
    }
}