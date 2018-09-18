package POO;

import java.util.HashMap;

public class Email {

    private HashMap<String,String> dados = new HashMap<>();

    public boolean add(String r, String e){

        if(dados.containsKey(r)){
            return false;
        }
        else{
            dados.put(r,e);
            return true;
        }

    }

    public boolean remover(String e){
        if(dados.containsKey(e)){
            dados.remove(e);
            return true;
        }
        else{
            return false;
        }

    }

    public boolean update(String r, String e){

        dados.put(r,e);
        return true;

    }






















    public String Listar(String c){

        String aux = dados.get(c);
        return aux;

    }





}
