package cui;

public class Chapter1 {

	public static void main(String[] args) {
		
		String string = "This is also a string";
		
		System.out.println("Welcome\nto\nJava\nProgramming"); //use of \n 
		System.out.print("This is a sentence "); //print
		System.out.println("Java Programming ex"); //println
		System.out.printf("%S%n%s%n", "Robin Verplancke", "Maya Smits"); //formatted 
		System.out.printf("%s%n", string); //formated small
		System.out.printf("%S%n", string); //formatted capital
		System.out.printf("%d%n", 30); //decimaal
		System.out.printf("%d%n", +30); //decimaal
		System.out.printf("%2d%n", -30); //decimaal + veldbreedte
		System.out.printf("%4o%n", 30); //octaal + veldbreedte
		System.out.printf("%6x%n", 30); //hexadecimaal + veldbreedte
		System.out.printf("%8X%n", 30); //HEXADECIMAAL + veldbreedte 
	}

}
