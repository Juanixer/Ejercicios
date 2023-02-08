import java.util.List;

public class Lista{
    static List<Integer> numbers = List.of(1, 2, 3, 4, 5);
    public static int sumList(List<Integer> numbers, int index) {
        if (index == numbers.size()) {
            return 0;
        }
        return numbers.get(index) + sumList(numbers, index + 1);
    }

    public static void main(String[] args) {
        int sum = sumList(numbers, 0);
        System.out.println("La suma de los números es: " + sum);
    }
}
