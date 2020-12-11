package cui;

import domein.MijnGetal;

public class MijnGetalApplicatie
{

	public static void main(String[] args)
	{
		MijnGetal mg = new MijnGetal(3);
		System.out.println("Getal = " + mg.getGetal());
		mg.setGetal(-1);
		System.out.println("Getal = " + mg.getGetal());
	}

}
