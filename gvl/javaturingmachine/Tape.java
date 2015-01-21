package gvl.javaturingmachine;

import java.util.List;

public class Tape {

	private List<Symbol> tape;
	/*
	 * The location in the Tape.
	 */
	private int head = 0;
	
	public Tape(List<Symbol> tape) {
		this.tape = tape;
	}
	
	public Symbol read() {
		return tape.get(head);
	}
	
	public void write(Symbol s) {
		assert head < tape.size();
		tape.set(head, s);
	}
	
	public String toString() {
		StringBuilder out = new StringBuilder();
		for (int i = 0; i < tape.size(); i++) {
			if (i == head) {
				out.append(tape.get(i).getStringRepresentation() + "*, ");
			}
			else {
				out.append(tape.get(i).getStringRepresentation() + ", ");
			}
		}
		return out.toString();
	}
	
	/**
	 * Moves the head of the TuringMachine in the specified direction.
	 * @param direction The direction to move in.
	 */
	public void move(Direction direction) {
		switch(direction) {
			case LEFT:
				head--;
				break;
			case RIGHT:
				head++;
				if (head >= tape.size()) {
					tape.add(Symbol.BLANK);
				}
				break;
			case STAY:
			default:
				break;
		}
	}
}
