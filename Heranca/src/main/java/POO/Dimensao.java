package POO;

public class Dimensao {

    private int altura;
    private int largura;
    private int comprimento;

    public Dimensao(int altura, int largura, int comprimento) {
        this.altura = altura;
        this.largura = largura;
        this.comprimento = comprimento;
    }

    @Override
    public String toString() {
        return "Dimensao{" +
                "altura=" + altura +
                ", largura=" + largura +
                ", comprimento=" + comprimento +
                '}';
    }
}
