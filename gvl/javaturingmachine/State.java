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
	
	public void addTransition(Symbol current, Symbol nextSymbol, State nextState, Direction direction) {
		transitions.put(current, new Transition(nextSymbol, nextState, direction));
	}

	public Transition getTransition(Symbol s) {
		return transitions.get(s);
	}
}
