package Practico2;

public class Recurcion {
    /*  PREGUNTA:
    -Su complejidad en el peor caso es O(N) misma para la lista enlasada
    -PROBLEMAS: Si el arreglo es muy grande, se pueden generar muchas llamadas recursivas,
    lo que puede hacer que la pila de ejecución se llene y cause un error de desbordamiento
    -Ambos casos tienen una complejidad de O(n), pero las listas enlazadas consumen más
    memoria debido a los punteros adicionales y la sobrecarga de objetos Node<T>.
    ES MEJOR HACERLO ITERATIVO para una lista
     */
    public boolean estaOrdenado(int[] numeros, int i){
        if (i == numeros.length-1){
            return true;
        }
        if (numeros[i] > numeros[i+1]){
            return false;
        }
        return estaOrdenado(numeros,i+1);
    }


}
