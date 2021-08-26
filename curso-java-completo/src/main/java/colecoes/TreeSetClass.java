package colecoes;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetClass {
    public static void main(String[] args) {
        SortedSet<String> alfabeto = new TreeSet<String>();
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
