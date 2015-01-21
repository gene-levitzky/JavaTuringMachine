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
	
	public TuringMachine(State startState, Tape tape) {
		currentState = startState;
		this.tape = tape;
	}
	
	public void next() {
		Transition t = currentState.getTransition(tape.read(head));
		currentState = t.getNewState();
		tape.write(head, t.getNewSymbol());
		move(t.getNewDirection());
	}
	
	public Tape getTape() {
		return tape;
	}
	
	public State getCurrentState() {
		return currentState;
	}
	
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
