import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    Calculadora calculadora = new Calculadora();

    @Test
    public void deveSomarNumerosPositivos() {
        assertEquals(10, calculadora.somar(5, 5));
    }

    @Test
    public void deveSomarNumerosNegativos() {
        assertEquals(-10, calculadora.somar(-5, -5));
    }

    @Test
    public void deveSomarComZero() {
        assertEquals(5, calculadora.somar(5, 0));
    }

    @Test
    public void deveSubtrairNumerosPositivos() {
        assertEquals(5, calculadora.subtrair(10, 5));
    }

    @Test
    public void deveSubtrairNumerosNegativos() {
        assertEquals(0, calculadora.subtrair(-5, -5));
    }

    @Test
    public void deveSubtrairComZero() {
        assertEquals(10, calculadora.subtrair(10, 0));
    }

    @Test
    public void deveMultiplicarNumerosPositivos() {
        assertEquals(25, calculadora.multiplicar(5, 5));
    }

    @Test
    public void deveMultiplicarNumeroNegativo() {
        assertEquals(-25, calculadora.multiplicar(-5, 5));
    }

    @Test
    public void deveMultiplicarPorZero() {
        assertEquals(0, calculadora.multiplicar(5, 0));
    }

    @Test
    public void deveDividirNumerosPositivos() {
        assertEquals(5, calculadora.dividir(10, 2));
    }

    @Test
    public void deveDividirComResultadoDecimal() {
        assertEquals(2.5, calculadora.dividir(5, 2));
    }

    @Test
    public void deveGerarErroAoDividirPorZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculadora.dividir(10, 0);
        });
    }
}