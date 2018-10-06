package poo;

import veiculos.*;

public class Principal {

    public static void main(String[] args) {
        System.out.println("Alguns testes para entender...\n");

        VeiculoTerrestre a = new Ferrari("Testarossa",0);
        VeiculoTerrestre b = new Panther("Panther2",0);
        VeiculoTerrestre c = new Pampa("Pampa Guia", 0);
        VeiculoMarinho   d = new Panther("Panther python",0);
        VeiculoAnfibio e = new Panther("Panther watercar",0);
        Veiculo f = new Ferrari("F430",0);
        Veiculo g = new Panther("Panther Fusc",0);
        Veiculo h = new Pampa("LS",0);


        a.acelerar(10);
        b.acelerar(10);
        c.acelerar(10);
        c.frear(10);
        c.acelerar(20);
        System.out.println(((Pampa) c).ativarDesativarTracao());
        System.out.println(((Pampa) c).ativarDesativarTracao());
        e.acelerar(10);

        ((Ferrari) a).abrirCapota();

        d.esvaziarLastro();
        e.esvaziarLastro();

        ((Ferrari) f).acelerar(1);

        Ferrari i = (Ferrari) f;
        i.abrirCapota();
        i.acelerar(10);

        ((Ferrari) f).ligarFarolNeblina();


    }

}
