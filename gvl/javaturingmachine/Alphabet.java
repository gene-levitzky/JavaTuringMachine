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
	
	private HashSet<String> sigma;
	
	public Alphabet(String[] alphabetArray) {
		sigma = new HashSet<String>(alphabetArray.length);
		for (String c : alphabetArray) {
			sigma.add(c);
		}
	}
	
	public boolean isValid(String c) {
		return sigma.contains(c);
	}

}
