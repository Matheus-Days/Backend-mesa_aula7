package model;

public class Arvore {
    private int altura, largura;
    private String cor, tipo;
    private static int contador = 0;

    public Arvore(String tipoArvore) {
        this.tipo = tipoArvore.toUpperCase();

        if(tipoArvore.equalsIgnoreCase("ORNAMENTAL")) {
            altura = 200;
            largura = 400;
            cor = "verde";
        }
        else if(tipoArvore.equalsIgnoreCase("FRUTIFERA")) {
            altura = 500;
            largura = 300;
            cor = "vermelha";
        }
        else if(tipoArvore.equalsIgnoreCase("FLORIFERA")) {
            altura = 100;
            largura = 200;
            cor = "azul";
        }

        contador++;
        System.out.println("Contagem: " + contador);
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Arvore{" +
                "altura=" + altura +
                ", largura=" + largura +
                ", cor='" + cor + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
