import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {
    MainClass mainClass = new MainClass();

    @Test
    public void testGetLocalNumber(){
        int expectedResult = 20;
        boolean equalsFourteen;
        if (mainClass.getLocalNumber()==expectedResult){
            equalsFourteen=true;
            Assert.assertTrue(equalsFourteen);
            System.out.println("Local number equals 14");
        }
        else {
            equalsFourteen=false;
            Assert.assertFalse(equalsFourteen);
            System.out.println("Local number not equals 14");
        }
    }
}
