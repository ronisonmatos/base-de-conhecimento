package colecoes;

import java.util.HashSet;
import java.util.Set;

public class HashSetClass {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        /*
         * SortedSet ordena por ordem de inserção
         *
         * devmedia.com.br/diferencas-entre-treeset-hashset-e-linkedhashset-em-java/29077
         *
         * O HashSet é o mais rápido de todos, este usa HashTable e seus elementos não
         * são ordenados, a complexidade desta estrutura é O(1), em outras palavras, não
         * importa o quanto você adicione, remova, retire, o tempo de execução sempre
         * será o mesmo. E isso é extremamente crítico em processos onde temos uma
         * situação crítica com milhões de dados a serem inseridos em um Set. Por outro
         * lado, a garantia de continuidade na ordem dos elementos inseridos é zero, ou
         * seja, esse tipo de estrutura é indicada se você precisa apenas garantir a
         * alta performance sem se importar com a ordem com que os elementos estão
         * ordenados.
         *
         */

        Set<String> alfabeto = new HashSet<String>();
        alfabeto.add("A");
        alfabeto.add("R");
        alfabeto.add("T");
        alfabeto.add("C");
        alfabeto.add("B");
        for (String listar : alfabeto) {
            System.out.println(listar);
        }
    }
}
