package dio.collection.map;

import java.util.*;

/*
Faça um programa que simule um lançamento de dados. Lance o dado 100 vezes e armazene.
Depois, mostre quantas vezes cada valor foi conseguido.
 */

public class ExercicioProposto2 {
    public static void main(String[] args) {
        int lancamentos = 100;
        List<Integer>valores = new ArrayList<>();
        Random lançador = new Random();
        for(int i = 0; i < lancamentos; i++){
            int numero = lançador.nextInt(6) + 1;
            valores.add(numero);
        }

        Map<Integer, Integer> lancamentosFeitos = new HashMap<>();
        for (Integer valor : valores){
            if(lancamentosFeitos.containsKey(valor)){
                lancamentosFeitos.put(valor, (lancamentosFeitos.get(valor) + 1));
            }else lancamentosFeitos.put(valor, 1);
        }

        System.out.println("Valor" + " Quantidade de vezes");

        for(Map.Entry<Integer, Integer> entry : lancamentosFeitos.entrySet()){
            System.out.printf( "%3d %10d\n", entry.getKey(), entry.getValue());
        }
    }
}
