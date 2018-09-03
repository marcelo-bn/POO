package POO;

/**
 * A classe "Contador" representa um aparelho contador
 * físico
 *
 * @author Marcelo Bittencourt do Nascimento Filho
 *
 */

public class Contador {

    private int valorAtual;

    /**
     * Ao receber uma valor como parâmetro o método verifica se é possível
     * atribuí-lo à variável valorAtual, em caso negativo é retornado
     * uma mensagem de erro
     *
     * @param val
     * @return Seu valor não foi aceito logo, val = 0
     */

    public String atribuirValor(int val){
        if(val < 0){
            val = 0;
            return "Seu valor não foi aceito logo, val = 0";
        }
        else{
            valorAtual = val;
            return "Valor aceito";
        }
    }

    /**
     * Incrementa em um o valor da variável valorAtual
     */
    public void incrementarValor(){
        valorAtual++;
    }

    /**
     * Retorna o valor da variável valorAtual
     * @return valorAtual
     */

    public int atualValor(){
        return valorAtual;
    }

}