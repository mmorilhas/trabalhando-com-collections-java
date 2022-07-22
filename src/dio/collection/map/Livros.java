package dio.collection.map;

import java.util.Objects;

public class Livros {
    private String nome;
    private Integer nPaginas;

    public Livros(String nome, Integer nPaginas) {
        this.nome = nome;
        this.nPaginas = nPaginas;
    }

    public String getNome() {
        return nome;
    }

    public Integer getnPaginas() {
        return nPaginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livros livros = (Livros) o;
        return nome.equals(livros.nome) && nPaginas.equals(livros.nPaginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, nPaginas);
    }

    @Override
    public String toString() {
        return "Livros{" +
                "nome='" + nome + '\'' +
                ", nPaginas=" + nPaginas +
                '}';
    }
}

