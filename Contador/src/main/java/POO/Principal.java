package POO;

public class Principal {
    public static void main(String[] args) {

        Contador obj1 = new Contador();
        obj1.atribuirValor(-5);
        obj1.incrementarValor();
        System.out.println(obj1.atualValor());
    }
}
