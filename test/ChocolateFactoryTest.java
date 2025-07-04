import org.junit.Assert;
import org.junit.Test;

public class ChocolateFactoryTest {

    @Test(expected = IllegalArgumentException.class)
    public void testChocolateTypeBV1() { // ERROR
        int temperature = 99;
        ChocolateFactory.ChocolateType result = ChocolateFactory.chocolateType(temperature);
    }

    @Test
    public void testChocolateTypeBV2() { // need to beless or equal for 100
        int temperature = 100;
        ChocolateFactory.ChocolateType expectedResult = ChocolateFactory.ChocolateType.WHITE;
        ChocolateFactory.ChocolateType result = ChocolateFactory.chocolateType(temperature);
        Assert.assertEquals(expectedResult,result);
    }

    @Test
    public void testChocolateTypeBV3() {
        int temperature = 101;
        ChocolateFactory.ChocolateType expectedResult = ChocolateFactory.ChocolateType.WHITE;
        ChocolateFactory.ChocolateType result = ChocolateFactory.chocolateType(temperature);
        Assert.assertEquals(expectedResult,result);
    }

    @Test
    public void testChocolateTypeBV4() {
        int temperature = 109;
        ChocolateFactory.ChocolateType expectedResult = ChocolateFactory.ChocolateType.WHITE;
        ChocolateFactory.ChocolateType result = ChocolateFactory.chocolateType(temperature);
        Assert.assertEquals(expectedResult,result);
    }
    @Test
    public void testChocolateTypeBV5() { // ERROR
        int temperature = 110;
        ChocolateFactory.ChocolateType expectedResult = ChocolateFactory.ChocolateType.WHITE;
        ChocolateFactory.ChocolateType result = ChocolateFactory.chocolateType(temperature);
        Assert.assertEquals(expectedResult,result);
    }
    @Test
    public void testChocolateTypeBV6() {
        int temperature = 111;
        ChocolateFactory.ChocolateType expectedResult = ChocolateFactory.ChocolateType.MILK;
        ChocolateFactory.ChocolateType result = ChocolateFactory.chocolateType(temperature);
        Assert.assertEquals(expectedResult,result);
    }
    @Test
    public void testChocolateTypeBV7() {
        int temperature = 124;
        ChocolateFactory.ChocolateType expectedResult = ChocolateFactory.ChocolateType.MILK;
        ChocolateFactory.ChocolateType result = ChocolateFactory.chocolateType(temperature);
        Assert.assertEquals(expectedResult,result);
    }
    @Test
    public void testChocolateTypeBV8() {
        int temperature = 125;
        ChocolateFactory.ChocolateType expectedResult = ChocolateFactory.ChocolateType.DARK;
        ChocolateFactory.ChocolateType result = ChocolateFactory.chocolateType(temperature);
        Assert.assertEquals(expectedResult,result);
    }
    @Test
    public void testChocolateTypeBV9() {
        int temperature = 126;
        ChocolateFactory.ChocolateType expectedResult = ChocolateFactory.ChocolateType.DARK;
        ChocolateFactory.ChocolateType result = ChocolateFactory.chocolateType(temperature);
        Assert.assertEquals(expectedResult,result);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testChocolateTypeEC1() { // ERROR
        int temperature = 90;
        ChocolateFactory.ChocolateType result = ChocolateFactory.chocolateType(temperature);
    }
    @Test
    public void testChocolateTypeEC2() {
        int temperature = 105;
        ChocolateFactory.ChocolateType expectedResult = ChocolateFactory.ChocolateType.WHITE;
        ChocolateFactory.ChocolateType result = ChocolateFactory.chocolateType(temperature);
        Assert.assertEquals(expectedResult,result);
    }
    @Test
    public void testChocolateTypeEC3() {
        int temperature = 115;
        ChocolateFactory.ChocolateType expectedResult = ChocolateFactory.ChocolateType.MILK;
        ChocolateFactory.ChocolateType result = ChocolateFactory.chocolateType(temperature);
        Assert.assertEquals(expectedResult,result);
    }
    @Test
    public void testChocolateTypeEC4() {
        int temperature = 130;
        ChocolateFactory.ChocolateType expectedResult = ChocolateFactory.ChocolateType.DARK;
        ChocolateFactory.ChocolateType result = ChocolateFactory.chocolateType(temperature);
        Assert.assertEquals(expectedResult,result);
    }
    @Test
    public void chocolatePriceTestSC1() {
        ChocolateFactory.Packaging packaging = ChocolateFactory.Packaging.REGULAR;
        ChocolateFactory.ChocolateType type = ChocolateFactory.ChocolateType.MILK;
        boolean hazelnuts = false;
        double expectedResult = 150;

        double result = ChocolateFactory.chocolatePrice(type,packaging,hazelnuts);
        Assert.assertEquals(expectedResult,result,0.01);
    }
    @Test
    public void chocolatePriceTestSC2() {
        ChocolateFactory.Packaging packaging = ChocolateFactory.Packaging.LUX;
        ChocolateFactory.ChocolateType type = ChocolateFactory.ChocolateType.MILK;
        boolean hazelnuts = true;
        double expectedResult = 300;

        double result = ChocolateFactory.chocolatePrice(type,packaging,hazelnuts);
        Assert.assertEquals(expectedResult,result,0.01);
    }
    @Test
    public void chocolatePriceTestSC3() {
        ChocolateFactory.Packaging packaging = ChocolateFactory.Packaging.LUX;
        ChocolateFactory.ChocolateType type = ChocolateFactory.ChocolateType.DARK;
        boolean hazelnuts = false;
        double expectedResult = 450;

        double result = ChocolateFactory.chocolatePrice(type,packaging,hazelnuts);
        Assert.assertEquals(expectedResult,result,0.01);
    }
    @Test
    public void chocolatePriceTestDC4() { // decisions cov 100% and path 100%
        ChocolateFactory.Packaging packaging = ChocolateFactory.Packaging.REGULAR;
        ChocolateFactory.ChocolateType type = ChocolateFactory.ChocolateType.DARK;
        boolean hazelnuts = false;
        double expectedResult = 300;

        double result = ChocolateFactory.chocolatePrice(type,packaging,hazelnuts);
        Assert.assertEquals(expectedResult,result,0.01);
    }
}
