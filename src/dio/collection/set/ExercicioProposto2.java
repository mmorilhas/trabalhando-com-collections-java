package dio.collection.set;

import java.util.*;

/*
Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriacao e IDE.
Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
a) Ordem de inserção;
b) Ordem natural(nome);
c) IDE;
d) Ano de criação e nome;
e) Nome, ano de criação e IDE;
Ao final, exiba as linguagens no console, um abaixo da outra.
*/

public class ExercicioProposto2 {
    public static void main(String[] args) {

        Set<LinguagemFavorita> linguagens = new LinkedHashSet<>(){{
            add(new LinguagemFavorita("JavaSript", 1995, "Visual Studio Code"));
            add(new LinguagemFavorita("CSS", 1994, "Sublime Text"));
            add(new LinguagemFavorita("Java", 1991, "IntelliJ"));
        }};

        System.out.println("---\tOrdem de Inserção\t---");
        for (LinguagemFavorita linguagem : linguagens) {
            System.out.println(linguagem.getNome() + " - " + linguagem.getAnoDeCriacao() + " - " + linguagem.getIde());
        }



        System.out.println("---\tOrdem Natural\t---");
        Set<LinguagemFavorita> linguagens1 = new TreeSet<>(linguagens);
        for (LinguagemFavorita linguagem : linguagens1) {
            System.out.println(linguagem.getNome() + " - " + linguagem.getAnoDeCriacao() + " - " + linguagem.getIde());
        }

        System.out.println("---\tOrdem IDE\t---");
        Set<LinguagemFavorita> linguagens2 = new TreeSet<>(new ComparatorIde());
        linguagens2.addAll(linguagens1);
        for (LinguagemFavorita linguagem : linguagens2) {
            System.out.println(linguagem.getNome() + " - " + linguagem.getAnoDeCriacao() + " - " + linguagem.getIde());
        }

        System.out.println("---\tOrdem Ano de Criação e Nome\t---");
        Set<LinguagemFavorita> linguagens3 = new TreeSet<>(new ComparatorAnoDeCriacaoNome());
        linguagens3.addAll(linguagens1);
        for (LinguagemFavorita linguagem : linguagens3) {
            System.out.println(linguagem.getNome() + " - " + linguagem.getAnoDeCriacao() + " - " + linguagem.getIde());
        }

        System.out.println("---\tOrdem Nome, ano de criação e IDE\t---");
        Set<LinguagemFavorita> linguagens4 = new TreeSet<>(new ComparatorNomeAnoCriacaoIde());
        linguagens4.addAll(linguagens1);
        for (LinguagemFavorita linguagem : linguagens4) {
            System.out.println(linguagem.getNome() + " - " + linguagem.getAnoDeCriacao() + " - " + linguagem.getIde());
        }
    }
}


class ComparatorIde implements Comparator<LinguagemFavorita>{


    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        return l1.getIde().compareTo(l2.getIde());
    }
}

class ComparatorAnoDeCriacaoNome implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int anoCriacao = Integer.compare(l1.getAnoDeCriacao(), l2.getAnoDeCriacao());
        if(anoCriacao != 0) return anoCriacao;
        return l1.getNome().compareTo(l2.getNome());
    }
}

class ComparatorNomeAnoCriacaoIde implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int nome = l1.getNome().compareTo(l2.getNome());
        if(nome != 0) return nome;

        int anoCriacao = Integer.compare(l1.getAnoDeCriacao(), l2.getAnoDeCriacao());
        if(anoCriacao != 0) return anoCriacao;

        return l1.getIde().compareTo(l2.getIde());
    }
}