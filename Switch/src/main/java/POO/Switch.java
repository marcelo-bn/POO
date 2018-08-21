package POO;

public class Switch {

    private String power = "desligado";
    private int numPortas;
    private String [] maquinas = new String[100];


    //Altera o estado do aparelho
    public void habilita(int x){
        if(x==1) power = "ligado";
    }

    //Retorna o estado do aparelho
    public String estado(){
        return power;
    }

    //Recebe a quantidade de portas do aparelho usado pelo usuário
    public void portasAparelho(int qtd){
        numPortas = qtd;
    }

    //Retorna a quantidade de portas do aparelho usado pelo usuário
    public int quantidadePortas(){
        return numPortas;
    }

    //Faz a conexão da porta do aparelho com a máquina utilizada;
    public void selecionaPorta(String nomePc, int local){
        maquinas[local] = nomePc;
    }

    //Retorna a máquina utilizada na porta requerida
    public String portaMaquina(int nPorta){
        String aux = maquinas[nPorta];
        return aux;
    }

}
