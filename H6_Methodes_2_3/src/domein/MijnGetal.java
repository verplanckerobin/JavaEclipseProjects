package domein;

public class MijnGetal 
{
	private int getal;
	
	public MijnGetal(int getal)
	{
		this.setGetal(getal);
	}

	public int getGetal() 
	{
		return getal;
	}
	/*
	public final void setGetal(int getal)
	{
		if (getal > 0)
		   this.getal = getal;
		else 
		   this.getal = 1;
	}
	*/
	
	public final void setGetal(int getal)
	{
		if (getal > 0)
		   this.getal = getal;
		else 
		   throw new IllegalArgumentException("Het getal moet strikt positief zijn!");
	}
	
}








