package POO;

public class Principal {
    public static void main(String[] args) {


        Soldado s1 = new Soldado();
        Soldado s2 = new Soldado();
        Soldado s3 = new Soldado();
        Soldado s4 = new Soldado();
        Soldado s5 = new Soldado();
        Soldado s6 = new Soldado();
        Soldado s7 = new Soldado();
        Soldado s8 = new Soldado();
        Soldado s9 = new Soldado();
        Soldado s10 = new Soldado();

        s1.movimenta(100);
        //s1.movimenta();
        System.out.println(s1.atacar("Pedra"));
        //System.out.println(s1.atacar());

    }
}