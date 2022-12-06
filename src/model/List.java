package model;

public class List<T> {
    private Node<T> head;
    private Node<T> end;
    private int length;

    public List() {
        this.head = null;
        this.end = null;
    }

    public int length() {
        return length;
    }

    public Node<T> getElement(int index) {
        Node<T> actual = head;
        for(int i = 0; i < index; i++) {
            actual = actual.getNext();
        }
        return actual;
    }

    public T valueOf(int index) {
        if(index >= 0 && index < length) {
            Node<T> target = getElement(index);
            return target.getValue();
        }
        else {
            return null;
        }
    }

    public int indexOf(T target) {
        Node<T> actual = head;
        for(int i = 0; i < length - 1; i++) {
            if(actual.getValue() == target) {
                return i;
            }
            else {
                actual = actual.getNext();
            }
        }
        return -1;
    }

    public void push(T newValue) {
        if(head == null) {
            head = new Node<T>(newValue);
            end = head;
        }
        else {
            end.setNext(new Node<T>(newValue));
            end = end.getNext();
        }
        length++;
    }

    public void unshift(T newValue) {
        if(head == null) {
            head = new Node<T>(newValue);
            end = head;
        }
        else {
            Node<T> temp = head;
            head = new Node<T>(newValue);
            head.setNext(temp);
        }
        length++;
    }

    public void insert(T newValue, int index) {
        if(index >= 0 && index <= length) {
            if(index == 0) {
                unshift(newValue);
            }
            else if(index == length) {
                push(newValue);
            }
            else {
                Node<T> actual = getElement(index);
                Node<T> prev = getElement(index - 1);
                Node<T> newNode = new Node<T>(newValue);
                prev.setNext(newNode);
                newNode.setNext(actual);
                length++;
            }
        }
    }

    public T pop() {
        if(head != null) {
            T value = end.getValue();
            if(head == end) {
                head = null;
                end = null;
            }
            else {
                Node<T> newEnd = getElement(length - 2);
                newEnd.setNext(null);
                end = newEnd;
            }
            System.gc();
            length--;
            return value;
        }
        return null;
    }

    public T shift() {
        if(head != null) {
            T value = head.getValue();
            if(head == end) {
                head = null;
                end = null;
            }
            else {
                Node<T> newHead = head.getNext();
                head.setNext(null);
                head = newHead;
            }
            System.gc();
            length--;
            return value;
        }
        return null;
    }

    public void del(int index) {
        if(index >= 0 && index < length) {
            if(index == 0) {
                shift();
            }
            else if(index == length - 1) {
                pop();
            }
            else {
                Node<T> actual = getElement(index);
                Node<T> prev = getElement(index - 1);
                prev.setNext(actual.getNext());
            }
            System.gc();
            length--;
        }
    }

    public void showList() {
        Node<T> actual = head;
        System.out.print("[");
        for(int i = 0; i < length; i++) {
            System.out.print(actual.getValue());
            if(i < length - 1) {
                System.out.print(", ");
            }
            actual = actual.getNext();
        }
        System.out.print("]\n");
    }

}
