package veiculos;

public abstract class Veiculo {
    protected String nome;
    protected int velAtual;

    public Veiculo(String nome, int velAtual) {
        this.nome = nome;
        this.velAtual = velAtual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
