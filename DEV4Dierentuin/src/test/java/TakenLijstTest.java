import junit.framework.TestCase;
import org.junit.jupiter.api.Test;
import junit.framework.Assert;
public class TakenLijstTest extends TestCase {

@Test
    public void testSetChecked  (){
    TakenLijst takenLijst = new AquariumHaai();
    TakenLijst takenLijst2 = new KooiAap();
    TakenLijst takenLijst3 = new KooiPapegaai();

    Assert.assertEquals(takenLijst.nakijken(),takenLijst2.nakijken(),takenLijst3.nakijken());
}


}