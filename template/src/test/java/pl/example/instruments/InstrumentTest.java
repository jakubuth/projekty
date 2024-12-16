// Plik: InstrumentTest.java
package pl.example.instruments;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InstrumentTest {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void testPianoPlayAndSound() {
        Piano piano = new Piano("Grand Piano");
        piano.play();
        assertEquals("Piano is playing", outputStreamCaptor.toString().trim());

        outputStreamCaptor.reset();
        assertEquals("Plink", piano.sound());
    }

    @Test
    public void testGuitarPlayAndSound() {
        Guitar guitar = new Guitar("Acoustic Guitar");
        guitar.play();
        assertEquals("Guitar is strumming", outputStreamCaptor.toString().trim());

        outputStreamCaptor.reset();
        assertEquals("Strum", guitar.sound());
    }

    @Test
    public void testDrumPlayAndSound() {
        Drum drum = new Drum("Bass Drum");
        drum.play();
        assertEquals("Drum is beating", outputStreamCaptor.toString().trim());

        outputStreamCaptor.reset();
        assertEquals("Boom", drum.sound());
    }
}
