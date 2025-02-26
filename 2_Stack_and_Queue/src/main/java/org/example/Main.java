package org.example;
import java.io.*;
import java.util.*;
import java.util.Queue;
import java.util.Stack;


public class Main
{
    public static String ROT13(String S)
    {
        char[] C = S.toCharArray();
        for (int i = 0; i < S.length(); i++)
        {
            char c = C[i];
            if       (c >= 'a' && c <= 'm') c += 13;
            else if  (c >= 'A' && c <= 'M') c += 13;
            else if  (c >= 'n' && c <= 'z') c -= 13;
            else if  (c >= 'N' && c <= 'Z') c -= 13;
            C[i] = c;
        }
        return String.valueOf(C);
    }
    public static String krypter(String S){
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();
        String krypterte = new String();

        int n = S.length();
        int halvertlengde = n / 2; //Hva skjer med oddetall?

        for (int i = 0; i < halvertlengde; i++ ){
            char x = S.charAt(i);
            char y = S.charAt(halvertlengde + i);
            queue.add(x);
            stack.push(y);
        }

        for (int i = 0; i < halvertlengde; i++){
            krypterte += stack.pop();
            krypterte += queue.remove();
        }
        return krypterte;
    }

    public static String dekrypter(String S){
        Stack<Character> deStack = new Stack<>();
        String dekrypterte = new String();

        int n = S.length();

        for(int i = 0; i < n; i += 2 ){
            char x = S.charAt(i);
            char y = S.charAt(i+1);
            deStack.add(x);
            dekrypterte += y;

        }
        int stackSize = deStack.size();

        for (int i = 0; i < stackSize; i++){
            dekrypterte += deStack.pop();
        }

        return dekrypterte;
    }

    public static void main(String[] args) {
        String x = ROT13("Karmann-Ghia");
        System.out.println(x + " : Tester for ROT13 metoden  \n");

        String kryptertStreng = krypter(x);
        System.out.println(kryptertStreng + " : Tester for kryptering av streng \n");

        String deKrypterStreng = dekrypter(kryptertStreng);
        System.out.println(deKrypterStreng + ": Tester for dekryptering av strengen \n");

        String y = ROT13(deKrypterStreng);
        System.out.println(y + " : Tester for å snu den dekrypterte strengen med ROT13 igjen ");

    }
}