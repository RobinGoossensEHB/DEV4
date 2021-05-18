public class KooiAap extends TakenLijst{

    @Override
    void kuisen() {
        Kuisen kuisen = new Kuisen();
        Command KuisenDoneCommand = new KuisenDoneCommand(kuisen);
        KuisenDoneCommand.undo();
    }

}
