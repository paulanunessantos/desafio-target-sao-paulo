import java.util.Scanner;

public class Exercicio2 {

    private static boolean fibonacci(int numero) {
        int atual = 0;
        int anterior = 0;
        int aux = 0;

        while (true) {
            if (aux == 1) {
                atual = 1;
                anterior = 0;
            } else {
                atual += anterior;
                anterior = atual - anterior;
            }

            if (atual >= numero) {
                break;
            }
            aux++;
        }
        return atual == numero;
    }

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Insira um número para verificar se pertence à sequência de Fibonacci:");
        int numero = leitura.nextInt();
        boolean fibonacci = fibonacci(numero);
        if (fibonacci) {
            System.out.println("O número pertece à sequência.");
        } else {
            System.out.println("O número não pertence à sequência.");
        }
    }
}
