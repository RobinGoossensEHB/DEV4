import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

public class CommandTest extends TestCase {
    @Test
    public void testKuisenDone() {
        Kuisen kuisen = new Kuisen();
        TakenLijst takenLijst = new AquariumHaai();
        Command KuisenDoneCommand = new KuisenDoneCommand(kuisen);
        DierenKooi dierenkooi = New Dierenkooi();
        dierenkooi.setCommand(KuisenDoneCommand, KuisenDoneCommand);
        dierenkooi.doneWasChecked();
        takenLijst.voltooiTaken();
    }
}
