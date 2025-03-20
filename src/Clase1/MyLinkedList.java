package Clase1;

import java.util.Iterator;
                                                    //PARA ITERAR CON UN FOR EACH
public class MyLinkedList<T extends Comparable<T>> implements Iterable<T>{
    private Node<T> first;// retorna informacion NUNCA los nodos completos
    private int size;

    public MyLinkedList(int size, Node<T> first) {
        this.size = size;
        this.first = first;
    }

    public MyLinkedList() {
        this.first = null;
        this.size = 0;
    }
    @Override
    public Iterator<T> iterator() {
        return new MyIterator<T>(this.getNode(0));
    }
    //retorna el nodo
    private Node<T> getNode(int index) {
        if (!isEmpty() && size > index) {
            Node<T> tmp = this.first;
            for (int i = 0; i <= index && tmp != null; i++) {
                if (i == index) {
                    return tmp;
                }
                tmp = tmp.getNext();
            }
        }
        return null;
    }
    //retorna info del nodo
    public T getIndice(int index) {
        if (index < 0 || index >= this.getSize()) {
            System.out.println("Índice fuera de rango");
            return null;
        }
        Node<T> nodo = first;
        for (int i = 0; i < index && nodo != null; i++) {
            nodo = nodo.getNext(); // Avanzamos hasta el índice deseado
        }
        return nodo.getInfo(); // Retornamos el dato/informacion en el nodo correspondiente
    }
    public static <T extends Comparable<T>> MyLinkedList<T> unionList (MyLinkedList<T> list1, MyLinkedList<T> list2){
        Iterator<T> it1 = list1.iterator();
        MyLinkedList<T> tmp = new MyLinkedList<T>();
        while (it1.hasNext()) {
            T v1 = it1.next();
            for (T v2 : list2) {
                if (v1.equals(v2) && !tmp.contains(v1)) {
                    tmp.insertFront(v1);
                }
            }
        }
        return tmp;
    }

    /*public static <T extends Comparable<T>> MyLinkedList<T>
    unionDesordenados(MyLinkedList<T> lista1, MyLinkedList<T> lista2){

        MyIterator<T> actual1 = (MyIterator<T>) lista1.iterator();
        MyIterator<T> actual2 = (MyIterator<T>) lista2.iterator();

        MyLinkedList<T> result = new MyLinkedList<>();
        if (lista1.isEmpty() && lista2.isEmpty()){
            while (actual1.hasNext()){
                T v1 = actual1.next();//me da el actual y pasa al siguiente
                while (actual2.hasNext()){
                    T v2 = actual2.next();
                    if (v1.equals(v2) && !result.contains(v1)){
                        result.insertFront(v1);
                    }
                }
                actual2 = (MyIterator<T>) lista2.iterator();
            }

        }
        return result;

    // unir desordenado sin usar itereator
    public static <T extends Comparable<T>> MyLinkedList<T>
    unionDesordenados(MyLinkedList<T> lista1, MyLinkedList<T> lista2) {
        MyLinkedList<T> result = new MyLinkedList<>();

        if (!lista1.isEmpty() && !lista2.isEmpty()) {
            Node<T> actual1 = lista1.first;  // Apunta al primer nodo de lista1
            while (actual1 != null) {
                Node<T> actual2 = lista2.first;  // Reinicia la segunda lista en cada iteración
                while (actual2 != null) {
                    if (actual1.getInfo().equals(actual2.getInfo()) && !result.contains(actual1.getInfo())) {
                        result.insertFront(actual1.getInfo());
                    }
                    actual2 = actual2.getNext();  // Avanza en la segunda lista
                }
                actual1 = actual1.getNext();  // Avanza en la primera lista
            }
        }
        return result;
    }
    }
    public void ordenar (){
        Node<T> actual = first;
      while (actual != null && actual.getNext() != null){
          int comp = actual.getInfo().compareTo(actual.getNext().getInfo());
          if (comp > 0){
              // Si el actual primero es mayor que el siguiente, intercambia los valores
              T aux = actual.getInfo();
              actual.setInfo(actual.getNext().getInfo());
              actual.getNext().setInfo(aux);
          }
          actual = actual.getNext();
      }

    }
    */

    //EJERCICIO 6 crear lista con elementos solo de una
    public static <T extends Comparable<T>> MyLinkedList<T> diferencia(MyLinkedList<T> lista1,MyLinkedList<T> lista2){
        MyLinkedList<T> result = new MyLinkedList<>();
        Node<T> actual = lista1.first;
        while (actual != null){
            if (!lista2.contains(actual.getInfo())){
                result.insertLast(actual.getInfo());
            }
            actual = actual.getNext();
        }
        return result;
    }

    public boolean contains(T value) {
        return this.indexOf(value) != -1;
    }
    //da el indice que tiene dicho dato
    public int indexOf(T dato){
        Node<T> actual = first;
        int index = 0;
        while (actual != null){
            if (actual.getInfo().equals(dato)){
                return index;
            }
            actual = actual.getNext();
            index++;
        }
        return -1;
    }

    public void remove(T dato) {
        Node<T> actual = first;
        if (first != null) {
            if (first.getInfo().equals(dato)) {
                first = first.getNext();
            }                   // 2->3 =3 si el siguiente de dos es igual a dato corta
            while (actual.getNext() != null && !actual.getNext().getInfo().equals(dato)) {
            actual = actual.getNext();
            }//si el que sigue de 2 no es null osea 3 emtonces le settea el sig del sig
            if (actual.getNext() != null) {
            actual.setNext(actual.getNext().getNext()); // Salteamos el nodo a eliminar
            }
        }
    }

    public T extractFront(){
        if (isEmpty()){
            System.out.println("lista vacia");
        }
        T dato = first.getInfo();
        first = first.getNext();
        size--;
        return dato;
    }
    public boolean isEmpty(){
        return first == null;
    }
    public void insertFront(T dato){
        Node<T> nuevo = new Node<>(dato);
        nuevo.setNext(first);//el nuevo apunta al primero
        first = nuevo;//el primero es el nuevo nodo
        size++;
    }
    public void insertLast(T dato) {
        Node<T> nuevo = new Node<>(dato);
        if (first == null) {
            first = nuevo;
        } else {
            Node<T> actual = first;
            while (actual.getNext() != null) {
                actual = actual.getNext();
            }
            actual.setNext(nuevo);
        }
        size ++;
    }
    @Override
    public String toString() {
        if (isEmpty()) {
            return "Lista vacia";
        }
        System.out.println("-----------Valores en la lista-----------");
        String resultado = "";
        for (int i = 0; i < this.size; i++) {
            resultado += this.getIndice(i) + " | ";
        }
        return resultado;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}



