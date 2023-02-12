import java.util.List;

public class Desviación {

    static List<Integer> numeros = List.of(2, 4, 6, 8);

    public static int sumList(List<Integer> lista, int indice) {
        if (indice == lista.size()) {
            return 0;
        } else {
            return lista.get(indice) + sumList(lista, indice + 1);
        }
    }

    public static void main(String[] args) {
        int sum = sumList(numeros, 0);
        int media = sum / numeros.size();
        double desviacion = Math.sqrt((sum - media)^2/(numeros.size() - 1));
        System.out.println("La desviación típica de los números es: " + desviacion);


    }
}
