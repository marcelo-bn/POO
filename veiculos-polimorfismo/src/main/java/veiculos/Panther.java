package veiculos;

public class Panther extends Veiculo implements VeiculoAnfibio, TracaoIntegral, Conversivel {
    private boolean tracaoIntegral;
    private boolean capotaAberta;
    private boolean rodasRecolhidas;
    private int temperaturaRefrigerador;

    public Panther(String n, int v) {
        super(n,v);
        tracaoIntegral = false;
        capotaAberta = false;
        rodasRecolhidas = false;
        temperaturaRefrigerador = 15;
    }

    @Override
    public boolean abrirCapota() {
        if (capotaAberta){
            System.out.println("capota já estava aberta do panther "+ nome);
            return false;
        }
        capotaAberta = true;
        System.out.println("abrindo capota do panther "+ nome);
        return true;
    }

    @Override
    public boolean fecharCapota() {
        if (capotaAberta){
            System.out.println("fechando capota do panther "+ nome);
            capotaAberta = false;
            return true;
        }
        System.out.println("capota do panther "+ nome+ " já estava fechada");
        return false;
    }

    @Override
    public boolean ativarDesativarTracao() {
        if(velAtual==0){
            tracaoIntegral = !tracaoIntegral;
            System.out.println("Tração integral do panther: " + nome +" está " + tracaoIntegral);
            return tracaoIntegral;
        }
        else return tracaoIntegral;

    }

    @Override
    public boolean recolherRodas() {
        esvaziarLastro();
        if (rodasRecolhidas){
            System.out.println("rodas do panther "+ nome+" já estavam recolhidas");
            return false;
        }
        rodasRecolhidas = true;
        System.out.println("recolhendo rodas do panther "+ nome);
        return true;
    }

    @Override
    public boolean abrirRodas() {
        esvaziarLastro();
        if (rodasRecolhidas){
            System.out.println("abrindo rodas do panther "+ nome);
            rodasRecolhidas = false;
            return true;
        }
        System.out.println("rodas do panther "+ nome+" já estavam abertas");
        return false;
    }

    @Override
    public void esvaziarLastro() {
        System.out.println("Esvaziando lastro do panther "+ nome);
    }

    @Override
    public boolean frear(int i) {
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

    @Override
    public boolean acelerar(int i) {
        velAtual = velAtual + i;
        System.out.println("Pampa "+ nome+" acelerando com intensidade " + i);
        return true;
    }

    public void setTempRefri(int temperaturaRefrigerador) {
        if ((temperaturaRefrigerador > 0) && (temperaturaRefrigerador < 20)){
            this.temperaturaRefrigerador = temperaturaRefrigerador;
        }
    }
}