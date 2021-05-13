public class Papegaai extends Dierenkooi{
    public Papegaai(){

        super.loopbehavior = new LoopClass();
        super.vliegbehavior = new VliegClass();

    }
}
