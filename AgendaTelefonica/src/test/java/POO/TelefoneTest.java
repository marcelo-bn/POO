package POO;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TelefoneTest {

    @Test
    public void add() {

        Telefone t1 = new Telefone();

        Assert.assertFalse("Rótulo incorreto", t1.add("cel", "48998620140"));
        Assert.assertFalse("Rótulo incorreto", t1.add("cell", "48998620140"));
        Assert.assertFalse("Rótulo incorreto", t1.add("celulat", "48998620140"));
        Assert.assertFalse("Rótulo incorreto", t1.add("residencia", "33333333"));
        Assert.assertFalse("Rótulo incorreto", t1.add("residenciall", "33333333"));
        Assert.assertFalse("Rótulo incorreto", t1.add("resid", "33333333"));
        Assert.assertFalse("Número incorreto", t1.add("celular", "944631355"));
        Assert.assertFalse("Número incorreto", t1.add("celular", "992652"));
        Assert.assertFalse("Número incorreto", t1.add("celular", "6259852"));

    }

    @Test
    public void remover() {

        Telefone t2 = new Telefone();

        Assert.assertFalse("Rótulo incorreto", t2.add("cel", "48998620140"));
        Assert.assertFalse("Rótulo incorreto", t2.add("cell", "48998620140"));
        Assert.assertFalse("Rótulo incorreto", t2.add("celulat", "48998620140"));
        Assert.assertFalse("Rótulo incorreto", t2.add("residencia", "33333333"));
        Assert.assertFalse("Rótulo incorreto", t2.add("residenciall", "33333333"));
        Assert.assertFalse("Rótulo incorreto", t2.add("resid", "33333333"));

    }

    @Test
    public void update() {
    }


    @Test
    public void verificaCelular(){

        Telefone t3 = new Telefone();

        Assert.assertFalse("Formato incorreto", t3.verificaCelular("8998620140"));
        Assert.assertFalse("Formato incorreto", t3.verificaCelular("998620140"));
        Assert.assertFalse("Formato incorreto", t3.verificaCelular("08998620140"));
        Assert.assertFalse("Formato incorreto", t3.verificaCelular("998620140"));
        Assert.assertFalse("Quantidade de números acima do normal", t3.verificaCelular("89998620140"));

    }




}