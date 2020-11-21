package domein;

public class Driehoek {

	private int a;
	private int b;
	private int c;

	public Driehoek(int a, int b, int c) {
		setA(a);
		setB(b);
		setC(c);
	}
	
	public int getA() {
		return a;
	}
	
	public int getB() {
		return b;
	}
	
	public int getC() {
		return c;
	}
	
	private void setA(int a) {
		this.a = a>0 ? a:1;
	}

	private void setB(int b) {
		this.b = b>0 ? b:1;
	}

	private void setC(int c) {
		this.c = c>0 ? c:1;
	}

	public boolean isRechthoekigeDriehoek() {
		return a*a == b*b + c*c || b*b == a*a + c*c || c*c == b*b + a*a;
		
	}
}
