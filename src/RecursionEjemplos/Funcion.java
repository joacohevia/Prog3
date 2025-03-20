package RecursionEjemplos;

public class Funcion {

    public void imprimir(int x){
        if (x>0){
            System.out.println(x);
            imprimir(x-1);
        }
    }

    public void imprimirInverso(int x){
        if (x>0){
            imprimirInverso(x-1);
            System.out.println(x);
        }
    }

    public int calcularFactorial(int n) {
        // Caso base: Si n es 0 o 1, el factorial es 1
        if (n == 0 || n == 1) {//en el ultimo caso devuelve 1
            return 1;
        } else {
            // 3*2->3*1->3*2
            return n * calcularFactorial(n - 1);
        }
    }
    public int calcular(int x, int y){
        if (y<=0){
            return 1;
        }else{
            return x * calcular(x,y-1);
        }
    }
}
