package POO;

public class Principal {

    public static void main(String[] args) {
        Aviao a1 = new Aviao(3,2,2000,2);
        a1.aumentaVelocidade(10,0);
        System.out.println(a1.dados(0));
        a1.diminuiVelocidade(10,0);
        System.out.println(a1.dados(0));
        System.out.println(a1.dados(1));
        a1.onOff(0);
        System.out.println(a1.dados(0));
        a1.onOff(1);
        System.out.println(a1.dados(0));
        System.out.println(a1.dados(1));

    }




}
