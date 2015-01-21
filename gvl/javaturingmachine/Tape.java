package gvl.javaturingmachine;

import java.util.List;

public class Tape {

	private List<Symbol> tape;
	
	public Tape(List<Symbol> tape) {
		this.tape = tape;
	}
	
	public Symbol read(int index) {
		if (index >= tape.size()) {
			tape.add(Symbol.BLANK);
		}
		
		return tape.get(index);
	}
	
	public void write(int index, Symbol s) {
		assert index < tape.size();
		tape.add(index, s);
	}
}
