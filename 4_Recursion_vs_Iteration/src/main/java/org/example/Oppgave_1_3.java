package org.example;

import java.util.Scanner;

public class Oppgave_1_3 {
    //Oppgave 1
    public static long C_rekursiv(int n, int m){
        if (m == 0 || m == n ){
            return 1;
        }
        return C_rekursiv(n -1, m) + C_rekursiv(n-1,m-1);

    }

    //Oppgave 3
    public static void rekursivPrint(int n){
        for(int m = 0; m <= n; m++){
            System.out.println("C(" + n +  "," + m + ")" + " = " + C_rekursiv(n, m));

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Velg n:");

        int velgN = scanner.nextInt();
        rekursivPrint(velgN);

        //biocoefficiantPrint(15);

        /*
        long test = C_rekursiv(6,4);
        System.out.println(test);
        biocoefficiantPrint(15);
        biocoefficiantPrint(35);
        long test0 = C_rekursiv(6,0);
        long test1 = C_rekursiv(6,1);
        long test2 = C_rekursiv(6,2);
        long test3 = C_rekursiv(6,3);
        long test4 = C_rekursiv(6,4);
        long test5 = C_rekursiv(6,5);
        long test6 = C_rekursiv(6,6);
        System.out.println(test0);
        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);
        System.out.println(test4);
        System.out.println(test5);
        System.out.println(test6);
         */
    }
}