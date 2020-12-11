package domein;

public class Automaat {

	private int aantalMunten;
	private int aantalItems;
	private boolean muntInGleuf;
	private boolean itemInBak;

	public Automaat(int aantalItems) {
		setAantalItems(aantalItems);
	}

	public int getAantalMunten() {
		return this.aantalMunten;
	}

	public final void setAantalMunten(int value) {
		this.aantalMunten = value;
	}

	public int getAantalItems() {
		return this.aantalItems;
	}

	public final void setAantalItems(int value) {
		this.aantalItems = value;
	}

	public boolean isMuntInGleuf() {
		return this.muntInGleuf;
	}

	public final void setMuntInGleuf(boolean muntInGleuf) {
		this.muntInGleuf = muntInGleuf;
	}

	public boolean isItemInBak() {
		return this.itemInBak;
	}

	public final void setItemInBak(boolean itemInBak) {
		this.itemInBak = itemInBak;
	}

	public void betaal() {
		setMuntInGleuf(true);
	}

	public boolean draaiHendel() {
		if (muntInGleuf && !itemInBak && aantalItems > 0) {
			aantalItems--;
			aantalMunten++;
			muntInGleuf = false;
			itemInBak = true;
			return true;
		}
		neemMuntTerug();
		return false;
	}

	public void neemItem() {
		setItemInBak(false);
	}

	public void neemMuntTerug() {
		setMuntInGleuf(false);
	}
}
