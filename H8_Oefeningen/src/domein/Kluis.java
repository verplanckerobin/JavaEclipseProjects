package domein;

public class Kluis {
	
	private String code;

	public Kluis(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	public final void setCode(String code) {
		this.code = code;
	}
	
	private void controleerCode(String code) {
		throw new UnsupportedOperationException();
	}
	
	public boolean valideerCode(String code) {
		throw new UnsupportedOperationException();
	}

}
