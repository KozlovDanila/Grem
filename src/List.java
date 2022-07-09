public class List<T> {

    private Element first;

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
    }

    public void print(){
        Element current = first;
        while (current != null){
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }


}
