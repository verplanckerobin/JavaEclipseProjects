package cui;

public class Oef7_A {
	
	public static void main(String[] args) {
		
		int sum = 0;
		
		//for(int i = 12; i <= 500; i += 12)
			//sum += i;
		
		for (int teller = 0; teller <= 500; teller++)
			
			if (teller % 12 == 0)
				sum = sum + teller;
		
		System.out.printf("%d", sum);
		
	}

}
