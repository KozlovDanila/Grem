public class Queue<T> {

        private Element first;

        public void push(T value) {
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
        }

        public T pop() {
            if (first == null) {
                throw new NullPointerException();
            }
             T result = (T) first.getValue();
            first = first.getNext();
            return result;
        }

    public void print(){
        Element current = first;
        while (current != null){
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }

}
