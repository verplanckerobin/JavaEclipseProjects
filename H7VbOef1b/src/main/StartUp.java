package main;

import cui.RekeningApp;
import domein.DomeinController;

public class StartUp {

	public static void main(String[] args) {
		
		//In de main gebeurd altijd hetzelfde! 3 items
		
		//Maak object van DomeinController
		DomeinController dc = new DomeinController();
		
		//Geef dat object door aan de presentatielaag, hier RekeningApp
		RekeningApp app = new RekeningApp(dc);
		
		//Roep de juiste methode aan in de presentatielaag
		app.werkMetRekeningen();

	}

}
