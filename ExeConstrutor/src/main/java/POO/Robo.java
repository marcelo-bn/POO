package POO;

public class Robo {

    private int area;
    private int x;
    private int y;
    private char frente;
    private char[] plano = null;


    public Robo(int a){
        area = a; x = 0; y = 0; frente = 'N';
    }

    public Robo(int a, int cx, int cy, char f, String dadosPlano){
        area = a; x = cx; y = cy; frente = f; plano = dadosPlano.toCharArray();
    }

    public void verificaComandos(){

        for(int i = 0; i < plano.length; i++){

            char aux = plano[i];

            if(aux =='M') move();
            if(aux == 'E') rotaciona(aux);
            if(aux == 'D') rotaciona(aux);

        }

    }

    public void move(){
        if(frente == 'N') {
            if(y < area) y++;
            else if(y == area) y = y + 0;
        }
        if(frente == 'S'){
            if(y > 0) y--;
            else {
                y = y + 0;
            }
        }
        if(frente == 'L') {
            if(x < area) x++;
            else if(x == area) x = x + 0;
        }
        if(frente == 'O') {
            if(x > 0) x--;
            else{
                x = x + 0;
            }
        }
    }

    public void rotaciona(char sentido){
        if(sentido == 'E'){
            if(frente == 'N') frente = 'O';
            else if(frente == 'O') frente = 'S';
            else if(frente == 'S') frente = 'L';
            else if(frente == 'L') frente = 'N';
        }
        if(sentido == 'D'){
            if(frente == 'N') frente = 'L';
            else if(frente == 'L') frente = 'S';
            else if(frente == 'S') frente = 'O';
            else if(frente == 'O') frente = 'N';
        }
    }

    public String toString() {
        return x + " " + y + " " + frente;
    }






}
