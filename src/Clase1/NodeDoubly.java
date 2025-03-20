package Clase1;

public class NodeDoubly <T>{
    private NodeDoubly<T> next;
    private NodeDoubly<T> prev;
    private T info;

    public NodeDoubly(T info) {
        this.info = info;
        this.next = null;
        this.prev = null;
    }
    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public NodeDoubly<T> getNext() {
        return next;
    }

    public void setNext(NodeDoubly<T> next) {
        this.next = next;
    }

    public NodeDoubly<T> getPrev() {
        return prev;
    }

    public void setPrev(NodeDoubly<T> prev) {
        this.prev = prev;
    }


}
