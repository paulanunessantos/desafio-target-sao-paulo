import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import pacote.DiaValor;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Exercicio3 {

    private static List<DiaValor> getValueFromJson() {
        File file = new File("src/main/resources/dados.json");
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(file, new TypeReference<>() {
            });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        List<DiaValor> diasValores = getValueFromJson();
        double menorValor = 0;
        double maiorValor = 0;
        double totalValor = 0;
        int qtdDias = 0;

        for (DiaValor diaValor : diasValores) {
            if (menorValor > diaValor.getValor()) {
                menorValor = diaValor.getValor();
            }
            if (maiorValor < diaValor.getValor()) {
                maiorValor = diaValor.getValor();
            }
            if (diaValor.getValor() > 0) {
                totalValor += diaValor.getValor();
                qtdDias++;
            }
        }

        System.out.println("O menor valor de faturamento ocorrido em um dia do mês: " + menorValor);
        System.out.println("O maior valor de faturamento ocorrido em um dia do mês: " + maiorValor);

        double media = totalValor / qtdDias;
        int diasSuperiorMedia = 0;
        for (DiaValor diaValor : diasValores) {
            if (diaValor.getValor() > media) {
                diasSuperiorMedia++;
            }
        }

        System.out.println("Número de dias no mês em que o valor de faturamento diário foi superior à" +
                " média mensal foram " + diasSuperiorMedia + " dias.");
    }
}
