package org.example;

/**
 * PelaajaRefactor luokka sisältää pelaajan toteutukset
 */
public class PelaajaRefactor {
    /**
     *  Pelaajan voittojen määrä
     */
    int voitot;

    /**
     * Pelaajan valinta
     */

    /**
     * Valitsee kivi, sakset tai paperin käyttäen math.random
     * @return palauttaa valinnan
     */
    public String pelaajanValinta() {
        String valinta = "";
        int c = (int) (Math.random() * 3);
        switch (c) {
            case 0:
                valinta = ("kivi");
                break;
            case 1:
                valinta = ("paperi");
                break;
            case 2:
                valinta = ("sakset");
                break;
        }
        return valinta;
    }

    /**
     * Käytetään pelaajan voitot muuttujan lisäämiseen
     */
    public void lisaaVoitto() {
        voitot++;
    }

    /**
     * Käytetään palauttamaan voittojen lukumäärä
     * @return palauttaa voittojen lukumäärän
     */
    public int getVoitot() {
        return voitot;
    }
}
