package gvl.javaturingmachine;

/**
 * This class represents an individual Symbol that can be found on a TuringMachine's tape.
 * 
 * @author Gene
 *
 */
public class Symbol {
	
	private String name;
	private char charRepresentation;
	
	public Symbol (String name, char charRepresentation) {
		this.name = name;
		this.charRepresentation = charRepresentation;
	}
	
	public String getName() {
		return name;
	}
	
	public char getCharRepresentation() {
		return charRepresentation;
	}

}
