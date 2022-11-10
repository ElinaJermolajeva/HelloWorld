package lekcijaSesiTest.majasDarbs;

import lekcijaSesi.majasDarbs.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCalculator {
    @Test
    public void testadd() {
        System.out.println("Summa");
        Calculator kalkulators = new Calculator();
        int expectedadd = 5;
        int actualadd = kalkulators.add(2, 3);
        Assert.assertEquals(actualadd, expectedadd);
    }
    @Test
    public void testsubstract() {
        System.out.println("Starpība");
        Calculator starpiba = new Calculator();
        int expectedsubstract = 1;
        int actualsubstract = starpiba.substract(3, 2);
        Assert.assertEquals(actualsubstract, expectedsubstract);
    }
    @Test
    public void testmultiply() {
        System.out.println("Reizinajums");
        Calculator reizinajums = new Calculator();
        int expectedmultiply = 6;
        int actualmultiply = reizinajums.multiply(3,2);
        Assert.assertEquals(actualmultiply, expectedmultiply);
    }
    @Test
    public void testdivide() {
        System.out.println("Dalijums");
        Calculator dalijums = new Calculator();
        float expecteddivide = 2;
        float actualdivide = dalijums.divide(6,3);
        Assert.assertEquals(actualdivide, expecteddivide);
    }
}
