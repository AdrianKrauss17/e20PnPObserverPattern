package dnd;

public interface Observer<T> {

	void onUpdate(T newState);
}
