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
	
	/*
	 * The location in the Tape.
	 */
	private int head = 0;
	
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
		Transition t = currentState.getTransition(tape.read(head));
		currentState = t.getNewState();
		tape.write(head, t.getNewSymbol());
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
	
	/**
	 * Moves the head of the TuringMachine in the specified direction.
	 * @param direction The direction to move in.
	 */
	private void move(Direction direction) {
		switch(direction) {
			case LEFT:
				head--;
				break;
			case RIGHT:
				head++;
				break;
			case STAY:
			default:
				break;
		}
	}

}
