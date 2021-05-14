public abstract class TakenLijst {

    final void voltooiTaken (){
      deurOpen ();
        etenGeven();
         kuisen();
        nakijken();
    deurToe();
   }
   abstract void kuisen();
  abstract void nakijken();

   void deurOpen(){
        System.out.println("ga binnen");
    }
    void etenGeven(){
        System.out.println("geef dier eten");
    }
    void deurToe(){
        System.out.println("sluit alles goed af");
    }
}
