package org.example;

import java.util.Comparator;

public class ProcessComparator implements Comparator<Process>
{
    public int compare(Process p1, Process p2)
    {
        if (p1.priority > p2.priority)
            return 1;
        if (p1.priority < p2.priority)
            return -1;
        return 0;
    }
}