package POO;

public class Robo {

    private int area;
    private int x;
    private int y;
    private char frente;
    private char[] plano = null;

    //Construtor que não recebe parâmetro
    public Robo(){
        area = 10; x = 0; y = 0; frente = 'N';
    }

    //Construtor com todos os parâmetros
    public Robo(int a, int cx, int cy, char f){
        area = a; x = cx; y = cy; frente = f;
    }

    //Armazena os comandos
    public void comandos(String dadosPlano){
        plano = dadosPlano.toCharArray();
    }

    //Verifica e executa os comandos fornecidos
    public void verificaComandos(){

        for(int i = 0; i < plano.length; i++){

            char aux = plano[i];

            if(aux =='M') move();
            if(aux == 'E') rotaciona(aux);
            if(aux == 'D') rotaciona(aux);

        }

    }

    //Faz a movimentação do objeto no plano
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

    //Rotaciona o objeto no seu próprio eixo
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

    //Retorna as informações do objeto
    public String toString() {
        return x + " " + y + " " + frente;
    }
}
