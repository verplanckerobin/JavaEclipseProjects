package domein;


public class Hoofdstuk 
{
	private String titel;

	public Hoofdstuk() {
		setTitel("onbekend");
	}

	public String getTitel() {
		return titel;
	}

	public final void setTitel(String titel) 
	{
		if (titel == null || titel.trim().isEmpty()) //trim haalt begin en eind spaties weg
			throw new IllegalArgumentException("woord moet ingevuld zijn");
		if (titel.length() < 2)
			throw new IllegalArgumentException("woord is te klein");
		
		this.titel = titel;
	}
}
