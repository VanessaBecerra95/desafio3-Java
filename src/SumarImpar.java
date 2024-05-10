import java.util.Scanner;

public class SumarImpar {
    public static void main(String[] args) {
        System.out.println("Indique hasta donde desea sumar los numeros impares: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sumatoria = 0;
        for (int i = 1; i <= n; i +=2) {
            sumatoria += i;
        }
        System.out.printf("La sumatoria de los numeros impares hasta %d es %d%n",n, sumatoria);
    }
}