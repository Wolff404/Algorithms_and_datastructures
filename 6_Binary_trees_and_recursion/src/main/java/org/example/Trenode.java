package org.example;

public class Trenode
{
    int verdi;
    int sum;
    Trenode venstre, høyre;
    Trenode forelder;

    public Trenode(int verdi, Trenode venstre, Trenode høyre)
    {
        this.verdi = verdi;
        this.venstre = venstre;
        this.høyre = høyre;
        sum = 0;
        forelder = null;
    }
}
