package gvl.javaturingmachine;

/**
 * This class represents an atomic transition for the TuringMachine. The transition indicates the symbol to write to 
 * the tape, the new state to enter, and the new direction.
 * 
 * @author Gene
 *
 */
public class Transition {
	
	private Symbol newSymbol;
	private State newState;
	private Direction newDirection;
	
	public Transition(Symbol newSymbol, State newState, Direction newDirection) {
		this.newSymbol = newSymbol;
		this.newState = newState;
		this.newDirection = newDirection;
	}

	public Symbol getNewSymbol() {
		return newSymbol;
	}
	
	public State getNewState() {
		return newState;
	}
	
	public Direction getNewDirection() {
		return newDirection;
	}
}
