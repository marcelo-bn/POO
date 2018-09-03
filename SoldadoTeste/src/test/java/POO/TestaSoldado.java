package POO;

import org.junit.Assert;
import org.junit.Test;

public class TestaSoldado {

    @Test
    public void testaDistancia(){

        Soldado s = new Soldado();

        Assert.assertEquals("Esta distância é inválida", "Sua distância não foi aceita", s.movimenta(-5));
        Assert.assertEquals("Esta distância é inválida", "Sua distância não foi aceita", s.movimenta(0));

        Assert.assertEquals("Formato de nome incorreto ou opção inválida", "Não aceita, arma adicionada 'Fuzil'", s.verificaArma("fuzil"));
        Assert.assertEquals("Formato de nome incorreto ou opção inválida", "Não aceita, arma adicionada 'Fuzil'", s.verificaArma("baioneta"));
        Assert.assertEquals("Formato de nome incorreto ou opção inválida", "Não aceita, arma adicionada 'Fuzil'", s.verificaArma("punho"));
        Assert.assertEquals("Formato de nome incorreto ou opção inválida", "Não aceita, arma adicionada 'Fuzil'", s.verificaArma("pedra"));

    }







}
