import junit.framework.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PapegaaiTest {
    @Test
    public void createPapegaai(){
        Dierenkooi papegaai = new Papegaai();
        papegaai.vliegbehavior.vliegen();
        papegaai.loopbehavior.loop();
        Assert.assertEquals("Dit dier kan vliegen!", papegaai.vliegbehavior.vliegen());
        Assert.assertEquals("Dit dier kan lopen!", papegaai.loopbehavior.loop());

    }
}