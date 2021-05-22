public abstract class TakenLijst {

 void voltooiTaken(){
        deurOpen ();
        etenGeven();
        kuisen();
        nakijken();
        deurToe();
   }

   abstract void kuisen();

   public String nakijken(){ return( ("kooien zijn gecontroleerd"));}
   public String deurOpen(){return( ("binnen gaan gebeurde veilig")); }
   public String etenGeven(){return( ("dier heeft eten gekregen")); }
   public String deurToe(){return(  ("alles is goed afgesloten")); }
}
