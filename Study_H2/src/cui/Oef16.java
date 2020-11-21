package cui;

public class Oef16 {

	public static void main(String[] args) {
		
		//Patroon A
		System.out.println("Patroon A");
		
		for(int i = 1; i <= 10; i++) {
			
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		//Patroon C
		System.out.println("Patroon C");
				
		for(int i = 1; i <= 10; i++) {
					
			for(int j = 10; j >= i; j--) {
				System.out.print("*");
			}
					
			System.out.println();
		}
		
		//Patroon B
		System.out.println("Patroon B");
		
		for(int i=1; i<=10; i++) {
			
			for(int j=1; j<=i-1; j++) {
				System.out.print(" ");
			}	
			for(int k = 10; k >= i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//Patroon D
		System.out.println("Patroon D");
				
		for(int i=1; i<=10; i++) {
					
			for(int j=9; j>=i; j--) {
				System.out.print(" ");
			}	
			for(int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
}

		
		
		