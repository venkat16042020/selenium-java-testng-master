package training.testNgPractice;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductModuleTests extends TestNgBaseTest {
    @Test
    public void test1(){
        System.out.println("test1.....");
        String var1 = "Activated";
        String var2 = "Connected";//driver.findEelementBy(Id("")).getText();
        if (var1.equals(var2)) {
            Assert.assertTrue(true, "passed.");
        }else{
            Assert.assertTrue(false, "Expected: " + var1 +
                    ". Actual: " + var2);
        }

    }
    @Test(dependsOnMethods = "test1")
    public void test2(){
        System.out.println("test2.....");
    }
    @Test
    public void test3(){
        System.out.println("test3.....");
    }

    @Test(enabled = false)
    public void test4(){
        System.out.println("test4....");
    }

    @Test(description = "create product test", invocationCount = 1, groups = "PP Alarm")
    public void test5(){
        System.out.println("test5....");
        System.out.println();
    }

    @Test(description = "edit product test", invocationCount = 1, groups = "PP Alarm")
    public void test6() {
        System.out.println("test6....");
        String var1 = "Activated";
        String var2 = "Connected";//driver.findEelementBy(Id("")).getText();
        if (var1.equals(var2)) {
            Assert.assertTrue(true, "passed.");
        }else{
            Assert.assertTrue(false, "Expected: " + var1 +
                    ". Actual: " + var2);
        }
    }
    @Test(description = "method PQRS", dependsOnGroups = "QQ Alarm", groups = "zz Alarm")
    public void test7(){
        System.out.println("test7....");

    }
    @Test(description = "method XYZ", invocationCount = 3, groups = "QQ Alarm")
    public void test8(){
        System.out.println("test8....");
        Assert.assertTrue(true);
    }
}
