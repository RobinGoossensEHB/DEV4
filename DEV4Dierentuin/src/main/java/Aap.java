public class Aap extends Dierenkooi {
    public Aap() {
        super.klimbehavior = new KlimClass();
        super.loopbehavior = new LoopClass();
        super.zwembehavior = new ZwemClass();



    }
}
