public class DierenKooiSluiten implements Command{

    Dierenkooi dierenkooi;

    public DierenKooiSluiten(Dierenkooi dierenkooi) {
        this.dierenkooi = dierenkooi;
    }

    @Override
    public void DeurCommand() {dierenkooi.toe();
    }

    @Override
    public void Undo() {
        dierenkooi.open();
    }
}
