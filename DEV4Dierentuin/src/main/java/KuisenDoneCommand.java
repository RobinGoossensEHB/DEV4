public class KuisenDoneCommand implements Command {

    Kuisen kuisen;

    public KuisenDoneCommand(Kuisen kuisen){
        this.kuisen = kuisen;
    }

    @Override
    public void execute (){
        this.kuisen.done();
    }

    @Override
    public void undo() { this.kuisen.toDo(); }
}
