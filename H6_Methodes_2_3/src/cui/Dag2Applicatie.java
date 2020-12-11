package cui;

import java.security.SecureRandom;

import util.Dag2;

public class Dag2Applicatie
{
	 public static void main(String[] args) 
	 {
	        for (Dag2 d : Dag2.values()) 
	        {
	            System.out.println(String.format("Dag %d: %s", d.getDagNr(), d.name()));
	        } 
	        
	        for (Dag2 d : Dag2.values()) 
	        {
	        	System.out.println(String.format("Dag %d: %s", d.getDagNr(), d));
	        } // hier met toString()! 
	        
	        SecureRandom s = new SecureRandom();
	        int getal;
	        Dag2 d;

	        for (int i = 1; i <= 5; i++) 
	        {
	            getal = s.nextInt(7); // 0 - 6
	            d = Dag2.values()[getal];
	            System.out.println(String.format("Dagnummer %d: %s", d.getDagNr(), d.name()));
	        }
	 }      
	      
}
