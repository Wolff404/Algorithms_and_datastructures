package org.example;

//Tester for O(n^3) -  Altså, om den er kubisk i O notasjon
public class testplass {

    public static void eksponensiell (long n) { // Oppgave 3 a)
        long tmp = 2;
        long resultat = 1;

        for (long i = 0; i <= n ; i++) {

            System.out.println(n);
        }


    }

    public static void eks(long n) {
        long x = 2;
        long resultat = 1;
        for (long i = 1; i <= n; i++)
            resultat *= x;
        System.out.println(resultat);

    }
    public static long factorial(long n){ //Ikke en løkke
        if (n == 0)
            return 1;
        else
            return(n * factorial(n-1));
    }
    public static int beregnFaktorial(int n) {
        int resultat = 1;
        System.out.print(n + "! = ");
        for (int i = n; i >= 1; i--) {
            resultat *= i;
            System.out.print(i);
            if (i > 1) {
                System.out.print(" * ");
            }
        }
        System.out.println(" = " + resultat);
        return resultat;
    }

    public static void faktoriell(long n ){
        long faktor = 1;
        for(long i = n; i > 1; i--){
            faktor *= i;
            System.out.println(faktor);
        }
            //System.out.println(faktor);
    }

    public static void main(String args[]){
        //System.out.println(beregnFaktorial(5));
        faktoriell(6);


    }
    /*
    public static void duper(long n) { // Oppgave 1 a)
        int iterasjoner = 0;
        for (long i = 0; i < n; i++){
            for (long j = n; j > 0; j /= 2, iterasjoner++){
                System.out.println(iterasjoner);
            }
        }
    }
    public static void main(String args[]){
        duper(50);

    }

     */

    /*
    public static void kubisk(long n, long x){
        if (x <= 1000){  // Lå til en if test for å sjekke at når n=10 så skal den ha 1000 itereringer.
            for (int i = 0; i < n; i++){
                for (int j = 0; j < n; j++){
                    for (int k = 0; k < n; k++){
                        System.out.println( x++ + " ITERATION NR" );

                    }
                }
            }
       }
    }

     */




    /*
    public static void kubisk(double n, double x){
        if (x <= 1000){
            for (int i = 0; i < n; i++){
                for (int j = 0; j < n; j++){
                    for (int k = 0; k < n; k++){
                        System.out.println("Hello" + " - " + x++ + " ITERATION NR" );

                    }
                }
            }
        }
    }
    public static void main(String args[]){
        kubisk(10, 0);

    }

     */
}
