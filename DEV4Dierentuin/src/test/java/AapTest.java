import junit.framework.Assert;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AapTest {
    @Test
    public void createAap(){
        Dierenkooi aap = new Aap();
        aap.klimbehavior.klimmen();
        aap.loopbehavior.loop();
        aap.zwembehavior.zwemmen();
        Assert.assertEquals("Dit dier kan klimmen!", aap.klimbehavior.klimmen());
        Assert.assertEquals("Dit dier kan lopen!", aap.loopbehavior.loop());
        Assert.assertEquals("Dit dier kan zwemmen!", aap.zwembehavior.zwemmen());
    }

}