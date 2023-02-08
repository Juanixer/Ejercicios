import java.util.*;

public class Suma {

    public static int sum(int n){

        if (n <= 0){
      return 0;
    }
    else{
        return n + sum(n - 1);


    }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor introduzca un numero entero mayor o igual que 0: ");
        int num = 0;
        num = sc.nextInt();
        System.out.println("La suma de los numeros hasta " + num + " es: " + sum(num));
    }
}
