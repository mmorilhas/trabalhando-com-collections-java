package dio.collection.map;

import java.util.*;

/*Dadas as seguintes informações sobre meus livros favoritos e seus autores,
crie um dicionário e ordene este dicionário:
exibindo (Nome Autor - Nome Livro);
Autor = Hawking, Stephen  - Livro = nome: Uma Breve História do Tempo. páginas: 256
Autor = Duhigg, Charles - Livro = nome: O Poder do Hábito, paginas: 408
Autor = Harari, Yuval Noah  - Livro = 21 Lições Para o Século 21, páginas: 432
*/

public class OrdenacaoMap {
    public static void main(String[] args) {

        System.out.println("--\tOrdem aleatória\t--");
        Map<String, Livros> meusLivros = new HashMap<>(){{
            put("Hawking, Stephen", new Livros("Uma Breve História do Tempo", 256));
            put("Duhigg, Charles", new Livros("O Poder do Hábito", 408));
            put("Harari, Yuval Noah", new Livros("21 Lições Para o Século 21", 432));
        }};
        for (Map.Entry<String, Livros> livro : meusLivros.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }


        System.out.println("--\tOrdem de Inserção\t--");
        Map<String, Livros> meusLivros1 = new LinkedHashMap<>(){
            {
                put("Hawking, Stephen", new Livros("Uma Breve História do Tempo", 256));
                put("Duhigg, Charles", new Livros("O Poder do Hábito", 408));
                put("Harari, Yuval Noah", new Livros("21 Lições Para o Século 21", 432));
            }};
        for (Map.Entry<String, Livros> livro : meusLivros1.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }


        System.out.println("--\tOrdem alfabética autores\t--");
        Map<String, Livros> meusLivros2 = new TreeMap<>(meusLivros1);
        for (Map.Entry<String, Livros> livro : meusLivros2.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }


        System.out.println("--\tOrdem alfabética nomes dos livros\t--");
        Set<Map.Entry<String, Livros>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livros> livro : meusLivros3){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }


        System.out.println("--\tOrdem número de página\t--");
        Set<Map.Entry<String, Livros>> meusLivros4 = new TreeSet<>(new ComparatorNumeroPaginas());
        meusLivros4.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livros> livro : meusLivros4){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome() + " - " + livro.getValue().getnPaginas() + " páginas");
        }
    }

}

class ComparatorNome implements Comparator<Map.Entry<String, Livros>> {

    @Override
    public int compare(Map.Entry<String, Livros> l1, Map.Entry<String, Livros> l2) {
        return l1.getValue().getNome().compareTo(l2.getValue().getNome());
    }
}

class ComparatorNumeroPaginas implements Comparator<Map.Entry<String, Livros>> {

    @Override
    public int compare(Map.Entry<String, Livros> l1, Map.Entry<String, Livros> l2) {
        return l1.getValue().getnPaginas().compareTo(l2.getValue().getnPaginas());
    }
}