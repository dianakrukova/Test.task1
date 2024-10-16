import org.example.Win;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WinTest {
    @Test
    public void testWin(){
        Assert.assertEquals(
                Win.winners(10,15,25),10);
        Assert.assertEquals(
                Win.winners(8,8,15),7);
        Assert.assertEquals(
                Win.winners(31,30,28),1);
        Assert.assertEquals(
                Win.winners(5,9,10),1);
        Assert.assertEquals(
                Win.winners(10,10,10),2);
        Assert.assertEquals(
                Win.winners(5,6,10),4);

    }

}
