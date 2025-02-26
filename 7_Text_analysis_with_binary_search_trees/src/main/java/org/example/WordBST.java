package org.example;


import java.io.*;
import java.util.Scanner;

public class WordBST
{
    class WordNode {
        int frekvens;
        String ord;
        WordNode venstre;
        WordNode høyre;

        public WordNode(String ord){
            this.ord = ord;
            this.venstre = null;
            this.høyre = null;
            this.frekvens = 1;

        }
        public void print(){
            System.out.println(ord + " med frekvens: " + frekvens);
        }

    }

    private WordNode rot; // Roten i hele søketreet
    private int n;        // Antall noder i hele treet

    public void WordBST() {
        rot = null;
        n = 0;
    }


    public int size() {
        return n;
    }

    public void insert(String ord) {
        WordNode nyttOrd = new WordNode(ord);

        if (rot == null){

            rot = nyttOrd;
            n++;
            return;
        }
        WordNode nåverende = rot;
        boolean ferdig = false;

        while (!ferdig) {
            int sammenligning = ord.compareTo(nåverende.ord);

            if (sammenligning < 0) {

                if (nåverende.venstre == null) {
                    nåverende.venstre = nyttOrd;
                    ferdig = true;
                    n++;

                }
                else
                    nåverende = nåverende.venstre;
            }
            else if (sammenligning > 0) {

                if (nåverende.høyre == null) {
                    nåverende.høyre = nyttOrd;
                    ferdig = true;
                    n++;

                }
                else{
                    nåverende = nåverende.høyre;}

            }
            else {
                nåverende.frekvens++;
                ferdig = true;
            }
        }
    }


    public void search(String ord) {
        WordNode nåverende = rot;

        while(nåverende != null){
        int sammenligning = ord.compareTo(nåverende.ord);

            if (sammenligning == 0){
                System.out.println(nåverende.ord + " ordet er funnet, med antall frekvens: " + nåverende.frekvens);
                return;
            }

            else if (sammenligning < 0){
                nåverende = nåverende.venstre;

            }
            else
                nåverende = nåverende.høyre;

        }

    }

    public void print() {
        print(rot);
    }


    private void print(WordNode rot) {
        if (rot != null){
            print(rot.venstre);
            System.out.println(rot.ord + "- frekvens: " + rot.frekvens);
            print(rot.høyre);
        }

    }




    public static void main (String[] argv) {
        // Leser filnavn fra bruker
        Scanner scan = new Scanner(System.in);
        System.out.print("File? ");
        String fileName = scan.next();


        // Oppretter ordleser og tomt søketre
        WordReader wR = new WordReader(fileName);
        WordBST wBST = new WordBST();

        // Leser alle ordene på filen og legger inn i treet
        String ord = wR.nextWord();
        while (ord != null)
        {
            wBST.insert(ord);
            ord = wR.nextWord();
        }
        // Skriver ut antall ulike ord som fantes i filen
        System.out.println(wBST.size() + " unique words " +
                "read from file " + fileName);

        // Menyvalg for å teste programmet
        int valg = 0;
        while(valg != 3)
        {
            System.out.print("\n1:Search, 2:Print, 3:Quit ? ");
            valg = scan.nextInt();
            if (valg == 1)
            {
                System.out.print("Search for? ");
                ord = scan.next();
                wBST.search(ord.toLowerCase());
            }
            else if (valg == 2)
                wBST.print();
        }
    }
}