import junit.framework.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HaaiTest {
    @Test
    public void createHaai(){
        Dierenkooi haai = new Haai();
        haai.zwembehavior.zwemmen();
        Assert.assertEquals("Dit dier kan zwemmen!", haai.zwembehavior.zwemmen());
    }
}