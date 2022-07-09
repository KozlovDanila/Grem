public class Stack<T> {

    private Element<T> first;

    public <T> void push(T value) {
        first = new Element(value, first);
    }

    public T pop() {
        if (first == null) {
            return null;
        }
        T result = first.getValue();
        first = first.getNext();
        return result;
    }

    public T peek() {
        if (first == null) {
            return null;
        }
        return first.getValue();
    }

    public void print(){
        Element current = first;
        while (current != null){
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }
}
