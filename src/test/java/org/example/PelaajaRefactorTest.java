package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PelaajaRefactorTest {

    @Test
    void pelaajanValintaTest() {
        PelaajaRefactor pelaaja = new PelaajaRefactor();
        String valinta = pelaaja.pelaajanValinta();
        assertTrue(valinta.equals("kivi") || valinta.equals("sakset") || valinta.equals("paperi"));
    }

    @Test
    public void lisaaVoittoTest() {
        PelaajaRefactor pelaaja = new PelaajaRefactor();
        pelaaja.lisaaVoitto();
        assertEquals(1, pelaaja.getVoitot());
    }

    @Test
    public void getVoitotTest() {
        PelaajaRefactor pelaaja = new PelaajaRefactor();
        assertEquals(0, pelaaja.getVoitot());
        pelaaja.lisaaVoitto();
        assertEquals(1, pelaaja.getVoitot());
    }
}