public class AquariumHaai extends TakenLijst {

    @Override
    public void kuisen() {
        Kuisen kuisen = new Kuisen();
        Command KuisenDoneCommand = new KuisenDoneCommand(kuisen);
        KuisenDoneCommand.execute();
    }

}


