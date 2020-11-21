package domein;

public class Patroon {
	
	private char type;
	private char opvulteken;
	
	public Patroon(char type, char opvulteken) {
		setType(type);
		setOpvulteken(opvulteken);
	}
	
	public Patroon(char type) {
		setType(type);
		setOpvulteken('*');
	}
	
	public char getType() {
		return type;
	}
	
	public char getOpvulteken() {
		return opvulteken;
	}
	
	private void setOpvulteken(char opvulteken) {
		if (opvulteken != '*' && opvulteken != '+' && opvulteken != '-' && opvulteken != '!' && opvulteken != '?')
			this.opvulteken = '*';
		else
			this.opvulteken = opvulteken;
	}
	
	private void setType(char type) {
		if (type < 'A' || type > 'D')
			this.type = 'A';
		else
			this.type = type;
	}
	
	private String tekenPatroonA() {
		String output = "Patroon A\n";
		for(int rij = 1; rij <= 10; rij++) {
			for(int teken = 1; teken <= rij; teken++) 
				output += opvulteken;
			output += "\n";
		}
		return output;	
	}
	
	private String tekenPatroonB() {
		String output = "Patroon B\n";
		for(int rij = 1; rij <= 10; rij++) {
			for(int spatie=1; spatie<=rij-1; spatie++)
				output += " ";
			for(int teken=10; teken >= rij; teken--)
				output += opvulteken;
			output += "\n";
		}
		return output;
	}

	private String tekenPatroonC() {
		String output = "Patroon C\n";
		for(int rij = 1; rij <= 10; rij++) {
			for(int teken = 10; teken >= rij; teken--)
				output += opvulteken;
			output += "\n";
		}
		return output;
	}

	private String tekenPatroonD() {
		String output = "Patroon D\n";
		for(int rij = 1; rij <= 10; rij++) {
			for(int spatie=9; spatie>=rij; spatie--)
				output += " ";
			for(int teken=1; teken <= rij; teken++)
				output += opvulteken;
			output += "\n";
		}
		return output;
	}
	
	public String teken() {
		switch (type) {
		case 'A': default: return tekenPatroonA();
		case 'B': return tekenPatroonB();
		case 'C': return tekenPatroonC();
		case 'D': return tekenPatroonD();
		}
		
	}

}
