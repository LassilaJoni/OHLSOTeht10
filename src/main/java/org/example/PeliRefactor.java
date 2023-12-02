package org.example;

/**
 *
 * PeliRefactor luokka sisältää refaktoroidun kivi paperi sakset pelin
 */
public class PeliRefactor {

    public static void main(String args[]) {
        PelaajaRefactor p1 = new PelaajaRefactor();
        PelaajaRefactor p2 = new PelaajaRefactor();
        int pelatutPelit = 0;           // Pelattujen pelien lkm
        int tasapelit = 0;              // Tasapelien lkm
        boolean peliLoppui = false;

        do {
            System.out.println("Erä: " + pelatutPelit + " =====================\n");
            System.out.println("Tasapelien lukumäärä: " + tasapelit + "\n");

            String p1Valinta = p1.pelaajanValinta();
            String p2Valinta = p2.pelaajanValinta();

            System.out.println("Pelaaja 1: " + p1Valinta + "\n\t Pelaaja 1:llä koossa " + p1.getVoitot() + " voittoa.");
            System.out.println("Pelaaja 2: " + p2Valinta + "\n\t Pelaaja 2:lla koossa " + p2.getVoitot() + " voittoa.");

            tarkistaVoitto(p1, p2, p1Valinta, p2Valinta);

            if (p1Valinta.equals(p2Valinta)) {
                tasapelit++;
                System.out.println("\n\t\t\t Tasapeli \n");
            }

            pelatutPelit++;
            if (p1.getVoitot() >= 3 || p2.getVoitot() >= 3) {
                peliLoppui = true;
                System.out.println("KOLME VOITTOA - PELI PÄÄTTYY");
            }
            System.out.println();
        } while (!peliLoppui);
    }

    /**
     * Tarkistaa pelin voittajan ja päivittää voittajan
     * @param p1 Ensimmäinen pelaaja
     * @param p2 Toinen pelaaja
     * @param p1Valinta Ensimmäisen pelaajan valinta
     * @param p2Valinta Toisen pelaajan valinta
     */
    public static void tarkistaVoitto(PelaajaRefactor p1, PelaajaRefactor p2, String p1Valinta, String p2Valinta) {

        if ((p1Valinta.equals("kivi")) && (p2Valinta.equals("paperi"))) {
            p2.lisaaVoitto();
            System.out.println("Pelaaja 2 voittaa");
        } else if ((p1Valinta.equals("paperi")) && (p2Valinta.equals("kivi"))) {
            p1.lisaaVoitto();
            System.out.println("Pelaaja 1 voittaa");
        } else if ((p1Valinta.equals("kivi")) && (p2Valinta.equals("sakset"))) {
            p1.lisaaVoitto();
            System.out.println("Pelaaja 1 voittaa");
        } else if ((p1Valinta.equals("sakset")) && (p2Valinta.equals("kivi"))) {
            p2.lisaaVoitto();
            System.out.println("Pelaaja 2 voittaa");
        } else if ((p1Valinta.equals("sakset")) && (p2Valinta.equals("paperi"))) {
            p1.lisaaVoitto();
            System.out.println("Pelaaja 1 voittaa");
        } else if ((p1Valinta.equals("paperi")) && (p2Valinta.equals("sakset"))) {
            p2.lisaaVoitto();
            System.out.println("Pelaaja 2 voittaa");
        }
    }
}