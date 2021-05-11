public class Leeuwenkooi extends Dierenkooi {
    public Leeuwenkooi() {
        super.netbehavior = new NetkooiZonder() {
        };
        super.waterbehavior = new WaterkooiMet(){};
    }
}
