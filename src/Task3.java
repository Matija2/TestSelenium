import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /* Napisati program koji pomaže kasirki da obračuna kusur
        koji treba da vrati kupcu. Za unetu cenu artikla, količinu artikla i iznos koji je
        kupac dao, program treba da ispiše vrednost kusura. Sve ulazne vrednosti su
        pozitivni celi brojevi. Napomena: Pretpostaviti da je unos ispravan.*/

        Scanner skener = new Scanner(System.in);
        System.out.println("Ubacite cenu artikla: ");
        int cenaArtikla = skener.nextInt();
        System.out.println("Ubacite kolicinu artikla: ");
        int kolicinaArtikla = skener.nextInt();
        System.out.println("Ubacite iznos koji je kupac dao za placanje: ");
        int iznos = skener.nextInt();
        int kusur = iznos - (cenaArtikla * kolicinaArtikla);
        System.out.println("Vrednost kusura je: " + (kusur));

        //sve ovo moze i u double-u da se uradi

    }
}
