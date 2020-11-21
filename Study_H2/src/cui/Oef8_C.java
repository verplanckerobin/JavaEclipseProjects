package cui;

public class Oef8_C {

	public static void main(String[] args) {
		
		System.out.println("N\t10*N\t100*N\t1000*N");
		
		for (int N = 1; N <= 5; N++)
			
			System.out.printf("%d%9d%9d%9d%n", N, N*10, N*100, N*1000);

	}

}
