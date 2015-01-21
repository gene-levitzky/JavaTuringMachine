package gvl.javaturingmachine;

import java.util.HashSet;

/**
 * This class represents a set of characters usable by a TuringMachine.
 * 
 * The blank symbol, represented by a " ", is automatically added to every alphabet.
 * The blank symbol serves as the default symbol that appears on the tape, and will appear infinitely to the left and
 * to the right of the input on the tape.
 * @author Gene
 *
 */
public class Alphabet {
	
	private HashSet<Symbol> sigma;
	
	public Alphabet(Symbol[] symbolArray) {
		sigma = new HashSet<Symbol>(symbolArray.length);
		for (Symbol c : symbolArray) {
			sigma.add(c);
		}
		sigma.add(new Symbol(" "));
	}
	
	public boolean isValid(Symbol c) {
		return sigma.contains(c);
	}
	
	public Symbol[] getSymbolsArray() {
		Symbol[] out = new Symbol[sigma.size()];
		return sigma.toArray(out);
	}

}
