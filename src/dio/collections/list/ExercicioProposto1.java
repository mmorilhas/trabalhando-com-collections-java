package dio.collections.list;

import java.util.*;

/*Faça um programa que receba a temperatura média dos 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média, e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/

public class ExercicioProposto1 {
    public static void main(String[] args) {

        List<Double> temperaturas = new ArrayList<>() {{
            add(22.3);
            add(22.5);
            add(21.6);
            add(20.2);
            add(17.5);
            add(27.6);
        }};


        System.out.println("As temperaturas do primeiro semestre são: " + temperaturas);

        System.out.println("Média semestral: ");
        Iterator<Double> iterator = temperaturas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        Double media = (double) Math.round(soma / temperaturas.size());
        System.out.println(media + "°");

        System.out.println("Temperaturas acima da média e o mês correspondente: ");
        int count = 0;

        for (Double next : temperaturas) {
            if (next > media) {
                switch (count) {
                    case (0):
                        System.out.println("1 - Janeiro: " + next + "º");
                        break;
                    case (1):
                        System.out.println("2 - Fevereiro: " + next + "º");
                        break;
                    case (2):
                        System.out.println("3 - Março: " + next + "º");
                        break;
                    case (3):
                        System.out.println("4 - Abril: " + next + "º");
                        break;
                    case (4):
                        System.out.println("5 - Maio: " + next + "º");
                        break;
                    case (5):
                        System.out.println("6 - Junho: " + next + "º");
                        break;
                    default:
                        System.out.println("Nenhum temperatura acima da média");
                }
            }
            count++;
        }

    }
}