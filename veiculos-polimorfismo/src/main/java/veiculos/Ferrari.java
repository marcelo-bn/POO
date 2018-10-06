package veiculos;

/**
 * @author Marcelo Bittencourt do Nascimento Filho
 *
 * Classe implementa métodos de um objeto
 * do tipo Ferrari.
 *
 */

public class Ferrari extends Veiculo implements Conversivel {

    private boolean capotaAberta;
    private boolean farolNeblina;
    private final int VELMAX=320;

    /**
     * Construtor do objeto Ferrari, herdou métodos
     * da classe abstrata Veículos.Tem como parâmetro
     * nome e velocidade inicial.
     * @param n
     * @param v
     */
    public Ferrari(String n, int v) {
        super(n, v);
        capotaAberta = false;
        farolNeblina = false;
    }

    /**
     * Verifica condições de possível abertura da capota.
     *
     * @return true se possível e false se impossível.
     */
    @Override
    public boolean abrirCapota() {
        if (capotaAberta){
            System.out.println("Capota já está aberta da ferrari " + nome);
            return false;
        }
        if(!capotaAberta){
            if(velAtual<20){
                capotaAberta = true;
                System.out.println("Abrindo capota da ferrari "+ nome);
                return true;
            }
           if(velAtual>20){
               System.out.println("Impossível abrir a capota nesta velocidade");
               return false;
           }
        }
        return true;
    }

    /**
     * Verifica condições de possível fechamento da capota.
     *
     * @return true se possível e false se impossível.
     */
    @Override
    public boolean fecharCapota() {
        if (!capotaAberta){
            System.out.println("Capota já está fechada da ferrari " + nome);
            return false;
        }
        if(capotaAberta){
            if(velAtual<20){
                System.out.println("Fechando a capota da ferrari "+ nome);
                capotaAberta = false;
                return true;
            }
            if(velAtual>20){
                System.out.println("Impossível fechar a capota nesta velocidade");
                return false;
            }
        }
        return true;
    }

    /**
     * Verifica possíveis situações de frenagem do carro.
     *
     * @return true se possível e false se impossível.
     */
    @Override
    public boolean frear(int i) {
        if(i<=0){
            System.out.println("Impossível frear nesta intensidade");
            return false;
        }
        if(velAtual==0){
            System.out.println("O veículo está parado!");
            return false;
        }
        if((velAtual - i)<0){
            System.out.println("Impossível frear nesta intensidade");
            return false;
        }
        velAtual = velAtual - i;
        System.out.println("Ferrari "+ nome +" freando com intensidade " + i);
        return true;
    }

    /**
     * Verifica possíveis situações de aceleração do carro.
     *
     * @return true se possível e false se impossível.
     */
    @Override
    public boolean acelerar(int i) {

        if(i<=0){
            System.out.println("Impossível acelerar nesta intensidade");
            return false;
        }
        if(i>VELMAX) {
            velAtual = VELMAX;
            System.out.println("Seu carro está na velocidade máxima, cuidado!");
            return false;
        }
        if((velAtual+i)>VELMAX){
            velAtual = VELMAX;
            System.out.println("Seu carro está na velocidade máxima, cuidado!");
            return false;
        } else{
            velAtual = velAtual + i;
            System.out.println("Ferrari "+ nome+" acelerando com intensidade " + i);
            return true;
        }

    }

    /**
     * Liga o farol de neblina, se possível.
     *
     * @return true se possível e false se impossível
     */
    public boolean ligarFarolNeblina(){
        if (farolNeblina){
            System.out.println("Farol já estava ligado da ferrari " + nome);
            return false;
        }
        System.out.println("Ligando farol de neblina da ferrari " + nome);
        farolNeblina = true;
        return true;
    }

    /**
     * Desliga o farol de neblina, se possível.
     *
     * @return true se possível e false se impossível
     */
    public boolean desligarFarolNeblina(){
        if (!farolNeblina){
            System.out.println("Farol já estava desligado da ferrari " + nome);
            return false;
        }
        System.out.println("Desligando farol de neblina da ferrari " + nome);
        farolNeblina = false;
        return true;
    }

}