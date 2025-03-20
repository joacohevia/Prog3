package Clase1;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> lista = new MyLinkedList<>();

        lista.insertLast(1);
        lista.insertLast(2);
        lista.insertLast(3);
        lista.insertLast(4);
        lista.insertLast(5);
        lista.insertLast(45);
        lista.insertFront(50);
        //lista.deleteFront();
        //System.out.println(lista.getIndice(2)+" buscado por pos");
        //System.out.println(lista.getSize());
        //System.out.println(lista.indexOf(45)+" busqueda por elemento");
        //lista.remove(45);//elimina elemento
        //System.out.println(lista.extractFront()+" extraido");
        //lista.remove(3);
        //for(int i : lista){
        //    System.out.println(i);
        //}

        MyLinkedList<Integer> listaNum = new MyLinkedList<>();
        listaNum.insertLast(5);
        listaNum.insertLast(7);
        listaNum.insertLast(2);
        listaNum.insertLast(10);
        listaNum.insertLast(3);
        listaNum.insertLast(8);


        // el metodo es static emtonces puedo llamar sin crear una instancia
        MyLinkedList<Integer> listaComun = MyLinkedList.unionList(lista,listaNum);
        System.out.println(listaComun);

        MyLinkedList<Integer> lista1 = new MyLinkedList<>();
        lista1.insertFront(11);
        lista1.insertFront(21);
        lista1.insertFront(3);
        lista1.insertFront(2);

        MyLinkedList<Integer> lista2 = new MyLinkedList<>();
        lista2.insertFront(7);
        lista2.insertFront(8);
        lista2.insertFront(3);
        lista2.insertFront(2);
        MyLinkedList<Integer> listaOrdenada = MyLinkedList.unionList(lista1,lista2);
        System.out.println(listaOrdenada);

        MyLinkedList<Integer> unionLista = MyLinkedList.diferencia(lista1,lista2);

        for (int j : unionLista){
            System.out.println(j);
        }


        /*MyLinkedList<String> listaNombres = new MyLinkedList<>();
        listaNombres.insertLast("juan");
        listaNombres.insertLast("joaquin");
        for (String i : listaNombres){
            System.out.println(i);
        }*/
        /*MyLinkedList<Persona> listaPersonas = new MyLinkedList<>();
        // Crear personas
        Persona persona1 = new Persona("Juan", 30);
        Persona persona2 = new Persona("Ana", 25);
        // Agregar personas a la lista
        listaPersonas.insertLast(persona1);
        listaPersonas.insertLast(persona2);
        for (Persona p : listaPersonas) {
            System.out.println(p);
        }*/
    }
}
