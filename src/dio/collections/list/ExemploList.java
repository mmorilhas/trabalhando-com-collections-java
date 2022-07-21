package dio.collections.list;

import java.util.*;

public class ExemploList {

    public static void main(String[] args) {
        //lista com 7 notas de um aluno {7, 8.5, 9.3, 5, 7, 8, 3.6}

        /*  Maneiras diferentes de escrever
        List notas = new ArrayList<>(); // antes do java 5

        List<Double> notas = new ArrayList<>(); // Diamond operator, não é necessario repetir no ArrayList

        ArrayList<Double> notas = new ArrayList<>(); não é recomendado

        List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 8d, 3.6));

        List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 8d, 3.6);// não é possível adicionar mais elementos dentro dela

        List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 8d, 3.6); //não é possivel nem adicionar, nem remover elementos
        */

        System.out.println("Crie uma lista e adicione as sete notas: ");

        List<Double> notas = new ArrayList<>();
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5d);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);

        System.out.println(notas);


        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8.0);
        System.out.println(notas);

        System.out.println("Substitua a nota 5 pela nota 6.0");
        notas.set(notas.indexOf(5d), 6.0 );
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 esta na lista: " + notas.contains(5d));

        /*
        System.out.println("Exiba todas as notas na ordem que foram informadas: ");
        for (Double nota: notas) System.out.println(nota);
        */

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas);

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        System.out.println("Exiba a soma dos valores: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);

        System.out.println("Exiba a média das notas: " + (soma/notas.size()));

        System.out.println("Remova a nota 0.0: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Remova a nota de posição 0: ");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        //notas.removeIf(next -> next < 7); OU
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas);

        /*
        System.out.println("Apague toda a lista: ");
        notas.clear();
        System.out.println(notas);
        */

        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());


        System.out.println("Crie uma lista chamada notas 2: ");

        List <Double> notas2 = new LinkedList<>(notas);

        System.out.println(notas2);

        System.out.println("Mostre a primeira nota da nova lista sem removê-lo:" + notas2.get(0) );
        System.out.println(notas2);

        System.out.println("Mostre a primeira nota da nova lista removendo-o: " + notas2.remove(0));
        System.out.println(notas2);



    }

}
