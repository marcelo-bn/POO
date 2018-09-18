package POO;

public class Aviao {

    private int maxPas;
    private int maxTrip;
    private int peso;
    private int qtMotor;
    private Motor[] motores;


    public Aviao(int mp, int mt, int p, int qtMotores){
        this.maxPas = mp;
        this.maxTrip= mt;
        this.peso = p;
        this.qtMotor = qtMotores;
        /**
         * Instaciando os objetos Motor
         */
        motores = new Motor[qtMotor];
        for (int i = 0; i < qtMotor; i++) {
            motores[i] = new Motor();
        }
    }

    public boolean aumentaVelocidade(int p, int index){
        Motor aux = motores[index];
        int pot = aux.getPotencia();
        if(pot<0||pot>10){
            return false;
        }
        else{
            aux.aumentaPotencia(p);
            return true;
        }
    }

    public boolean diminuiVelocidade(int p, int index){
        Motor aux = motores[index];
        int pot = aux.getPotencia();
        if(pot<0){
            return false;
        }
        else{
            aux.diminuiPotencia(p);
            return true;
        }
    }

    public boolean onOff(int op){
        if(op==1){
            for (int i = 0; i < qtMotor ; i++) {
                Motor aux = motores[i];
                aux.aumentaPotencia(10);
            }
            return true;
        }
        else{
            for (int i = 0; i < qtMotor ; i++) {
                Motor aux = motores[i];
                aux.setPotencia(0);
            }
            return true;
        }

    }

    public boolean movimenta(String dir, int p, int inex){
        return true;
    }

    public String dados(int index){

        Motor aux = motores[index];
        int x = aux.getPotencia();
        return "A potencia atual do motor " + index + " é de: "  + x + "%";

    }








}
