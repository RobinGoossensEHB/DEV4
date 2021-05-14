public class KuisenDoneCommand implements Command {

    Kuisen kuisen;

    public KuisenDoneCommand(Kuisen kuisen){
        this.kuisen =kuisen;
    }

    @Override
    public void execute (){
        kuisen.done();
    }

    @Override
    public void undo() {
        kuisen.toDo();
    }
}
