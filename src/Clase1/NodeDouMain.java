package Clase1;

public class NodeDouMain {
    public static void main(String []args){
        DoublyLinkedList<Integer> listaDoble1 = new DoublyLinkedList<>();
        listaDoble1.insertFront(1);
        listaDoble1.insertFront(2);
        listaDoble1.insertFront(3);
        listaDoble1.insertFront(4);
        listaDoble1.insertFront(5);
        System.out.println(listaDoble1.toString());
        //listaDoble1.insertLast(10);
        //System.out.println(listaDoble1.extractFront()+" eliminado");
        //listaDoble1.removeDoubleLast();
        //listaDoble1.removeDouble(2);


        NodeDoubly<Integer> actual = listaDoble1.getFirst();
        while (actual!=null){
            System.out.println(actual.getInfo());
            actual = actual.getNext();
        }
    }
}
