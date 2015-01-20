package gvl.javaturingmachine;

import java.util.HashSet;

/**
 * This class represents a set of characters usable by a TuringMachine.
 * 
 * @author Gene
 *
 */
public class Alphabet {
	
	private HashSet<Character> sigma;
	
	public Alphabet(char[] alphabetArray) {
		sigma = new HashSet<Character>(alphabetArray.length);
		for (char c : alphabetArray) {
			sigma.add(c);
		}
	}
	
	public boolean isValid(char c) {
		return sigma.contains(c);
	}

}
