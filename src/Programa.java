import factory.ArvoreFactory;
import model.Arvore;

import java.util.ArrayList;

public class Programa {
    public static void main(String[] args) {

        ArrayList<Arvore> floresta = new ArrayList<>();

        ArvoreFactory factory = new ArvoreFactory();

        for (int i = 0; i < 1000000; i++) {
            if(i % 2 == 0) {
                floresta.add(factory.getArvores("ornamental"));
            } else {
                floresta.add(factory.getArvores("frutifera"));
            }
        }

        System.out.println("A floresta tem " + floresta.size() + " árvores.");
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Memória utilizada: " + (runtime.totalMemory() - runtime.freeMemory()) / (1024 * 1024) + "MB");
    }
}