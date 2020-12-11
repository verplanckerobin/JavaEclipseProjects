
package cui;

import domein.Doos;

public class H6_24 {
 
    
    public static void main(String[] args) {
        
        H6_24 oef = new H6_24();
        Doos d1 = oef.maakDoos(true);
        Doos d2 = oef.maakDoos(false);
        
        drukDoosAf(1,d1);
        drukDoosAf(2,d2);
        
        System.out.printf("Dozen aanwezig in de applicatie: %d%n", Doos.getAantalDozen());
        
    }
    
    public static void drukDoosAf(int nummer, Doos d){
        System.out.printf("Doos %d: %s%n",nummer, d.toString());
    }
    
    public Doos maakDoos(boolean automatisch){
        
       Doos d = null;
       
       if (automatisch)
           d = new Doos();
       else{
           d = new Doos(5.0,6.0,8.0,"geel");
       }
           
       
       return d;
       
    }
}
