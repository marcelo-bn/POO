package POO;

public class Principal {
    public static void main(String[] args) {

        System.out.println("\n..::AGENDA::..\n");

        Agenda agenda = new Agenda();

        //Criando pessoa
        Pessoa p1 = new Pessoa("Marcelo","Bittencourt");
        Pessoa p2 = new Pessoa("Ana", "Livramento");
        //Adicionando a pessoa
        agenda.addPessoa(p1);
        //Adicionando dados p1
        agenda.addTelefone("celular", "489998620140", 0);
        agenda.addTelefone("residencial", "3236", 0);
        agenda.addEmail("comercial", "marcelo@java", 0);
        agenda.addEmail("particular", "marcelo@filho", 0);
        agenda.removeTelefone("celular",0);
        agenda.removeEmail("comercial", 0);

        //Adicionando dados p2
        /*agenda.addPessoa(p2);
        agenda.addTelefone("celular", "4899999", 1);
        agenda.addTelefone("residencial", "3234", 1);
        agenda.addEmail("comercial", "ana@java", 1);
        agenda.addEmail("particular", "ana@liv", 1);*/

        //Lendo dados do contato
        System.out.println( agenda.listaContatos(0));













    }

}
