import java.util.List;

public class Lista{
    static List<Integer> numeros = List.of(1, 2, 3, 4, 5);
    public static int sumList(List<Integer> lista, int indice) {
        if (indice == lista.size()) {
            return 0;
        } else {
            return lista.get(indice) + sumList(lista, indice + 1);
        }
    }

    public static void main(String[] args) {
        int sum = sumList(numeros, 0);
        System.out.println("La suma de los números es: " + sum);
    }
}
