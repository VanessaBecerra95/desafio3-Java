import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indique cuantos numeros de la sucesion de Fibonacci desea ver: ");
        int cantidad = scanner.nextInt();
        int a = 0, b = 1, sum;
        for (int i = 1; i <= cantidad; i++) {
            System.out.printf("%d \n",a);
            sum = a + b;
            a = b;
            b = sum;
        }
    }
}
