package Clase1;

import java.util.Iterator;

//siempre <T>igual a la lista o nodo
                        // ACA ES ITERATOR!!!
public class MyIterator<T> implements Iterator<T> {
    private Node<T> cursor;

    public MyIterator(Node<T> cursor) {
        this.cursor = cursor;
    }

    @Override
    public boolean hasNext() {
        return cursor != null;
    }


    @Override
    public T next() {
        if (this.hasNext()){
        T info = this.cursor.getInfo();
        this.cursor = this.cursor.getNext();
        return info;

        }
    return null;
    }
}
