import pacote.Faturamento;

import java.util.ArrayList;
import java.util.List;

public class Exercicio4 {

    public static void main(String[] args) {
        List<Faturamento> faturamentos = new ArrayList<>();

        faturamentos.add(new Faturamento("SP", 67836.43));
        faturamentos.add(new Faturamento("RJ", 36678.66));
        faturamentos.add(new Faturamento("MG", 29229.88));
        faturamentos.add(new Faturamento("ES", 27165.48));
        faturamentos.add(new Faturamento("Outros", 19849.53));

        double total = 0;
        double porcentagem = 0;

        for (Faturamento faturamento : faturamentos) {
            total = total + faturamento.getValor();
        }

        for (Faturamento faturamento : faturamentos) {
            System.out.println("Estado: " + faturamento.getEstado());
            porcentagem = faturamento.getValor() * 100 / total;
            System.out.printf("Percentual: %.2f%%\n", porcentagem);
            System.out.println();
        }




    }
}
