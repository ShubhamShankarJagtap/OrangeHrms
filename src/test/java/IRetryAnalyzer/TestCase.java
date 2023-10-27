package IRetryAnalyzer;

import org.junit.Assert;
import org.testng.annotations.Test;

public class TestCase {
    @Test
    public void testCase1(){
        Assert.fail();
    }
    @Test
    public void testCase2(){
        Assert.fail();
    }
    @Test
    public void testCase3(){
        Assert.assertTrue(true);
    }

}
