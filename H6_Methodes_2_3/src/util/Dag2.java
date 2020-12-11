package util;

public enum Dag2
{    
    MAANDAG(1),DINSDAG(2),WOENSDAG(3),DONDERDAG(4),VRIJDAG(5),ZATERDAG(6),ZONDAG(7);
    
    private final int dagNr; // moet final!
    
    Dag2(int dagNr) //constructor met packagetoegankelijkheid (tilde in UML)
    {
        this.dagNr = dagNr;
    }
    
    public int getDagNr()
    {
        return dagNr;
    }
  /*  
    private void setDagNr(int dagNr)
    {
        this.dagNr = dagNr;
    }*/
    @Override
    public String toString()
    {
        return this.name().toLowerCase();
    }
}
