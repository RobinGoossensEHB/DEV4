public class KooiAap extends TakenLijst{

    @Override
    void kuisen() {
        Kuisen kuisen = new Kuisen();
        Command KuisenDoneCommand = new KuisenDoneCommand(kuisen);
        KuisenDoneCommand.undo();
    }

    @Override
    void nakijken() {
        Nakijken nakijken = new Nakijken();
        Command NakijkenDoneCommand = new NakijkenDoneCommand(nakijken);
        NakijkenDoneCommand.execute();
    }
}
