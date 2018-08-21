package POO;

public class Contador {

    private int valorAtual;

    public void atribuirValor(int val){
        if(val < 0){
            val = 0;
        }
        else{
            valorAtual = val;
        }
    }

    public void incrementarValor(){
        valorAtual++;
    }

    public int atualValor(){
        return valorAtual;
    }

}
