package org.example;

import java.util.Random;
import java.util.Scanner;

public class labyrint {
    // Verdier som kan lagres i labyrinten
    int STENGT = 0, FRI = 1, BRUKT = 2, VEI = 3;

    // Størrelse på kvadratisk labyrint og 2D-tabell som lagrer
    // labyrinten
    int n;
    int L[][];

    // Konstruktør som oppretter en tilfeldig labyrint med en gitt
    // prosentandel blokkerte ruter
    public labyrint(int n, int prosentBlokkert) {
        this.n = n;
        L = new int[n][n];
        Random R = new Random();

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                if (R.nextInt(100) < prosentBlokkert)
                    L[i][j] = STENGT;
                else
                    L[i][j] = FRI;
    }

    // Funksjonen finnVei leter rekursivt etter en vei gjennom
    // labyrinten fra rute (i,j) til rute (n-1,n-1).
    // Returnerer true hvis vi fant en slik vei, false ellers
    boolean finnVei(int i, int j) {
        // Bunn i rekursjonen: Ferdig hvis vi er i nedre høyre hjørne
        if (i == n - 1 && j == n - 1) {
            // Markerer at siste rute i labyrinten ligger på veien som
            // er funnet, og returnerer true
            L[i][j] = VEI;
            return true;
        }

        // Markerer at rute (i,j) nå er oppsøkt
        L[i][j] = BRUKT;

        // Prøver alle fire mulige lovlige veier videre fra rute (i,j)
        // i denne rekkefølgen: 1. Ned, 2. Høyre , 3. Venstre, 4. Opp
        int dI[] = {1, 0, 0, -1};
        int dJ[] = {0, 1, -1, 0};

        for (int k = 0; k < 4; k++) {
            int nyI = i + dI[k];
            int nyJ = j + dJ[k];

            // Sjekker om det er lovlig å gå til ny posisjon
            if (nyI >= 0 && nyI < n && nyJ >= 0 && nyJ < n && L[nyI][nyJ] == FRI) {
                // Prøver å finne vei videre rekursivt
                if (finnVei(nyI, nyJ)) {
                    // Her vet vi at det ble funnet en vei gjennom
                    // labyrinten fra rute (i,j). Merker av at (i,j)
                    // ligger på denne veien og stopper deretter videre
                    // leting etter vei ved å returnere true
                    L[i][j] = VEI;
                    return true;
                }
            }
        }
        // Hvis vi kommer hit i koden, fantes det ingen vei gjennom
        // labyrinten fra rute (i,j), returnerer false
        return false;
    }

    // Gjør om labyrinten til en tekststreng for utskrift, markerer
    // evt. funnet vei med stjerner ('*')
    public String toString() {
        String result = "\n";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                if (L[i][j] == VEI)
                    result += "* ";
                else
                    result += L[i][j] + " ";
            result += "\n";
        }
        return result;
    }

    // Testprogram
    public static void main(String argv[]) {
        // Leser størrelsen på labyrinten og prosentandel blokkerte ruter
        Scanner scanner = new Scanner(System.in);
        System.out.print("n?: ");
        int n = scanner.nextInt();
        System.out.print("% blokkerte ruter?: ");
        int prosentBlokkert = scanner.nextInt();

        // Oppretter ny labyrint
        labyrint lab = new labyrint(n, prosentBlokkert);

        // Leter etter vei fra øvre venstre hjørne
        boolean funnetVei = lab.finnVei(0, 0);

        // Skriver ut labyrinten (og evt. funnet vei)
        System.out.println(lab);
        if (!funnetVei)
            System.out.println("Fant ingen vei gjennom labyrinten");
    }
}
