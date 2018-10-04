package veiculos;

public class Pampa extends Veiculo implements TracaoIntegral {

    private boolean cacambaFechada;
    private boolean tracaoIntegral;
    private final int VELMAX=140;

    public Pampa(String n, int v) {
        super(n, v);
        cacambaFechada = true;
        tracaoIntegral = false;
    }

    @Override
    public boolean ativarDesativarTracao() {
        if(velAtual==0){
            tracaoIntegral = !tracaoIntegral;
            System.out.println("Tração integral da pampa: " + nome + " está : "+ tracaoIntegral);
            return tracaoIntegral;
        }
        else return tracaoIntegral;
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

        if(i>VELMAX){
            velAtual = VELMAX;
            System.out.println("Seu carro está na velocidade máxima, cuidado!");
            return false;
        }

        if((velAtual+i)>VELMAX){
            velAtual = VELMAX;
            System.out.println("Seu carro está na velocidade máxima, cuidado!");
            return false;
        }
        else{
            velAtual = velAtual + i;
            System.out.println("Pampa "+ nome+" acelerando com intensidade " + i);
            return true;
        }

    }

    public boolean abrirCacamba(){
        if (velAtual > 0){
            System.out.println("Pampa "+nome+" em movimento, impossível abrir caçamba");
            cacambaFechada = false;
            return  false;
        }
        System.out.println("Fechando caçamba do Pampa "+ nome);
        return true;
    }

d a 
}