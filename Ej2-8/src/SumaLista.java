public class SumaLista {

    public static int sumPares(double[] lista, int indice) {

        if (lista[indice] == 0) {
            if (lista[indice] % 2 == 0) {
                return (int) lista[indice];
            } else {
                return 0;
            }
        }

        if (indice != 0) {
            if (lista[indice] % 2 != 0) {
                return sumPares(lista, indice - 1);
            }
            return (int) (lista[indice] + sumPares(lista, indice - 1));
        }

        return 0;
    }



    public static void main(String[] args) {
        double [] lista = {1, 2, 3, 4, 5, 6};
        System.out.println("La suma de los números pares es: " + sumPares(lista, lista.length - 1));
    }
}
