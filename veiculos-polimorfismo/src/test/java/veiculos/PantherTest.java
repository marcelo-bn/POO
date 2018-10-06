package veiculos;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PantherTest {

    @Test
    public void abrirCapota() {

        Panther p = new Panther("1",0);

        Assert.assertTrue(p.abrirCapota());
        p.acelerar(15);
        Assert.assertFalse(p.abrirCapota());
        p.frear(15);
        Assert.assertFalse(p.abrirCapota());
        p.fecharCapota();
        Assert.assertTrue(p.abrirCapota());
        Assert.assertFalse(p.abrirCapota());

    }

    @Test
    public void fecharCapota() {

        Panther p = new Panther("1",0);

        Assert.assertFalse(p.fecharCapota());
        p.abrirCapota();
        Assert.assertTrue(p.fecharCapota());
        p.acelerar(10);
        Assert.assertFalse(p.fecharCapota());
        p.frear(10);
        Assert.assertFalse(p.fecharCapota());
        p.abrirCapota();
        Assert.assertTrue(p.fecharCapota());

    }

    @Test
    public void ativarDesativarTracao() {

        Panther p = new Panther("2",0);

        Assert.assertTrue(p.ativarDesativarTracao());
        Assert.assertTrue(p.ativarDesativarTracao());
        p.acelerar(10);
        Assert.assertFalse(p.ativarDesativarTracao());
        p.frear(10);
        p.recolherRodas();
        Assert.assertFalse(p.ativarDesativarTracao());
        p.abrirRodas();
        Assert.assertTrue(p.ativarDesativarTracao());
        Assert.assertTrue(p.ativarDesativarTracao());

    }

    @Test
    public void recolherRodas() {

        Panther p = new Panther("2",0);

        Assert.assertTrue(p.recolherRodas());
        Assert.assertFalse(p.recolherRodas());

    }

    @Test
    public void abrirRodas() {

        Panther p = new Panther("3",0);

        Assert.assertFalse(p.abrirRodas());
        p.recolherRodas();
        Assert.assertTrue(p.abrirRodas());

    }

    @Test
    public void esvaziarLastro() {
    }

    @Test
    public void frear() {

        Panther p = new Panther("3",0);

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

        Panther p = new Panther("4",0);

        Assert.assertTrue(p.acelerar(50));
        Assert.assertTrue(p.acelerar(60));
        Assert.assertFalse(p.acelerar(200));
        Assert.assertFalse(p.acelerar(120));
        Assert.assertFalse(p.acelerar(-10));
        Assert.assertFalse(p.acelerar(0));

    }

    @Test
    public void setTempRefri() {
    }
}