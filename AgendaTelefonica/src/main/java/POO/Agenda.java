package POO;

import java.text.ParseException;
import java.util.ArrayList;

public class Agenda {

    private ArrayList<Pessoa> contatos = new ArrayList<>();

    public void addPessoa(Pessoa p){
        contatos.add(p);
    }

    public boolean addTelefone(String r, String n, int pIndex) throws ParseException {
        Pessoa aux = contatos.get(pIndex);
        aux.addTelefone(r,n);
        return true;
    }

    public boolean addEmail(String r, String e, int index){
        Pessoa aux = contatos.get(index);
        aux.addEmail(r,e);
        return true;
    }

    public boolean removeTelefone(String r, int index){
        Pessoa aux = contatos.get(index);
        aux.removeTelefone(r);
        return true;
    }

    public boolean removeEmail(String r, int index){
        Pessoa aux = contatos.get(index);
        aux.removeEmail(r);
        return true;

    }

    public boolean updatelefone(String r, String n, int index){
        Pessoa aux = contatos.get(index);
        aux.updateTelefone(r,n);
        return true;
    }

    public boolean updateEmail(String r, String e, int index){
        Pessoa aux = contatos.get(index);
        aux.updateEmail(r,e);
        return true;
    }


    public String listaContatos(int index){

        Pessoa aux = contatos.get(index);
        String n = aux.getNome();
        String sn = aux.getSobrenome();
        String cel = aux.listaCel("celular");
        String res = aux.listaRes("residencial");
        String eCom = aux.listaEmailcomercial("comercial");
        String ePar = aux.listaEmailparticular("particular");

        String Contato = "Nome: " + n + "\nSobrenome " + sn + "\nTel. Celular: " + cel + "\nTel. Residencial: " + res
                + "\nEmail comercial: " + eCom + "\nEmail particular " + ePar;
        return Contato;

    }


}
