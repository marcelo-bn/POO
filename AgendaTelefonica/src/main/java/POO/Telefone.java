package POO;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;
import java.util.HashMap;

public class Telefone {

    private HashMap<String,String> dados = new HashMap<>();

    public void add(String r, String n) throws ParseException {
        if(dados.containsKey(r)){
            //return false;
        }
        else{
            if (r.equals("celular")) {
                verificaCelular(n);
                String aux = mascaraCel(n);
                dados.put(r,aux);
            }
            if(r.equals("residencial")) {
                verificaResidencial(n);
                String aux = mascaraRes(n);
                dados.put(r, aux);
            }

        }
    }

    public boolean remover(String r){
        if(dados.containsKey(r)){
            dados.remove(r);
            return true;
        }
        else{
            return false;
        }
    }

    public boolean update(String r, String n){
        if(dados.containsKey(r)){
            return false;
        }
        else{
            dados.put(r,n);
            return true;
        }

    }

    public boolean verificaCelular(String n){

        int aux = n.length();
        char [] veri = n.toCharArray();

        if(aux>11||aux<=0){
            return false;
        }
        if((veri[0]!=4)||veri[1]!=8){
            return false;
        }
        else{
            return true;
        }

    }

    public boolean verificaResidencial(String n){

        int aux = n.length();
        char [] veri = n.toCharArray();

        if(aux>10||aux<=0){
            return false;
        }
        if((veri[0]!=4)||veri[1]!=8){
            return false;
        }
        else{
            return true;
        }

    }

    public String mascaraCel(String n) throws ParseException {
        String telefone = n;
        if(telefone.length()==11){
            MaskFormatter mask = new MaskFormatter("(##) #####-####");
            mask.setValueContainsLiteralCharacters(false);
            mask.setPlaceholderCharacter('_');
            String aux = mask.valueToString(telefone);
            return aux;
        }
        else{
            return "Celular incorreto";
        }

    }

    public String mascaraRes(String n) throws ParseException {
        String telefone = n;
        if(telefone.length()==10) {
            MaskFormatter mask = new MaskFormatter("(##) ####-####");
            mask.setValueContainsLiteralCharacters(false);
            mask.setPlaceholderCharacter('_');
            String aux = mask.valueToString(telefone);
            return aux;
        }
        else{
            return "Telefone incorreto";
        }

    }

    public String Listar(String c){
        String aux = dados.get(c);
        return aux;

    }

}
