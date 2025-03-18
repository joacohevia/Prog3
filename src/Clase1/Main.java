package Clase1;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> lista = new MyLinkedList<>();

        lista.agregar(1);
        lista.agregar(2);
        lista.agregar(3);
        lista.agregar(4);
        lista.agregar(5);
        lista.insertFront(50);
        //lista.deleteFront();
        //System.out.println(lista.getIndice(2)+" buscado");
        MyLinkedList<Integer> listaNum = new MyLinkedList<>();
        listaNum.agregar(5);
        listaNum.agregar(4);
        listaNum.agregar(3);
        listaNum.agregar(10);
        listaNum.agregar(7);
        listaNum.agregar(8);

        listaNum.ordenar();

        for (int j : listaNum){
            System.out.println(j);
        }
        // el metodo es static emtonces puedo llamar sin crear una instancia
        MyLinkedList<Integer> listaComun = MyLinkedList.unionDesordenados(lista,listaNum);
        for (int i : listaComun){
            System.out.println(i+"u1");
        }

        MyLinkedList<Integer> lista1 = new MyLinkedList<>();
        lista1.insertFront(1);
        lista1.insertFront(5);
        lista1.insertFront(8);
        lista1.insertFront(3);

        MyLinkedList<Integer> lista2 = new MyLinkedList<>();
        lista2.insertFront(5);
        lista2.insertFront(10);
        lista2.insertFront(8);
        lista2.insertFront(9);
        MyLinkedList<Integer> listaDesordenada = MyLinkedList.unionList(lista1,lista2);

        for (int i : listaDesordenada){
            System.out.println(i+"u");
        }

        //System.out.println(lista.indexOf(45)+" busqueda por elemento");

        //System.out.println(lista.isEmpty());

        /*MyLinkedList<String> listaNombres = new MyLinkedList<>();

        listaNombres.agregar("juan");
        listaNombres.agregar("joaquin");
        for (String i : listaNombres){
            System.out.println(i);
        }*/

        /*MyLinkedList<Persona> listaPersonas = new MyLinkedList<>();

        // Crear personas
        Persona persona1 = new Persona("Juan", 30);
        Persona persona2 = new Persona("Ana", 25);

        // Agregar personas a la lista
        listaPersonas.agregar(persona1);
        listaPersonas.agregar(persona2);

        // Iterar y mostrar las personas
        for (Persona p : listaPersonas) {
            System.out.println(p);
        }*/
    }
}
