import java.util.Scanner;

public class SumaImparLimite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el límite inferior de la suma: ");
        int limiteInferior = scanner.nextInt();
        System.out.println("Ingrese el límite superior de la suma: ");
        int limiteSuperior = scanner.nextInt();
        int sumatoria = 0;
        for (int i = limiteInferior; i <= limiteSuperior; i++) {
            if (i % 2 != 0) {
                sumatoria += i;
            }
        }
        System.out.println("La sumatoria de los números impares entre " + limiteInferior + " y " + limiteSuperior + " es " + sumatoria);
    }
}
