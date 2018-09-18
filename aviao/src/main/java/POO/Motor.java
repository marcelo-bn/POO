package POO;

public class Motor {

    //private String tipo;
    private int potencia = 0;

    public boolean aumentaPotencia(int p){
        this.potencia = this.potencia + p;
        return true;
    }

    public boolean diminuiPotencia(int p){
        this.potencia = this.potencia - p;
        return true;
    }

    public boolean onOff(boolean op){
        return true;
    }

    public boolean movimenta(String dir, int p){
        return true;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
}
