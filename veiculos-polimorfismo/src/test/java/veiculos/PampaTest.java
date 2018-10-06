package veiculos;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PampaTest {

    @Test
    public void ativarDesativarTracao() {

        Pampa p = new Pampa("4x2",0);

        Assert.assertTrue(p.abrirCacamba());
        p.acelerar(10);
        Assert.assertFalse(p.abrirCacamba());
        p.frear(10);
        Assert.assertTrue(p.abrirCacamba());
    }

    @Test
    public void frear() {

        Pampa p = new Pampa("4x4",0);

        Assert.assertFalse(p.frear(10));
        p.acelerar(20);
        Assert.assertFalse(p.frear(-10));
        Assert.assertFalse(p.frear(0));
        Assert.assertTrue(p.frear(10));
        Assert.assertTrue(p.frear(10));
        Assert.assertFalse(p.frear(10));

    }

    @Test
    public void acelerar() {

        Pampa p = new Pampa("Ghia",0);

        Assert.assertTrue(p.acelerar(50));
        Assert.assertTrue(p.acelerar(60));
        Assert.assertFalse(p.acelerar(200));
        Assert.assertFalse(p.acelerar(120));
        Assert.assertFalse(p.acelerar(-10));
        Assert.assertFalse(p.acelerar(0));
    }

    @Test
    public void abrirCacamba() {

        Pampa p = new Pampa("1.0", 0);

        p.acelerar(10);
        Assert.assertFalse(p.abrirCacamba());
        p.acelerar(20);
        Assert.assertFalse(p.abrirCacamba());
        p.frear(30);
        Assert.assertTrue(p.abrirCacamba());

    }
}