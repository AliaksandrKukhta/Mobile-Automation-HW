import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {
    MainClass mainClass = new MainClass();
    int expectedResult;
    boolean equals;
    @Test
    public void testGetLocalNumber(){
        expectedResult = 20;
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

    @Test
    public void testGetClassNumber(){
        expectedResult=45;
        if (mainClass.getClassNumber()>expectedResult){
            equals=true;
            Assert.assertTrue(equals);
            System.out.println("Class number more 45");
        }
        else {
            equals=false;
            Assert.assertFalse(equals);
            System.out.println("Class number less 45");
        }
    }
}
