package POO;

public class Principal {
    public static void main(String[] args) {

        Robo r1 = new Robo(8, 1, 2, 'N');

        r1.comandos("EMEMEMEMM");
        r1.verificaComandos();
        System.out.println(r1.toString());

        /*Tempo obj1 = new Tempo(20,20,20);
        System.out.println(obj1.toString());
        System.out.println("Tempo total em segundos: " + obj1.transformaLong());

        obj1.alteraHora(21);
        obj1.alteraMinuto(21);
        obj1.alteraSegundo(21);
        System.out.println(obj1.toString());
        System.out.println("Tempo total em segundos: " + obj1.transformaLong());*/

    }

}
