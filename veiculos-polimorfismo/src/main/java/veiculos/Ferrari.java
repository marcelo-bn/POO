package veiculos;


public class Ferrari extends Veiculo implements Conversivel {

    private boolean capotaAberta;
    private boolean farolNeblina;

    public Ferrari(String n, int v) {
        super(n, v);
        capotaAberta = false;
        farolNeblina = false;
    }

    @Override
    public boolean abrirCapota() {
        if (capotaAberta){
            System.out.println("capota já estava aberta da ferrari " + nome);
            return false;
        }
        if(velAtual<20){
            capotaAberta = true;
            System.out.println("abrindo capota da ferrari "+ nome);
            return true;
        }
        System.out.println("Impossível abrir a capota nesta velocidade");
        return false;

    }

    @Override
    public boolean fecharCapota() {
        if (capotaAberta){
            System.out.println("fechando capota da ferrari "+ nome);
            capotaAberta = false;
            return true;
        }
        System.out.println("capota da ferrari "+ nome+" já estava fechada");
        return false;
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

    public boolean ligarFarolNeblina(){
        if (farolNeblina){
            System.out.println("Farol já estava ligado da ferrari " + nome);
            return false;
        }
        System.out.println("Ligando farol de neblina da ferrari " + nome);
        farolNeblina = true;
        return true;
    }
}