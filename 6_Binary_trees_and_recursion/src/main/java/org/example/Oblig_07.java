package org.example;
import java.util.LinkedList;
import java.util.Queue;


public class Oblig_07 {

    // Oppgave 1
    static void settSum(Trenode rot) {
        if (rot == null) {
            return;
        }

        settSum(rot.venstre);
        settSum(rot.høyre);

        rot.sum = rot.verdi;

        if (rot.venstre != null){
            rot.sum += rot.venstre.sum;
        }
        if (rot.høyre != null){
            rot.sum += rot.høyre.sum;
        }

    }

    // Oppgave 2
    static void settForelder(Trenode rot) {
        if(rot == null){
            return;
        }

        settForelder(rot.venstre);
        settForelder(rot.høyre);

        if(rot.venstre != null){
            rot.venstre.forelder = rot;
        }

        if(rot.høyre != null){
            rot.høyre.forelder = rot;
        }

    }

    // Oppgave 3
    static void skrivUt(Trenode rot) {
        if (rot == null){
            return;
        }
        Queue<Trenode> Kø = new LinkedList<>();
        Kø.add(rot);

        while(!Kø.isEmpty()) {

            Trenode nåverende = Kø.poll();

            if (nåverende.venstre != null){
                Kø.add(nåverende.venstre);
            }

            if (nåverende.høyre != null){
                Kø.add(nåverende.høyre);
            }
            if (nåverende.forelder == null){
                System.out.printf("Verdi: %s, Forelder: *, Sum: %s\n", nåverende.verdi, nåverende.sum);

            }
            else {
                System.out.printf("Verdi: %s, Forelder: %s, Sum: %s\n", nåverende.verdi, nåverende.forelder.verdi, nåverende.sum);
            }
        }



    }

    // Testprogram
    public static void main(String args[])
    {
        Trenode rot =
                new Trenode(8,
                        new Trenode(4,
                                new Trenode(2, null, null),
                                new Trenode(6, null, null)),

                        new Trenode(16,
                                new Trenode(14,
                                        new Trenode(12, null, null),
                                        new Trenode(15, null, null)),

                                new Trenode(18, null,
                                        new Trenode(20, null, null))));

        settSum(rot);
        settForelder(rot);
        skrivUt(rot);
    }


}