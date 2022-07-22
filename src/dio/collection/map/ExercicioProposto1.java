package dio.collection.map;

import java.util.*;

/*
Dada a população estimada de alguns estados do nordeste brasileiro, faça:
 Estado = PE - população = 9.616.621
 Estado = AL - população = 3.351.543
 Estado = CE - população  = 9.187.103
 Estado = RN - população = 3.534.265
 */

public class ExercicioProposto1 {
    public static void main(String[] args) {
        Map<String, Integer> populacaoEstadosNordeste = new HashMap<>(){{
           put("PE", 9616621);
           put("AL", 3351543);
           put("CE", 9187103);
           put("RN", 3534265);
        }};

        System.out.println("\nCrie um dicionário que relacione os estados e suas respectivas populações: ");
        System.out.println(populacaoEstadosNordeste);

        System.out.println("\nSubstitua a população do estado RN por : 3.534.165");
        populacaoEstadosNordeste.put("RN", 3534165);
        System.out.println(populacaoEstadosNordeste);

        System.out.println("\nConfira se o estado da Paraíba (PB) está no dicionário, caso não, adicione:  PB - 4.039.277: ");
        System.out.println("Existe no dicionário? " + populacaoEstadosNordeste.containsKey("PB"));
        populacaoEstadosNordeste.put("PB", 4039277);
        System.out.println(populacaoEstadosNordeste);

        System.out.println("\nExiba a população do estado PE: " + populacaoEstadosNordeste.get("PE"));

        System.out.println("\nExiba todos os estados e suas populações na ordem que foi informado: ");
        Map<String, Integer> populacaoEstadosNordeste1 = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(populacaoEstadosNordeste1);


        System.out.println("\nExiba todos os estados e suas populações na ordem alfabética: ");
        Map<String, Integer> populacaoEstadosNordeste2 = new TreeMap<>(populacaoEstadosNordeste1);
        System.out.println(populacaoEstadosNordeste2);

        System.out.println("\nExiba o estado com a menor população e seu respectivo valor: ");
        Integer menorPopulação = Collections.min(populacaoEstadosNordeste.values());
        Set<Map.Entry<String, Integer>> entries = populacaoEstadosNordeste.entrySet();
        String estadoComMenorPopulacao;

        for(Map.Entry<String, Integer> entry : populacaoEstadosNordeste.entrySet()){
            if(entry.getValue().equals(menorPopulação)){
                estadoComMenorPopulacao = entry.getKey();
                System.out.println("\nO estado com menor população é o: " + estadoComMenorPopulacao + " com " + menorPopulação + " habitantes");
            }
        }


        System.out.println("\nExiba o estado com a maior população e seu respectivo valor: ");
        Integer maiorPoupulacao = Collections.max(populacaoEstadosNordeste.values());
        Set<Map.Entry<String, Integer>> entries1 = populacaoEstadosNordeste.entrySet();
        String estadoComMaiorPopulacao;

        for (Map.Entry<String, Integer> entry : entries1) {
            if(entry.getValue().equals(maiorPoupulacao)){
                estadoComMaiorPopulacao = entry.getKey();
                System.out.println("\nO estado com maior população é o: " + estadoComMaiorPopulacao + " com " + maiorPoupulacao + " habitantes");
            }
        }


        System.out.println("\nExiba a soma da população desses estados: ");
        Iterator<Integer> iterator = populacaoEstadosNordeste.values().iterator();
        Integer soma  = 0;
        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println(soma);


        System.out.println("\nExiba a média da população deste dicionário de estados: \n" + (soma/populacaoEstadosNordeste.size()));

        System.out.println("\nRemova os estados com a população menor que 4.000.000: ");
        Iterator <Integer> iterator1 = populacaoEstadosNordeste.values().iterator();
        while (iterator1.hasNext()){
            if(iterator1.next() <= 4000000) iterator1.remove();
        }
        System.out.println(populacaoEstadosNordeste);

        System.out.println("\nApague o dicionario de estados com suas respectivas populações estimadas: ");
        populacaoEstadosNordeste.clear();

        System.out.println("\nConfira se a lista está vazia: " + populacaoEstadosNordeste.isEmpty());

    }
}
