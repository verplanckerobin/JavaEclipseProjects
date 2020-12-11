package cui;

import java.util.ArrayList;
import java.util.List;

import domein.Complex;

public class H6_213 {

	public static void main(String[] args) {
		
		List<Complex> lijst = new ArrayList<>();
		lijst.add(new Complex());
		lijst.add(new Complex(5, 0));
		lijst.add(new Complex(6.2, 7.8));
		
		for(Complex c: lijst)
			System.out.println(c);
		
		lijst.add(lijst.get(1).telOp(lijst.get(2)));
		
		System.out.println("Na de optelling");
		for(Complex c: lijst)
			System.out.println(c);
		
	}

}
