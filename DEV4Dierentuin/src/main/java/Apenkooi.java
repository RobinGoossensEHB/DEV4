public class Apenkooi extends Dierenkooi{
    public Apenkooi() {
        super.netbehavior = new NetkooiZonder() {
        };
        super.waterbehavior = new WaterkooiMet(){};


    }
}
