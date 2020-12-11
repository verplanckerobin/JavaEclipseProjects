package cui;

import java.security.SecureRandom;
import java.util.EnumSet;

import util.Dag;

public class DagApplicatie 
{
    public static void main(String[] args) 
    {
        System.out.println("Dagen van de week");
        for (Dag d : Dag.values()) 
        {
            System.out.println(d.name()); // name() is altijd beschikbaar!
          // of: System.out.println(d);
        }

        System.out.println("Lang weekend");
        for (Dag d : EnumSet.range( Dag.VRIJDAG, Dag.ZONDAG)) 
        {
            System.out.println(d.name());
        }
        
        SecureRandom s = new SecureRandom();
        int getal;
        Dag d;

        for (int i = 1; i <= 5; i++) 
        {
            getal = s.nextInt(7); // 0 - 6
            d = Dag.values()[getal];
            System.out.println(String.format("Dagnummer %d: %s", getal + 1, d.name()));
        }

        d = Dag.MAANDAG;

        if (d == Dag.MAANDAG) 
        {
            System.out.println("Eerste dag van de werkweek.");
        } else 
        {
            System.out.println("Dit is niet de eerste dag van de werkweek.");
        }

        switch(d)
        {
        case MAANDAG -> System.out.println("Eerste dag van de werkweek.");
        default -> System.out.println("Dit is niet de eerste dag van de werkweek.");
        }
    }
}