package cui;

public class Oef6_C {

	public static void main(String[] args) {
		
		int N = 1;
		
		System.out.println("N\t10*N\t100*N\t1000*N");
		
		while (N <= 5) {
			
			System.out.printf("%d%9d%9d%9d%n", N, N*10, N*100, N*1000);
			N++;
			
		}
		
	}

}
