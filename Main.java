import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Diga um número:");
        int numero = scanner.nextInt();

        int a = 0, b = 1, proximo = 0;

        if (numero == 0 || numero == 1) {
            System.out.println("O número " + numero + " é um número de Fibonacci.");
        } else {
            while (proximo < numero) {
                proximo = a + b;
                a = b;
                b = proximo;
            }

            if (proximo == numero) {
                System.out.println("O número " + numero + " é um número de Fibonacci.");
            } else {
                System.out.println("O número " + numero + " não é um número de Fibonacci.");
            }

        }
    }
}