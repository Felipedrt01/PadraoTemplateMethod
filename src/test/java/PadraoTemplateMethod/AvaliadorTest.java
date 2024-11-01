package PadraoTemplateMethod;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AvaliadorTest {

    @Test
    public void testAvaliadorDeSoftwareAprovado() {
        Avaliador avaliador = new AvaliadorDeSoftware("Carlos");
        avaliador.setNota1(8.5f);
        avaliador.setNota2(9.0f);

        assertEquals("Aprovado", avaliador.verificarAprovacao());
        assertEquals("Avaliador de Software{nome='Carlos', resultado=Aprovado}", avaliador.getInfo());
    }

    @Test
    public void testAvaliadorDeSoftwareReprovado() {
        Avaliador avaliador = new AvaliadorDeSoftware("Ana");
        avaliador.setNota1(7.0f);
        avaliador.setNota2(6.0f);

        assertEquals("Reprovado", avaliador.verificarAprovacao());
        assertEquals("Avaliador de Software{nome='Ana', resultado=Reprovado}", avaliador.getInfo());
    }

    @Test
    public void testAvaliadorDeHardwareAprovado() {
        Avaliador avaliador = new AvaliadorDeHardware("Pedro");
        avaliador.setNota1(7.5f);
        avaliador.setNota2(8.0f);

        assertEquals("Aprovado", avaliador.verificarAprovacao());
        assertEquals("Avaliador de Hardware{nome='Pedro', resultado=Aprovado}", avaliador.getInfo());
    }

    @Test
    public void testAvaliadorDeHardwareReprovado() {
        Avaliador avaliador = new AvaliadorDeHardware("Mariana");
        avaliador.setNota1(6.0f);
        avaliador.setNota2(5.5f);

        assertEquals("Reprovado", avaliador.verificarAprovacao());
        assertEquals("Avaliador de Hardware{nome='Mariana', resultado=Reprovado}", avaliador.getInfo());
    }
}
