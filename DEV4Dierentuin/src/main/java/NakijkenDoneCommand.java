public class NakijkenDoneCommand implements Command {
    Nakijken nakijken;

    public NakijkenDoneCommand(Nakijken nakijken) {
        this.nakijken = nakijken;
    }

    @Override
    public void execute() {
        this.nakijken.aap();
    }

    @Override
    public void undo() {
    this.nakijken.pape();
    }

    @Override
    public void extra(){
        this.nakijken.haai();
    }

}
