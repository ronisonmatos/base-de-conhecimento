package colecoes;

import java.util.ArrayList;
import utils.Jedi;

public class ArrayListClass {
    public static void main(String[] args) {
        ArrayList<Jedi> personagens = new ArrayList<Jedi>();
        Jedi jedi = new Jedi("Anakin Skywalker");
        personagens.add(jedi);
        personagens.add(new Jedi("Mestre Yoda"));
        personagens.add(new Jedi("Obi Wan Kenobi"));
        personagens.add(new Jedi("Code Dookan"));
        personagens.add(new Jedi("Qui-Gon Jinn"));
        System.out.println(personagens.get(3));
        System.out.println(personagens.remove(2));
        for (Jedi j : personagens) {
            System.out.println(j);
        }
    }
}

