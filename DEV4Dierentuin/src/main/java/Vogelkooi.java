public class Vogelkooi extends Dierenkooi{
    public Vogelkooi() {
        super.netbehavior = new NetkooiMet() {
        };
        super.waterbehavior = new WaterkooiMet(){};
    }
}
