package veiculos;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FerrariTest {

    @Test
    public void abrirCapota() {

        Ferrari f = new Ferrari("F430",0);
        Assert.assertTrue(f.abrirCapota());
        f.acelerar(15);
        Assert.assertFalse(f.abrirCapota());
        f.fecharCapota();
        Assert.assertTrue(f.abrirCapota());
        f.fecharCapota();
        f.acelerar(35);
        Assert.assertFalse(f.abrirCapota());
        f.frear(40);
        Assert.assertTrue(f.abrirCapota());
        Assert.assertFalse(f.abrirCapota());

    }

    @Test
    public void fecharCapota() {

        Ferrari f = new Ferrari("LaFerrari",0);

        Assert.assertFalse(f.fecharCapota());
        f.abrirCapota();
        f.acelerar(15);
        Assert.assertTrue(f.fecharCapota());
        f.abrirCapota();
        f.acelerar(15);
        Assert.assertFalse(f.fecharCapota());
        f.frear(20);
        Assert.assertTrue(f.fecharCapota());
        Assert.assertFalse(f.fecharCapota());

    }

    @Test
    public void frear() {

        Ferrari f = new Ferrari("812 Superfast",0);

        Assert.assertFalse(f.frear(10));
        f.acelerar(20);
        Assert.assertFalse(f.frear(-10));
        Assert.assertFalse(f.frear(0));
        Assert.assertTrue(f.frear(10));
        Assert.assertTrue(f.frear(10));
        Assert.assertFalse(f.frear(10));
    }

    @Test
    public void acelerar() {

        Ferrari f = new Ferrari("488 GTB", 0);

        Assert.assertTrue(f.acelerar(50));
        Assert.assertTrue(f.acelerar(60));
        Assert.assertTrue(f.acelerar(200));
        Assert.assertFalse(f.acelerar(120));
        Assert.assertFalse(f.acelerar(-10));
        Assert.assertFalse(f.acelerar(0));
    }

    @Test
    public void ligarFarolNeblina() {

        Ferrari f = new Ferrari("F12",0);

        Assert.assertTrue(f.ligarFarolNeblina());
        Assert.assertFalse(f.ligarFarolNeblina());

    }

    @Test
    public void desligarFarolNeblina(){

        Ferrari f = new Ferrari("458 Itália", 0);

        Assert.assertFalse(f.desligarFarolNeblina());
        f.ligarFarolNeblina();
        Assert.assertTrue(f.desligarFarolNeblina());
    }

}