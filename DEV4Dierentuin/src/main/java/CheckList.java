

public class CheckList {
    Command doneCommands;
    Command toDoCommands;

 public void setCommand (Command doneCommand, Command toDoCommand){
     doneCommands = doneCommand;
     toDoCommands = toDoCommand;
 }

 public void doneWasChecked() {
     doneCommands.execute();
    }


    public void todDoWasChecked (){
     toDoCommands.undo();
    }

}
