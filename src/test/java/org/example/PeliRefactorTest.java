package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PeliRefactorTest {

    @Test
    public void tarkistaVoittoTest() {
        PelaajaRefactor p1 = new PelaajaRefactor();
        PelaajaRefactor p2 = new PelaajaRefactor();

        // Testaa eri skenaarioita
        PeliRefactor.tarkistaVoitto(p1, p2, "kivi", "sakset");
        assertEquals(1, p1.getVoitot());

        PeliRefactor.tarkistaVoitto(p1, p2, "paperi", "kivi");
        assertEquals(2, p1.getVoitot());

    }
}