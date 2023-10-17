package klase;

public class Sektori {
   //ATRIBUTI KLASE
   public String nazivSektora;
   public String teamLead;
   public int brojLjudi;
   public static int brojTimova;

   //KONSTRUKTORI - MEHANIZAM ZA PRAVLJENJE OBJEKATA

   //PARAMETRIZOVANI KONSTRUKTOR

   public Sektori () {

   }
   public Sektori(String nazivSektora, String teamLead, int brojLjudi)  {
      this.nazivSektora = nazivSektora;
      this.teamLead = teamLead;
      this.brojLjudi = brojLjudi;
   }

      public Sektori (int brojLjudi, String nazivSektora) {
         this.brojLjudi = brojLjudi;
         this.nazivSektora = nazivSektora;
   }

   public Sektori (String teamLead, int brojLjudi) {
         this.teamLead = teamLead;
         this.brojLjudi = brojLjudi;
   }

   //METODE

   public int sum(int a,int b) {
      int c = a + b;
      return c;
   }

   public int sum1(int a, int b) {
      return a + b;
   }

   public void sum2 (int a, int b) {
      System.out.println(a + b);
   }

//   public int sum2() {
//      return 5 + 5;
//   }


//   @Override   single quotes za n a moze i double ?
//   public String toString() {
//      return "Sektori{" +
//              "nazivSektora='" + nazivSektora + '\'' +
//              ", teamLead='" + teamLead + '\'' +
//              ", brojLjudi=" + brojLjudi +
//              '}';
//   }

// GET I SET METODE
   public String getNazivSektora() {
      return nazivSektora;
   }

   public void setNazivSektora(String nazivSektora) {
      this.nazivSektora = nazivSektora;
   }

   public String getTeamLead() {
      return teamLead;
   }

   public void setTeamLead(String teamLead) {
      this.teamLead = teamLead;
   }

   public int getBrojLjudi() {
      return brojLjudi;
   }

   public void setBrojLjudi(int brojLjudi) {
      this.brojLjudi = brojLjudi;
   }

   @Override //UGRADJENA METODA KLASE STRING
   public String toString() {
      return "Sektori{" + '\n' +
              "nazivSektora='" + nazivSektora +  "'\n"+
              "teamLead='" + teamLead + "'\n" +
              "brojLjudi=" + brojLjudi + "'\n" +
              "}";


   }


}

