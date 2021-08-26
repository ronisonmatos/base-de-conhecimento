package colecoes;

import lombok.extern.log4j.Log4j;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackCass {
    public static void main(String[] args) {
        Deque<String> OrdemFilmeCinema = new ArrayDeque<String>();
        OrdemFilmeCinema.offer("Rogue One: Uma História Star Wars");
        OrdemFilmeCinema.add("Han Solo: Uma História Star Wars");
        OrdemFilmeCinema.offer("Episódio 9: A Ascensão Skywalker");
        OrdemFilmeCinema.add("Episódio 8: Os Últimos Jedi");
        OrdemFilmeCinema.offer("Episódio 7: O Despertar da Força");
        OrdemFilmeCinema.add("Episódio 3: A Vingança dos Sith");
        OrdemFilmeCinema.offer("Episódio 2: O Ataque dos Clones");
        OrdemFilmeCinema.add("Episódio 1: A Ameaça Fantasma");
        OrdemFilmeCinema.offer("Episódio 6: O Retorno de Jedi");
        OrdemFilmeCinema.push("Episódio 5: O Império Contra-Ataca");
        OrdemFilmeCinema.offer("Episódio 4: Uma Nova Esperança");
        System.out.println(OrdemFilmeCinema);

    }
}
