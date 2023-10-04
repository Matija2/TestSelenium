public class Arrays {
    public static void main(String[] args) {
       int mojNizIntegera [] = new int[5]; // broj clanova niza
        mojNizIntegera [0] = 1; //indexiranje krece od nule
        mojNizIntegera [1] = 2;
        mojNizIntegera [2] = 3;
        mojNizIntegera [3] = 4;
        mojNizIntegera [4] = 5;

       String mojNizStringova [] = new String[7]; // 7 clanova u nizu
        mojNizStringova [0] = "Pera";
        mojNizStringova [1] = "Mika";
        mojNizStringova [2] = "Zika";

       //za ostale elemente u nizu printa "null" jer nisu ubaceni tj definisani

       for (int i = 0; i < mojNizIntegera.length; i++) {
           System.out.println(mojNizIntegera[i]);
       }

        //System.out.println(a); //ovo printa referentni broj

        //for (int i = 0; i < a.length; i++) {
            //System.out.println(a[i]);
       // }

        for (String s:mojNizStringova ) { //has next (da li imas prvi clan, da li imas jos clanova?)
            System.out.println(s);                               // for each petlja nema indexe

        }



    }
}
