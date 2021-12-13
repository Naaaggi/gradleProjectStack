package MyApp3.stack;

public class Stack<T> implements IStackable<T> {

    Node head = null;

    private class Node {
        T data;
        Node next;
    }

    @Override
    public void push(T data) {
        Node memorized = head;
        head = new Node();
        head.data = data;
        head.next = memorized;
    }

    @Override
    public T pop() {
        if (head == null) {
            return null;
        }
        T retObj = head.data;
        head = head.next;
        return retObj;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public T peek() {
        return (head == null ) ? null : head.data;
    }


    @Override
    public int size() {
        // Variante-I
        Node temp = head;
        int counter = 0;
        while (temp != null) {
            counter++;
            temp = temp.next;
        }
        return counter;
        // Member-Variable push -> size++, pop -> size--, clear -> size = 0;
    }

    @Override
    public void clear() {
        head = null;
    }

    @Override
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

}

