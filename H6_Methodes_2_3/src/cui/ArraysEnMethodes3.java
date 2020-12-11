package cui;

import java.util.Scanner;

public class ArraysEnMethodes3 // oef11 H5 -> oef 17 H6
{
	public static void main(String[] args)
	{
		ArraysEnMethodes3 ob = new ArraysEnMethodes3();
		double matrix[][] = new double[3][2]; //3 rijen, 2 kolommen
		
		ob.vulArray(matrix);
		
		double gem = ob.bepaalGemiddelde(matrix);
		String uitvoer = String.format("gemiddelde is %.1f%n", gem);
	    System.out.printf(uitvoer);
	    
	    System.out.println("De som van elke rij:");
	    int teller = 1;
	    for (double[] rij: matrix)
	    	 System.out.printf("Rij %d: %.1f%n",teller++,ob.bepaalSomVanRij(rij));
	 // OF   
	    for (int i = 0; i < matrix.length;i++)
	    	 System.out.printf("Rij %d: %.1f%n",i+1,ob.bepaalSomVanRij(matrix[i]));    
	}
	

	private void vulArray(double[][] matrix)
	{
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < matrix.length;i++)//rijen
            for(int j = 0;j < matrix[i].length;j++)
            {
                System.out.printf("Geef getal op rij %d en kolom %d: ",i+1,j+1);
                matrix[i][j] = input.nextDouble();
            }
	}

	private double bepaalGemiddelde(double[][] matrix)
	{
		double gem;
        double som = 0;
        int aantalGetn = 0;
        for(double[] rij :matrix)//double[][] matrix
        {
            for(double getal:rij)
                som += getal;
            
            aantalGetn += rij.length; 
        }
        gem = som/aantalGetn;
		return gem;
	}
	

	private double bepaalSomVanRij(double[] rij)
	{
		int som = 0;
		for(double getal: rij)
			som += getal;
		return som;
	}
	
}








