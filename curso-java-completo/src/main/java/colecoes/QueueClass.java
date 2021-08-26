package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class QueueClass {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Queue<String> filmes = new LinkedList<String>();

        // Offer e add adicionam elementos na fila
        // Diferença é quando comportamento ocorre
        // quando a fila está cheia
        filmes.offer("Episódio 4: Uma Nova Esperança");
        filmes.add("Episódio 5: O Império Contra-Ataca");
        filmes.offer("Episódio 6: O Retorno de Jedi");
        filmes.add("Episódio 1: A Ameaça Fantasma");
        filmes.offer("Episódio 2: O Ataque dos Clones");
        filmes.add("Episódio 3: A Vingança dos Sith");
        filmes.offer("Episódio 7: O Despertar da Força");
        filmes.add("Episódio 8: Os últimos Jedi");
        filmes.offer("Episódio 9: A Ascensão Skywalker");
        filmes.add("Han Solo: Uma História Star Wars");
        filmes.offer("Rogue One: Uma História Star Wars");

        // Peek e Element obtem os elementos da fila (sem remover)
        System.out.println(filmes.peek()); // retorna null
        System.out.println(filmes.peek());
        System.out.println(filmes.element()); // lança uma exeção
        System.out.println(filmes.element());

        // Poll e Elemento obtem os elementos da fila e remove
        System.out.println(filmes.poll()); // retorna null
        System.out.println(filmes.remove()); // lança uma exeção
    }
}
