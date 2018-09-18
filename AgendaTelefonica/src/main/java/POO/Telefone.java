package POO;

import java.util.HashMap;

public class Telefone {

    private HashMap<String,String> dados = new HashMap<>();

    public boolean add(String r, String n){
        if(dados.containsKey(r)){
            return false;
        }
        else{
            dados.put(r,n);
            return true;
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

    public String Listar(String c){

        String aux = dados.get(c);
        return aux;

    }













}
