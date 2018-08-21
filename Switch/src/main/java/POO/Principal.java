package POO;

public class Principal {

    public static void main(String[] args) {

        Switch obj1 = new Switch();


        obj1.habilita(1);
        obj1.portasAparelho(24);
        obj1.selecionaPorta("PC 1",0);
        obj1.selecionaPorta("PC 2",1);

        System.out.println("O aparelho está: " + obj1.estado());
        System.out.println("A quantidade de portas do aparelho é: " + obj1.quantidadePortas());
        System.out.println("A máquina utilizada na porta 1 é: " + obj1.portaMaquina(0));
        System.out.println("A máquina utilizada na porta 2 é: " + obj1.portaMaquina(1));

    }

}
