import org.junit.Assert;
import org.junit.Test;


public class OperationSelectorTest {

    OperationSelector operationSelector = new OperationSelector();

    @Test
    public void sumOfProductTest(){
        int expected = 6;
        int actual = operationSelector.sumFrom1ToUserInput(3);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sumOfProductTest2(){
        int expected = 6;
        int actual = operationSelector.sumFrom1ToUserInput2(3);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void productOfProductTest2(){
        int expected = 24;
        int actual = operationSelector.productFrom1ToUserInput(4);
        Assert.assertEquals(expected, actual);
    }
}
