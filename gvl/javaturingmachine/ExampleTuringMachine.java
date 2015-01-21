package gvl.javaturingmachine;

import java.util.ArrayList;
import java.util.List;

public class ExampleTuringMachine {
	
	public static void main(String[] args) {
		
		Symbol begin = new Symbol(">");
		Symbol one   = new Symbol("1");
		Symbol zero  = new Symbol("0");
		
		State start = new State();
		State q     = new State();
		State q0    = new State();
		State q1    = new State();
		
		start.addTransition(zero, zero, start, Direction.RIGHT);
		start.addTransition(one, one, start, Direction.RIGHT);
		start.addTransition(Symbol.BLANK, Symbol.BLANK, q, Direction.LEFT);
		start.addTransition(begin, begin, start, Direction.RIGHT);
		
		q.addTransition(zero, Symbol.BLANK, q0, Direction.LEFT);
		q.addTransition(one, Symbol.BLANK, q1, Direction.LEFT);
		q.addTransition(begin, begin, State.HALT, Direction.STAY);
		
		q1.addTransition(Symbol.BLANK, one, start, Direction.LEFT);
		q0.addTransition(Symbol.BLANK, zero, start, Direction.LEFT);
		
		List<Symbol> symbolList = new ArrayList<Symbol>(4);
		symbolList.add(one);
		symbolList.add(zero);
		symbolList.add(one);
		symbolList.add(zero);
		
		TuringMachine MoveRight = new TuringMachine(start, new Tape(symbolList));
	}

}
