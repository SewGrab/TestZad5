package test;

public class Main {

    public static void main(String[] args) {
        Pasazer pasazer1 = new Pasazer("Jan", "Kowalski", 30, Bilet.ULGOWY);
        Pasazer pasazer2 = new Pasazer("Julia", "Kamińska", 20, Bilet.NORMALNY);
        Pasazer pasazer3 = new Pasazer("Seweryn", "Grabowski", 17, Bilet.ULGOWY);

        pasazer1.jedz();
        pasazer2.jedz();
        pasazer3.jedz();
    }
}
