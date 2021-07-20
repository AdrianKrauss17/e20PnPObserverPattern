package dnd;

import java.util.HashSet;
import java.util.Set;

public abstract class Subject<T> {

	private final Set<Observer<T>> observers = new HashSet<>();
	
	public Set<Observer<T>> getObservers() {
		return this.observers;
	}
}
