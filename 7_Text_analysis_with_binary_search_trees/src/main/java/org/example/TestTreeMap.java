package org.example;

import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {
    public static void main(String[] args)
    {
        // Oppretter et tomt søketre T med String som key
        // og Integer som dataverdier
        Map<String, Integer> T = new TreeMap<>();

        // Legger inn syv ord med tilhørende tallverdier
        T.put("pear", 4);
        T.put("banana", 9);
        T.put("apple", 8);
        T.put("coconut", 2);
        T.put("mango", 10);
        T.put("peach", 5);
        T.put("papaya", 5);

        // Les et ord fra bruker
        Scanner scan = new Scanner(System.in);
        System.out.print("? ");
        String ord = scan.next();

        // Skriv ut ordet hvis det finnes i treet
        if (T.containsKey(ord))
            System.out.println(ord + ": " + T.get(ord));

        // Oppdaterer en verdi i treet
        T.replace("coconut", 3);

        // Fjerner en verdi fra treet
        T.remove("mango");

        // Skriver ut antall noder, og alle dataene i
        // treet ved å iterere over nøkkelverdiene
        System.out.println("\nAll " + T.size() +
                " nodes in search tree:\n");
        for (String key : T.keySet())
            System.out.println(key + ": " + T.get(key));
    }
}