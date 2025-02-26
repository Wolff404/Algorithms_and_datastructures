package org.example;
import java.util.*;


public class SortList
{
    public static void main(String argv[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("n? ");
        int n = in.nextInt();

        // Legger inn n tilfeldige tall i en lenket liste
        LinkedList L = new LinkedList();
        Random r = new Random();
        for(int m = 0; m < n/3; m++) {
            L.add(m);

        }

        //Andre del starter med n/3
        for (int m = n/3; m < 2*n/3; m++){
            L.add(r.nextInt(2*n));

        }

        //Tredje del starter med 2*n/3
        for(int m = 2*n/3; m < n; m++){
            L.add(m - n/3);
        }

        // Sorterer listen og skriver ut
        //Collections.sort(L);
        System.out.println(L);
    }
}