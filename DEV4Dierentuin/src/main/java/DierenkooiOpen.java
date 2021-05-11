public class DierenkooiOpen implements Command{

    Dierenkooi dierenkooi;

    public DierenkooiOpen(Dierenkooi dierenkooi) {
        this.dierenkooi = dierenkooi;
    }

    @Override
    public void DeurCommand() {dierenkooi.open();
    }

    @Override
    public void Undo() {
        dierenkooi.toe();
    }
}
