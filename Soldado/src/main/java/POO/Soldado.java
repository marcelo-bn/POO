package POO;

public class Soldado {

    private String arma;
    private int dist;
    private final int DESL = 10;
    private static int numSoldados;

    //Construtor
    public Soldado(){
        numSoldados++;
    }

    //O soldado andará a distância recebida como padrão
    public void movimenta(int dist){
        this.dist = dist;
    }

    //O soldado andará a distância fixa
    public void movimenta(){
        dist = DESL;
    }

    //Soldado irá atacar
    public String atacar(){
        return this.atacar("Fuzil");
    }

    //Soldado irá atacar
    public String atacar(String arma) {

        verificaArma(arma);
        if (numSoldados >= 10) {
            return "O soldado está atacando com a arma " + this.arma + " e se movimentou em "+this.dist+" metros.";
        } else {
            return "Ainda não, esperando o exército ficar maior";
        }

    }

    //Verifica se o soldado possui a arma passada como parâmetro
    public void verificaArma(String arma){
        if(arma.equals("Fuzil")) this.arma = arma;
        else if(arma.equals("Baioneta")) this.arma = arma;
        else if(arma.equals("Punho")) this.arma = arma;
        else{
            this.arma = "Fuzil";
        }

    }

}
