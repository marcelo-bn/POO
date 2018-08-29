package POO;

import org.junit.Assert;
import org.junit.Test;

public class TestaTriangulo {

    @Test
    public void testarTriangulo(){

        Triangulo triangulo = new Triangulo();

        Assert.assertEquals("10x1x2 não é um triângulo", "Não é um triângulo", triangulo.tipoDoTriangulo(10,1,2));
        Assert.assertEquals("10x1x2 não é um triângulo", "Não é um triângulo", triangulo.tipoDoTriangulo(1,10,2));
        Assert.assertEquals("10x1x2 não é um triângulo", "Não é um triângulo", triangulo.tipoDoTriangulo(1,1,10));
        Assert.assertEquals( "0x0x0 não é triângulo", "Não é um triângulo", triangulo.tipoDoTriangulo(0, 0, 0) );
        Assert.assertEquals( "0x0x0 não é triângulo", "Não é um triângulo", triangulo.tipoDoTriangulo(0, 3, 4) );
        Assert.assertEquals( "0x0x0 não é triângulo", "Não é um triângulo", triangulo.tipoDoTriangulo(3, 4, 0) );
        Assert.assertEquals( "0x0x0 não é triângulo", "Não é um triângulo", triangulo.tipoDoTriangulo(3, 0, 4) );

        Assert.assertEquals( "5x5x4 é isósceles", "Isósceles", triangulo.tipoDoTriangulo(5, 5, 4) );
        Assert.assertEquals( "5x5x4 é isósceles", "Isósceles", triangulo.tipoDoTriangulo(5, 4, 5) );
        Assert.assertEquals( "5x5x4 é isósceles", "Isósceles", triangulo.tipoDoTriangulo(4, 5, 5) );

        Assert.assertEquals("4x4x4 é equilátero", "Equilátero", triangulo.tipoDoTriangulo(10,10,10));

        Assert.assertEquals("5x4x3 é escaleno", "Escaleno", triangulo.tipoDoTriangulo(5,4,3));
    }







}
