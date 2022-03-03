package factory;

import model.Arvore;

import java.util.HashMap;

public class ArvoreFactory {

    private int contador = 0;

    private static final HashMap<String, Arvore> arvores = new HashMap();

    public Arvore getArvores(String tipoArvore) {
        Arvore arvore = arvores.get(tipoArvore);

        if(arvore == null) {
            arvore = new Arvore(tipoArvore);
            arvores.put(tipoArvore, arvore);
            System.out.println("Criada árvore do tipo: " + tipoArvore);
            return arvore;
        }

        System.out.println("Árvore obtida da memória.");
        return arvore;
    }
}
