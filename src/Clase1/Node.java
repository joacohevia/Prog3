package Clase1;
//le indicamos al nodo que la informacion va a ser de tal tipo(T)
public class Node<T> {
    private T info;
    private Node<T> next;// 'next' es un puntero al siguiente nodo del mismo tipo T

    public Node(){
        this.info = null;
        this.next = null;
    }
    public Node(T info) {
        this.setNext(null);
        this.setInfo(info);
    }
    public boolean siguiente(){
        return this.getNext() != null;
    }


    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }
}
