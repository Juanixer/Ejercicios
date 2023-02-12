import java.util.Scanner;

public class Factorial{
    public static int fact(int n){
        if (n <= 0) {
            return 1;
        }
        else{
            return n * fact(n-1);
        }

    }

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Por favor introduzca un numero entero mayor o igual que 0: ");
            int num = 0;
            num = sc.nextInt();
            System.out.println("El factorial de " + num + " es: " + fact(num));
            }
}


