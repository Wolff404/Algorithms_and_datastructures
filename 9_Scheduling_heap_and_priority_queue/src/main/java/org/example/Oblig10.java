package org.example;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.io.*;

public class Oblig10
{
    public static PriorityQueue<Process> read(String fileName) {
        PriorityQueue<Process> processKø = new PriorityQueue<>(new ProcessComparator());

        try {
            File fil = new File(fileName);
            Scanner scanner = new Scanner(fil);

            while (scanner.hasNextLine()) {

                String linje = scanner.nextLine();
                String[] tokens = linje.split("\\s+");

                String navn = tokens[0];
                int prioritet = Integer.parseInt(tokens[1]);
                int kjøreTid = Integer.parseInt(tokens[2]);

                Process prosess = new Process(navn, prioritet, kjøreTid);
                processKø.add(prosess);
            }

            scanner.close();

        } catch (FileNotFoundException e) {System.out.println("Fant ikke fil.");}

        return processKø;
    }
    public static void run(PriorityQueue<Process> pQ) {
        int tid = 0;
        double totalTurnaround = 0;
        int størrelse = pQ.size();
        System.out.println("\nPrio.\tCPU\tStart\tSlutt\tNavn");

        while (!pQ.isEmpty()) {
            Process p = pQ.poll();
            int start = tid;
            int slutt = start + p.runTime;
            tid = slutt;

            System.out.println(p.priority + "     \t" + p.runTime + " \t" + start + "    \t" + slutt + "    \t" + p.name);
            totalTurnaround += slutt;
        }

        double gjennomsnittligTurnaround = totalTurnaround / størrelse;
        System.out.println("\nGjennomsnittlig turnaround: " + gjennomsnittligTurnaround);
    }



    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("File? ");
        String fileName = scan.nextLine();

        PriorityQueue<Process> pQ = read(fileName);
        System.out.println("Read " + pQ.size() +
                " processes from " + fileName);
        run(pQ);
    }
}