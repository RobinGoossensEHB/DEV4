public abstract class TakenLijst {

 void voltooiTaken(){
        deurOpen ();
        etenGeven();
        kuisen();
        nakijken();
        deurToe();
   }
   abstract void kuisen();
   abstract void nakijken();

   public void deurOpen(){ System.out.println("binnen gaan gebeurde veilig"); }
   public void etenGeven(){ System.out.println("dier heeft eten gekregen"); }
   public void deurToe(){  System.out.println("alles is goed afgesloten"); }
}
