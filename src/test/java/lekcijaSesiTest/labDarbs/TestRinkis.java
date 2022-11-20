package lekcijaSesiTest.labDarbs;

import lekcijaCetri.labDarbs.Rinkis;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestRinkis {
   @Test
    public void testrekinatLaukumu(){
       System.out.println("Mans pirmais tests");
       calculateAreaAndAssert(4.5,63.585);
    }

    @Test
    public void testrekinatLaukumuDivi(){
       calculateAreaAndAssert(5.0, 78.5);
        System.out.println("Mans pirmais tests");
    }

    private void calculateAreaAndAssert(double v, double v1) {
    }

    @BeforeMethod
    public void sagatavosana(){
        System.out.println("Šī metode tiek izpildīta pirms katra testa");
    }
    @BeforeTest
    public void pirmsTesta(){
        System.out.println("Sī ir pirms testa anotācija");

    }
    @AfterTest
    public void pecTesta(){
        System.out.println("Sī ir after test anotācija");

    }
    @Test
    public void testrekinatGarumu(){
        System.out.println("Mans otrais tests");
        Rinkis mansRinkis = new Rinkis(5);

        //expectedResult un actualResult
        Double expectedArea = 31.400000000000002;
        Double actualArea = mansRinkis.rekinatLinijasGarumu();
        //assert/assertion - pārbaudes
        Assert.assertEquals(actualArea,expectedArea);
    }

    @AfterMethod
    public void pecDarbibas(){
        System.out.println("šī metode tiek izpildīta pēc katra testa");
    }


    private void calculateAreaAndAssert(Double radiuss, Double sagaidamaisLaukums){
        System.out.println("Tests, kurš testē, kā rēķinās riņķa laukums");
        Rinkis mansRinkis = new Rinkis(radiuss);
        Assert.assertEquals(mansRinkis.rekinatLaukumu(),sagaidamaisLaukums);
        Assert.assertEquals(true, true);
    }
}
