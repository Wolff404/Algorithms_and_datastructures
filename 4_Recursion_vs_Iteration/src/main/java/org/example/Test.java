package org.example;

import java.util.Scanner;

public class Test {/*
    public static long C_iterativ(int n, int m) {
        int[][] matrise = new int[n + 1][n + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    matrise[i][j] = 1;
                }
                else {
                    matrise[i][j] = matrise[i - 1][j] + matrise[i - 1][j - 1];
                }

                System.out.print(matrise[i][j] + " ");
            }
            System.out.println();
        }
        return matrise[n][m];
    }
    */

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Velg n");

        int velgN = scanner.nextInt();
        //C_iterativ(velgN,0);



    }
}
