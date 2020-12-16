package cui;

import domein.DomeinController;

public class RekeningApp {

	private final DomeinController dc;

	public RekeningApp(DomeinController dc) {
		this.dc = dc;
	}
	
	public void werkMetRekeningen() {
		System.out.println(dc.geefRekeningen());
	}
	
}
