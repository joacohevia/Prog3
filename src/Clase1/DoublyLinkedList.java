package Clase1;
/*
Ejercicio 7
Considerando la implementación de Lista del ejercicio 1, realice una Lista doblemente vinculada.
¿Podemos ahora revisar la implementación inicial de nuestra lista para extender su funcionalidad
y/o bajar la complejidad de los métodos ya implementados?

Se mejoran los metodos de insertar y eliminar al ultimo ya que en esta lista tenemos la
ultima pos. Lo que dificulta en la doble en eliminar ya que debo copiar las referencias
del next y el prev
 */

public class DoublyLinkedList<T> {
    private NodeDoubly<T> first;
    private NodeDoubly<T> last;
    private int size;

    public NodeDoubly<T> getFirst() {
        return first;
    }

    public void setFirst(NodeDoubly<T> first) {
        this.first = first;
    }

    public NodeDoubly<T> getLast() {
        return last;
    }

    public void setLast(NodeDoubly<T> last) {
        this.last = last;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public DoublyLinkedList() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }
    public int getSize(){
        return this.size;
    }
    public void insertFront(T dato) {
        NodeDoubly<T> nuevo = new NodeDoubly<>(dato);
        if (first == null) {
            first = nuevo;         //esta vacio
            last = nuevo;
        } else {
            nuevo.setNext(first);
            first.setPrev(nuevo);
            first = nuevo;
        }
        size++;
    }

    public void insertLast(T dato) {
        NodeDoubly<T> nuevo = new NodeDoubly<>(dato);
        if (isEmpty()) {
            first = nuevo;
            last = nuevo;
        } else {
            last.setNext(nuevo);
            nuevo.setPrev(last);
            last = nuevo;
        }
        size++;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public T extractFront() {
        if (isEmpty()) {
            return null;
        }
        T dato = first.getInfo();
        first = first.getNext();
        if (first != null) {
            first.setPrev(null);
        } else {
            last = null;
        }
        size--;
        return dato;
    }

    public void removeDouble(T dato) {
        NodeDoubly<T> actual = first;
        if (first != null) {
            if (actual.getInfo().equals(dato)) {//si es el primero
                first = first.getNext();
                if (first != null) {// en caso de que solo tenga un elemento
                    first.setPrev(null);
                } else {
                    last = null;
                }
            } else if (last.getInfo().equals(dato)) {//si es el ultimo
                last = last.getPrev();
                last.setNext(null);
            }else {
                while (actual.getNext() != null && !actual.getNext().getInfo().equals(dato)) {
                    actual = actual.getNext();
                }
                actual.setNext(actual.getNext().getNext());
                actual.getNext().setPrev(actual);
            }

        }
        size--;
    }



    public void removeDoubleLast() {
        NodeDoubly<T> actual = first;
        if (first != null && first != last) {
            last = last.getPrev();
            last.setNext(null);
        }else{ // si solo hay un elemento
            first = last = null;
        }
        size--;
    }
}


