

public class Lista{

    public static double sum(double[]numeros , int indice) {
        if (indice == numeros.length - 1) {
            return numeros[indice];
        } else {
            return numeros[indice] + sum(numeros,indice + 1);
        }
    }

    public static void main(String[] args) {
        double [] numeros = {1, 2, 3, 4, 5};
        System.out.println("La suma de los números es: " + sum(numeros, 0));
    }
}
