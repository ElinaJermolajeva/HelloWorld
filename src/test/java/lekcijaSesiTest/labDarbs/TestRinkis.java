package lekcijaSesiTest.labDarbs;

import lekcijaCetri.labDarbs.Rinkis;
import org.testng.Assert;
import org.testng.annotations.Test;

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

    private void calculateAreaAndAssert(Double radiuss, Double sagaidamaisLaukums){

    }
}
