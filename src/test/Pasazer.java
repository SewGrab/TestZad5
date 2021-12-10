package test;

public class Pasazer {
    String imie;
    String nazwisko;
    int wiek;
    Bilet bilet;

    public Pasazer(String imie, String nazwisko, int wiek, Bilet bilet) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.bilet = bilet;
    }

    public void jedz() {
        if(wiek >= 26 && bilet.equals(Bilet.ULGOWY)) {
            System.out.println(imie+" "+nazwisko+" nie możesz jechać");
            System.out.println("Potrzebujesz biletu normalnego");
        } else {
            System.out.println(imie+" "+nazwisko+" możesz jechać");
            if(wiek < 26 && bilet.equals(Bilet.NORMALNY))
                System.out.println("Jeśli kontynuujesz naukę możesz kożystać z biletów ulgowych");
        }
        System.out.println();
    }
}
