public class KuisenToDoCommand implements Command{

    Kuisen kuisen;

    public KuisenToDoCommand(Kuisen kuisen){
        this.kuisen = kuisen;
    }
    @Override
    public void execute (){
        kuisen.toDo();
    }

    @Override
    public void undo() {
        kuisen.done();
    }
}
