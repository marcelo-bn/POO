package veiculos;

/**
 * @author Marcelo Bittencourt do Nascimento Filho
 *
 * Classe implementa métodos de um objeto
 * do tipo Pampa.
 *
 */

public class Pampa extends Veiculo implements TracaoIntegral {

    private boolean cacambaFechada;
    private boolean tracaoIntegral;
    private final int VELMAX=140;

    /**
     * Construtor do objeto Pampa, herdou métodos
     * da classe abstrata Veículos.Tem como parâmetro
     * nome e velocidade inicial.
     * @param n
     * @param v
     */
    public Pampa(String n, int v) {
        super(n, v);
        cacambaFechada = true;
        tracaoIntegral = false;
    }

    /**
     * Verifica possíveis condições de ativação
     * ou desativação da tração.
     *
     * @return true se possível e false se impossível.
     */
    @Override
    public boolean ativarDesativarTracao() {
        if(velAtual==0){
            tracaoIntegral = !tracaoIntegral;
            System.out.println("Tração integral da pampa: " + nome + " está : "+ tracaoIntegral);
            return tracaoIntegral;
        }
        else return tracaoIntegral;
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
        System.out.println("Pampa "+ nome +" freando com intensidade " + i);
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
        if(i>VELMAX){
            velAtual = VELMAX;
            System.out.println("Seu carro está na velocidade máxima, cuidado!");
            return false;
        }
        if((velAtual+i)>VELMAX){
            velAtual = VELMAX;
            System.out.println("Seu carro está na velocidade máxima, cuidado!");
            return false;
        }else{
            velAtual = velAtual + i;
            System.out.println("Pampa "+ nome+" acelerando com intensidade " + i);
            return true;
        }

    }

    /**
     * Verifica possíveis situações para abertura da caçamba.
     *
     * @return true se possível e false se impossível.
     */
    public boolean abrirCacamba(){
        if (velAtual > 0){
            System.out.println("Pampa "+nome+" em movimento, impossível abrir caçamba");
            cacambaFechada = false;
            return  false;
        }
        System.out.println("Fechando caçamba do Pampa "+ nome);
        return true;
    }


}