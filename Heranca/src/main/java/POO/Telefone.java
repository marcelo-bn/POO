package POO;

public class Telefone {

    private int codigo;
    private String numSerie, modelo;
    private float peso;
    private Dimensao dim;


    public Telefone(int codigo, String numSerie, String modelo, float peso, Dimensao d) {
        this.codigo = codigo;
        this.numSerie = numSerie;
        this.modelo = modelo;
        this.peso = peso;
        this.dim = d;
    }

    public void ola(){
        System.out.println("Olá, sou o telefone :)");
    }


    @Override
    public String toString() {
        return "Telefone{" +
                "codigo=" + codigo +
                ", numSerie='" + numSerie + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso + "Dimensão=" + dim.toString() +
                '}';
    }

}
