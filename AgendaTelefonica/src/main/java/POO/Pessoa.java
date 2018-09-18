package POO;

public class Pessoa {

    private String nome;
    private String sobrenome;
    private Telefone telefones;
    private Email emails;


    public Pessoa(String n, String sn){
        this.nome = n;
        this.sobrenome = sn;
        this.telefones = new Telefone();
        this.emails = new Email();

    }

    public boolean addTelefone(String r, String n){
        this.telefones.add(r,n);
        return true;
    }

    public boolean addEmail(String r, String e){
        this.emails.add(r,e);
        return true;
    }

    public boolean removeTelefone(String r){
        this.telefones.remover(r);
        return true;
    }

    public boolean removeEmail(String r){
        this.emails.remover(r);
        return true;
    }

    public boolean updateTel(String r){


    }





















    public boolean updateTelefone(String r, String n){
        return true;
    }

    public boolean updateEmail(String r, String e){
        return true;
    }

    public String listaCel(String chave){
        return telefones.Listar(chave);
    }

    public String listaRes(String chave){
        return telefones.Listar(chave);
    }

    public String listaEmailcomercial(String chave){
        return emails.Listar(chave);
    }

    public String listaEmailparticular(String chave){
        return emails.Listar(chave);
    }



    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }
}
