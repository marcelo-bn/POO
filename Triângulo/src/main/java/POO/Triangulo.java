package POO;

public class Triangulo {


    public String tipoDoTriangulo(int a, int b, int c){



        if((a==0)||(b==0)||(c==0)) {
            return "Não é um triângulo";
        }
        else if(((a + b) < c)||(a+c)<b||(b+c)<a){
            return "Não é um triângulo";
        }
        else if((a==b)&&(b==c)) {
            return "Equilátero";
        }
        else if((a==b)||(a==c)||(b==c)) {
            return "Isósceles";
        }
        else if((a!=b)&&(b!=c)&&(a!=c)){
            return "Escaleno";
        }
        else return "Passou nos testes!";

    }




}
