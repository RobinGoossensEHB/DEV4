public interface Command {
    void execute();
    void undo();
    void extra();
}
