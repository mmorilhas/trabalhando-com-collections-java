package dio.collection.set;

import java.util.*;

/*
Crie uma conjunto contendo as cores do arco-íris e:
a) Exiba todas as cores o arco-íris uma abaixo da outra;
b) A quantidade de cores que o arco-íris tem;
c) Exiba as cores em ordem alfabética;
d) Exiba as cores na ordem inversa da que foi informada;
e) Exiba todas as cores que começam com a letra ”v”;
f) Remova todas as cores que não começam com a letra “v”;
g) Limpe o conjunto;
h) Confira se o conjunto está vazio;
 */

public class ExercicioProposto1 {
    public static void main(String[] args) {
        Set<String> arcoIris = new HashSet<>(){{
            add("vermelho");
            add("laranja");
            add("amarelo");
            add("verde");
            add("azul");
            add("azul-escuro");
            add("violeta");
        }};

        System.out.println("Exiba todas as cores o arco-íris uma abaixo da outra: ");
        for(String cor : arcoIris){
            System.out.println(cor);
        }

        System.out.println("Exiba as cores em ordem alfabética: ");
        Set<String> arcoIris1 = new TreeSet<>(arcoIris);
        System.out.println(arcoIris1);

        System.out.println("Exiba as cores na ordem inversa da que foi informada ");
        Set<String> arcoIris2 = new LinkedHashSet<>(){{
            add("vermelho");
            add("laranja");
            add("amarelo");
            add("verde");
            add("azul");
            add("azul-escuro");
            add("violeta");
        }};
        System.out.println(arcoIris2);
        List<String> arcoIris2List = new ArrayList<>(arcoIris2);
        Collections.reverse(arcoIris2List);
        System.out.println(arcoIris2List);


        System.out.println("Exiba todas as cores que começam com a letra ”v”: ");
        for (String cor : arcoIris) {
            if(cor.startsWith("v")) System.out.println(cor);
        }


        System.out.println("Remova todas as cores que não começam com a letra “v”: ");
        arcoIris.removeIf(s -> !s.startsWith("v"));
        System.out.println(arcoIris);

        System.out.println("Remova todas as cores que começam com a letra “v”: ");
        Iterator<String> iterator1 = arcoIris1.iterator();
        while(iterator1.hasNext()){
            if(iterator1.next().startsWith("v")) iterator1.remove();
        }
        System.out.println(arcoIris1);


        System.out.println("Limpe o conjunto 0: ");
        arcoIris.clear();
        System.out.println(arcoIris);

        System.out.println("Confira se o conjunto 0 está vazio: " + arcoIris.isEmpty());
        System.out.println("Confira se o conjunto 1 está vazio: " + arcoIris1.isEmpty());


    }
}
