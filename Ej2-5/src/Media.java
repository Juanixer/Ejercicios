import java.util.List;

public class Media{
    static List<Integer> numeros = List.of(2, 4, 6, 8, 10);
    public static int sumList(List<Integer> lista, int indice) {
        if (indice == lista.size()) {
            return 0;
        } else {
            return lista.get(indice) + sumList(lista, indice + 1);
        }
    }

    public static void main(String[] args) {
        int sum = sumList(numeros, 0);
        int media = sum/ numeros.size();
        System.out.println("La media aritmética de los números es: " + media);
    }
}
