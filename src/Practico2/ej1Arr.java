package Practico2;

import java.util.ArrayList;

public class ej1Arr {
    /*
    Su complejidad en el peor caso es O(N)
    PROBLEMAS: Si el arreglo es muy grande, se pueden generar muchas llamadas recursivas,
    lo que puede hacer que la pila de ejecución se llene y cause un error de desbordamiento
    ES MEJOR HACERLO ITERATIVO

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

    public static void main(String[] args) {
        ej1Arr pp = new ej1Arr();
        int [] num = {1,2,3,4,5,6};

        System.out.println(pp.estaOrdenado(num,0));
    }
}
