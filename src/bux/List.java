package bux;

public class List<T> {

	private Element first;
	private int size = 0;

	public void add(T value) {
		Element newElement = new Element(value);
		if (first == null) {
			first = newElement;
		} else {
			Element next = first;
			while (next.getNext() != null) {
				next = next.getNext();
			}
			next.setNext(newElement);
		}
		size++;
	}

	public T get(int index) {
		int current = 0;
		Element<T> next = first;
		while (current != index && next != null) {
			next = next.getNext();
			current++;
		}
		if (next == null) {
			return null;
		}
		return next.getValue();
	}

	public int getSize() {
		return size;
	}

	public void print() {
		Element current = first;
		while (current != null) {
			System.out.println(current.getValue());
			current = current.getNext();
		}
	}


}
