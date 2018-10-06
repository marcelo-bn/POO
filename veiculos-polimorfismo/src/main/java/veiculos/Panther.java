package veiculos;

/**
 * @author Marcelo Bittencourt do Nascimento Filho
 *
 * Classe implementa métodos de um objeto
 * do tipo Panther.
 *
 */

public class Panther extends Veiculo implements VeiculoAnfibio, TracaoIntegral, Conversivel {
    private boolean tracaoIntegral;
    private boolean capotaAberta;
    private boolean rodasRecolhidas;
    private boolean lastro;
    private int temperaturaRefrigerador;
    private final int VELMAX=120;


    /**
     * Construtor do objeto Panther, herdou métodos
     * da classe abstrata Veículos.Tem como parâmetro
     * nome e velocidade inicial.
     * @param n
     * @param v
     */
    public Panther(String n, int v) {
        super(n,v);
        tracaoIntegral = false;
        capotaAberta = false;
        rodasRecolhidas = false;
        lastro = false;
        temperaturaRefrigerador = 15;
    }

    /**
     * Verifica condições de possível abertura da capota.
     *
     * @return true se possível e false se impossível.
     */
    @Override
    public boolean abrirCapota() {
        if(velAtual==0){
            if (capotaAberta){
                System.out.println("Capota já estava aberta do panther "+ nome);
                return false;
            }
            else{
                System.out.println("Abrindo capota do panther "+ nome);
                capotaAberta = true;
            }
        }
        if(velAtual!=0){
            System.out.println("Impossível abrir capota nesta velocidade");
            return false;
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

        if (velAtual == 0) {
            if (!capotaAberta) {
                System.out.println("Capota já estava fechada do panther " + nome);
                return false;
            } else {
                System.out.println("Fechando capota do panther " + nome);
                capotaAberta = false;
            }
        }
        if (velAtual != 0) {
            System.out.println("Impossível abrir fechar nesta velocidade");
            return false;
        }
        return true;
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
            if(!rodasRecolhidas){
                tracaoIntegral = !tracaoIntegral;
                System.out.println("Tração integral do panther " + nome + " está " + tracaoIntegral);
                return true;
            }
            if(rodasRecolhidas){
                System.out.println("Abra suas rodas para ativar/desativar tração");
                return false;
            }
        }
        System.out.println("Impossível ativar Tração nesta velocidade");
        return false;

    }

    /**
     * Verifica se é possível recolher as rodas.
     *
     * @return true se possível e false se impossível.
     */
    @Override
    public boolean recolherRodas() {
        if (rodasRecolhidas){
            System.out.println("Rodas do panther "+ nome+" já estavam recolhidas");
            return false;
        }
        esvaziarLastro();
        rodasRecolhidas = true;
        System.out.println("Recolhendo rodas do panther "+ nome);
        return true;
    }

    /**
     * Verifica se é possível abrir as rodas.
     *
     * @return true se possível e false se impossível.
     */
    @Override
    public boolean abrirRodas() {
        if (!rodasRecolhidas){
            System.out.println("rodas do panther "+ nome+" já estavam abertas");
            return false;
        }
        System.out.println("abrindo rodas do panther "+ nome);
        rodasRecolhidas = false;
        return true;

    }

    /**
     * Esvazia o lastro do carro.
     *
     */
    @Override
    public void esvaziarLastro() {

        if(lastro){
            System.out.println("Esvaziando lastro do panther "+ nome);
            lastro = false;
        }
        System.out.println("Esvaziando lastro do panther "+ nome);
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
        System.out.println("Panther "+ nome +" freando com intensidade " + i);
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
            System.out.println("Panther "+ nome+" acelerando com intensidade " + i);
            return true;
        }
    }

    /**
     * Atualiza temperatura do refrigerador.
     *
     * @param temperaturaRefrigerador
     */
    public void setTempRefri(int temperaturaRefrigerador) {
        if ((temperaturaRefrigerador > 0) && (temperaturaRefrigerador < 20)){
            this.temperaturaRefrigerador = temperaturaRefrigerador;
        }
    }
}