import org.junit.jupiter.api.Test;



class TakenLijstTest {

@Test
    void testSetChecked (){
    TakenLijst takenLijst = new AquariumHaai();
    takenLijst.voltooiTaken();
    TakenLijst takenLijst2 = new KooiAap();
   takenLijst2.voltooiTaken();
    TakenLijst takenLijst3 = new KooiPapegaai();
    takenLijst3.voltooiTaken();
}


}