package gvl.javaturingmachine;

import java.util.HashMap;

/**
 * This class represents a TuringMachine state.
 * 
 * @author Gene
 *
 */
public class State {
	
	private HashMap<Symbol, Transition> transitions;
	
	public State() {
		transitions = new HashMap<Symbol, Transition>(0);
	}
	
	public void addTransition(Symbol s, Transition t) {
		transitions.put(s, t);
	}

	public Transition getTransition(Symbol s) {
		return transitions.get(s);
	}
}
