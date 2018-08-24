package POO;

public class Tempo {

    private int hora;
    private int minuto;
    private int segundo;

    //Construtor padrão
    public Tempo(){
        hora = 0; minuto = 0; segundo = 0;
    }

    //Construção com 1 parâmetro
    public Tempo(int h){
        alteraHora(h);
    }

    //Construção com 2 parâmetro
    public Tempo(int h, int m){
        alteraHora(h);
        alteraMinuto(m);
    }

    //Construção com 3 parâmetro
    public Tempo(int h, int m, int s){
        alteraHora(h);
        alteraMinuto(m);
        alteraSegundo(s);
    }

    //Transforma os atributos em string
    public String toString() {
        return hora + ":" + minuto + ":" + segundo;
    }

    //Altera a hora para um valor válido
    public boolean alteraHora(int h){
        if(h>0 && h<24){
            hora = h;
            return true;
        }
        else{
            return false;
        }

    }

    //Altera o minuto para um valor válido
    public boolean alteraMinuto(int m){
        if(m>0 && m<60){
            minuto = m;
            return true;
        }
        else{
            return false;
        }
    }

    //Altera 0 segundo para um valor válido
    public boolean alteraSegundo(int s){
        if(s>0 && s<60){
            segundo = s;
            return true;
        }
        else{
            return false;
        }
    }

    public long transformaLong(){

        long auxHora = hora * 3600;
        long auxMinuto = minuto * 60;

        long total = auxHora + auxMinuto + segundo;
        return total;
    }

}
