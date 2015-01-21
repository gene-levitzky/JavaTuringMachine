package gvl.javaturingmachine;

/**
 * This class represents an individual Symbol that can be found on a TuringMachine's tape.
 * 
 * @author Gene
 *
 */
public class Symbol {
	
	private String stringRepresentation;
	
	public static final Symbol BLANK = new Symbol(" ");
	
	public Symbol (String stringRepresentation) {
		this.stringRepresentation = stringRepresentation;
	}
	
	public String getStringRepresentation() {
		return stringRepresentation;
	}
	
	public String toString() {
		return this.getStringRepresentation();
	}

}
