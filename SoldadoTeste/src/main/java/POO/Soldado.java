package POO;

/**
 * A classe abaixo representa um soldado em um ambiente de guerra
 *
 * @author Marcelo Bittencourt do Nascimento Filho
 *
 */

public class Soldado {

    private String arma;
    private int dist;
    private final int DESL = 10;
    private static int numSoldados;

    /**
     * Este contrutor inicializa um objeto da classe e sempre que isso acontece
     * é incrementado uma unidade na variável numSoldados
     *
     */
    public Soldado(){
        numSoldados++;
    }

    /**
     * O método recebe como parâmetro a distância que o soldado irá andar
     * caso a distância seja inválida é retornada um mensagem de erro
     *
     * @param dist
     * @return Sua distância não foi aceita
     */
    public String movimenta(int dist){

        if(dist <= 0){
            this.dist = DESL;
            return "Sua distância não foi aceita";
        }
        else{
            this.dist = dist;
            return "Distância aceita";
        }

    }

    /**
     * Este método atribui uma distância fixa para o soldado andar
     *
     */
    public void movimenta(){
        dist = DESL;
    }

    //Soldado irá atacar
    public String atacar(){
        return this.atacar("Fuzil");
    }

    /**
     * Ao receber um tipo de arma como parâmetro é verificado se o soldado
     * tem condições de atacar, caso não possa é retornado uma mensagem de erro
     *
     * @param arma
     * @return Ainda não, esperando o exército ficar maior
     */
    public String atacar(String arma) {

        verificaArma(arma);
        if (numSoldados >= 10) {
            return "O soldado está atacando com a arma " + this.arma + " e se movimentou em "+this.dist+" metros.";
        } else {
            return "Ainda não, esperando o exército ficar maior";
        }

    }

    /**
     * Recebendo um tipo de arma como parâmetro o método verifica
     * se a mesma é válida, caso não seja é retornado uma
     * mensagem de erro
     *
     * @param arma
     * @return Não Aceita, arma adiconada 'Fuzil'
     *
     */
    public String verificaArma(String arma){

        if(arma.equals("Fuzil")){
            this.arma = arma;
            return "Aceita";
        }
        else if(arma.equals("Baioneta")) {
            this.arma = arma;
            return "Aceita";
        }
        else if(arma.equals("Punho")){
            this.arma = arma;
            return "Aceita";
        }
        else{
            this.arma = "Fuzil";
            return "Não aceita, arma adicionada 'Fuzil'";
        }

    }

}
