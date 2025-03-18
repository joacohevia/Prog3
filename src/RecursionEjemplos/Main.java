package RecursionEjemplos;

public class Main {
    public static void main(String []args){
        Funcion fn = new Funcion();
        fn.imprimirInverso(5);

        System.out.println(fn.calcularFactorial(3)+" factorial");
        System.out.println(fn.calcular(5,3)+" funcion calcular");
    }
}
