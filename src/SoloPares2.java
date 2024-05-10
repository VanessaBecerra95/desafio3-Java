import java.util.Scanner;

public class SoloPares2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indique cuántos números pares desea mostrar: ");
        int cantidad = scanner.nextInt();
        for (int i = 1; i <= cantidad; i++) {
            System.out.printf("%d \n", i * 2);
        }
    }
}
