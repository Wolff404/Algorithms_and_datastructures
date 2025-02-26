package org.example;
import java.io.*;
import java.util.Scanner;

class oblig_1
{
    public static void lineær(long n)
    {
        int tmp = 1;
        for (long i = 0; i < n; i++)
            tmp *= 1;
    }

    public static void kvadratisk(long n)
    {
        int tmp = 1;
        for (long i = 0; i < n; i++)
            for (long j = 0; j < n; j++);
        tmp *= 1;
    }

    public static int logaritmisk(long n)
    {
        int tmp = 1, iterasjoner = 0;
        for (long i = n; i > 0; i /= 2, iterasjoner++)
            tmp *= 1;
        return iterasjoner;
    }

    public static void superlinær(long n){ // Oppgave 1 a)
        int iterasjoner = 0;
        for (long i = 0; i < n; i++){
            for (long j = n; j > 0; j /= 2, iterasjoner++){
                //System.out.println(iterasjoner);
            }
        }
    }
    public static void kubisk(long n, long x){ //Oppgave 2 a)
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                for (int k = 0; k < n; k++){
                    //System.out.println(x++ + " ITERATION NR" );
                }
            }
        }
    }

    public static void eksponentiell(long n){ //Oppgave 3 a)
        long x = 2;
        long resultat = 1;
        for (long i = 1; i <= n; i++) {
            resultat *= x;
            //System.out.println(resultat);
        }
    }

    public static void kombinatorisk(long n ){ //Oppgave 4 a)
        long kombinator = 1;
        for(long i = n; i > 1; i--){
            kombinator *= i;
            //System.out.println(kombinator);
        }
        System.out.println(kombinator);
    }


    public static void main(String[] args)
    {
        Scanner S = new Scanner(System.in);
        long n, T, T1, T2;
        int valg, iterasjoner = 0;

        System.out.print("1:O(n) 2:O(n²) 3:O(log_n) 4:O(n*log(n)) 5:O(n^3) 6:O(2^n) 7:O(n!)  ? ");
        valg = S.nextInt();
        System.out.print("n? ");
        n = S.nextLong();

        T1 = System.currentTimeMillis();
        if (valg == 1)
            lineær(n);
        else if (valg == 2)
            kvadratisk(n);
        else if (valg == 3)
            iterasjoner = logaritmisk(n);
        else if (valg == 4) // Oppgave 1 a)
            superlinær(n);
        else if (valg == 5) // Oppgave 2 a)
            kubisk(n,0);
        else if (valg == 6) // Oppgave 3 a) | n sin høyeste verdi er på 62.
            eksponentiell(n);
        else if (valg == 7) // Oppgave 4 a)
            kombinatorisk(n);

        T2 = System.currentTimeMillis();

        T = T2 - T1;
        System.out.print("T = " + T + " ms");
        if (valg == 3)
            System.out.print(" (" + iterasjoner + ")");
        System.out.println();
    }
}