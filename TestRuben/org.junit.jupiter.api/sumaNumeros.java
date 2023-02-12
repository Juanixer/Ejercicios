public class sumaNumeros {
    static int[] numeros = {2, 4, 6, 8, 10};
    public static int sumArray(int[] array, int indice) {
        if (indice == array.length) {
            return 0;
        } else {
            return array[indice] + sumArray(array, indice + 1);
        }
    }

    public static void main(String[] args) {
        int sum = sumArray(numeros, 0);
        int media = sum/ numeros.length;
        System.out.println("La media aritmética de los números es: " + media);
    }
}
