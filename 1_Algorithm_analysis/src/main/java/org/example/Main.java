package org.example;

public class Main {

    public static int finnMin(int[] A)
    {
        int min = A[0];         // Første elementet i listen
        int n = A.length;       //Lengden av listen
        for (int  i= 0; i < n ; i++) // Starter på 0, Så lenge i er mindre enn lengden på listen, legg til 1
        {
            if (A[i] < min) //
                min = A[i];
        }
        return min;
    }

    public static void main(String[]args ) throws InterruptedException {

        int[] test = {1000000 , 10, 12381293, 124, 1248, 2 , 41281};
        long start = System.nanoTime();

        //PROGRAM START

        //Thread.sleep(3000);

        //PROGRAM SLUTT

        long duration = (System.nanoTime() - start)*200000;
        System.out.println(finnMin(test) + " " + duration);
    }
}
