package POO;

import org.junit.Assert;
import org.junit.Test;

public class TestaContador {

    @Test
    public void testeAtribuir(){
        Contador c = new Contador();

        Assert.assertEquals("Valor incorreto", "Seu valor não foi aceito logo, val = 0", c.atribuirValor(-1));
        Assert.assertEquals("Valor incorreto", "Seu valor não foi aceito logo, val = 0", c.atribuirValor(-10));




    }









}
