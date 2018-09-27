package POO;

import java.text.ParseException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws ParseException {

        Agenda agenda = new Agenda();
        Pessoa p1 = new Pessoa("Marcelo", "Bittencourt");

        agenda.addPessoa(p1);
        agenda.addTelefone("celular", "48998620140", 0);
        agenda.addTelefone("residencial", "5832361814",0);
        agenda.addEmail("particular", "marcelo@ifsc", 0);
        agenda.addEmail("comercial", "marcelo@java", 0);
        System.out.println(agenda.listaContatos(0));


    }






















        /* Scanner teclado = new Scanner(System.in);
        /*System.out.println("Informe a dimensão do seu quadrado: ");
        int par = teclado.nextInt();
        System.out.println("\n..::AGENDA::..\n");
        System.out.println("Você deseja adicionar um novo contato?(Sim=1)(Não=0)\n");
        int esc = teclado.nextInt();

        if(esc==1){

            Agenda agenda = new Agenda();

            System.out.println("Selecione a opção desejada: \n[ 1 ] Adicionar contato\n[ 2 ] Adicionar telfones\n" +
                    "[ 3 ] Adicionar E-mails\n[ 4 ] Remover Telefones\n[ 5 ] Remover E-mails");

            int op = teclado.nextInt();
            switch (op){

                case 1:

        }/*


        /*Agenda agenda = new Agenda();

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
        //agenda.removeTelefone("celular",0);
        //agenda.removeEmail("comercial", 0);
        //agenda.updatelefone("residencial", "3337", 0);
        agenda.updateEmail("comercial", "bittencourt@java", 0);

        //Adicionando dados p2
        agenda.addPessoa(p2);
        agenda.addTelefone("celular", "4899999", 1);
        agenda.addTelefone("residencial", "3234", 1);
        agenda.addEmail("comercial", "ana@java", 1);
        agenda.addEmail("particular", "ana@liv", 1);

        //Lendo dados do contato
        System.out.println( agenda.listaContatos(0));*/
}
