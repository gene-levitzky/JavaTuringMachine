package gvl.javaturingmachine;

/**
 * This class simulates the function of an abstract Turing Machine.
 * 
 * @author Gene
 *
 */
public class TuringMachine {
	
	private State currentState = null;
	private Tape tape = null;
	
	/**
	 * Constructor for TuringMachine.
	 * @param startState The state the TuringMachine starts in.
	 * @param tape The tape containing the initial input.
	 */
	public TuringMachine(State startState, Tape tape) {
		currentState = startState;
		this.tape = tape;
	}
	
	/**
	 * Performs a single step in the TuringMachine's computation.
	 */
	public void next() {
		Transition t = currentState.getTransition(tape.read());
		currentState = t.getNewState();
		tape.write(t.getNewSymbol());
		move(t.getNewDirection());
	}
	
	/**
	 * Returns the tape as it currently is.
	 * @return The TuringMachine's tape.
	 */
	public Tape getTape() {
		return tape;
	}
	
	/**
	 * Returns the current state of the TuringMachine.
	 * @return The current state of the TuringMachine.
	 */
	public State getCurrentState() {
		return currentState;
	}
	
	private void move(Direction direction) {
		tape.move(direction);
	}

}
