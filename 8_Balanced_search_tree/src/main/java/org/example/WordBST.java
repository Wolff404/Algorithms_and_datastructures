package org.example;

import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;

public class WordBST
{

    public Map<String, Integer> T = new TreeMap<>();

    public int size() {
        return T.size();
    }

    public void insert(String key) {
        if (T.containsKey(key)) {
            T.put(key, T.get(key) + 1);
        }
        else {
            T.put(key, 1);
        }
    }

    public void search(String key) {
        if (T.containsKey(key)){
            System.out.println(key + " " + T.get(key));
        }
        else
            System.out.println("Fant ikke ordet du søkte etter.");
    }

    public void print() {
        for (String key : T.keySet()) {
            System.out.println(key + ": " + T.get(key));
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
                wBST.search(ord);
            }
            else if (valg == 2)
                wBST.print();
        }
    }
}