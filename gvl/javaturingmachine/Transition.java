package gvl.javaturingmachine;

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
