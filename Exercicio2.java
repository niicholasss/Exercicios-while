import java.util.Scanner;

public class Exercicio2 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        
        int pares = 0;
        int impares = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = Scanner.nextInt();

            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("O total de pares é: " + pares);
        System.out.println("O total de ímpares é: " + impares);

      Scanner.close();
    }
}