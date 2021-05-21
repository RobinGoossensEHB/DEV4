import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

public class CommandTest extends TestCase {
    @Test
    public void testKuisenDone() {
        Kuisen kuisen = new Kuisen();
        Assert.assertEquals("Aquarium of kooi is gekuist", kuisen.done());

    }
}