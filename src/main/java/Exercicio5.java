import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.printf("Insira uma palavra: ");
        String palavra = leitura.nextLine();
        char[] palavraArray = palavra.toCharArray();

        String aux = "";

        for (int i = palavraArray.length - 1; i >= 0; i--) {
            aux = aux + palavraArray[i];
        }
        System.out.printf(aux);
    }
}
