import static org.junit.Assert;
import org.junit.Test;

public class TestHelloWorld {
    
    @Test public void helloWorldNormal() {
        String result = HelloWorld.helloWorld();
        Assert.assertEquals("Hello World!", result);
    }

}