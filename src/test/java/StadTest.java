import org.junit.Assert;
import org.junit.Test;
import services.BewonerController;

public class StadTest {
    @Test
    public void testGeefAantalWerklozenPerUtrecht() {
        BewonerController test1 = new BewonerController();
        Assert.assertEquals(14, test1.geefAantalWerklozenPerStad("UtReCht"));
    }
    @Test
    public void testGeefAantalWerklozenPerAmsterdam() {
        BewonerController test2 = new BewonerController();
        Assert.assertEquals(11, test2.geefAantalWerklozenPerStad("AMSTERDAM"));
    }
    @Test
    public void testAantalBewonersUtrecht(){
        BewonerController test3 = new BewonerController();
        Assert.assertEquals(42,test3.geefAantalBewonersPerStad("utrecht"));
    }
    @Test
    public void testAantalBewonersAmsterdam(){
        BewonerController test4 = new BewonerController();
        Assert.assertEquals(43,test4.geefAantalBewonersPerStad("Amsterdam"));
    }
    @Test
    public void testAantalArbeidersAmsterdam(){
        BewonerController test5 = new BewonerController();
        Assert.assertEquals(23,test5.geefAantalArbeidersPerStad("amsterdam"));
    }
    @Test
    public void testAantalArbeidersUtrecht(){
        BewonerController test6 = new BewonerController();
        Assert.assertEquals(43,test6.geefAantalArbeidersPerStad("utrecht"));
    }
}
