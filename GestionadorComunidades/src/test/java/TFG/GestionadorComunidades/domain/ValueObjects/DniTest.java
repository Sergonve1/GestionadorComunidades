package TFG.GestionadorComunidades.domain.ValueObjects;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DniTest {

    @Test
    public void testDniConMenosDeOchoDigitos() {
        // Caso de prueba: DNI con menos de 8 dígitos
        assertThrows(IllegalArgumentException.class, () -> {
            new Dni("12345A"); // 7 dígitos y 1 letra, no válido
        });
    }

    @Test
    public void testDniConMasDeOchoDigitos() {
        // Caso de prueba: DNI con menos de 8 dígitos
        assertThrows(IllegalArgumentException.class, () -> {
            new Dni("123451231A"); // 7 dígitos y 1 letra, no válido
        });
    }

    @Test
    public void testDniSinLetra() {
        // Caso de prueba: DNI con menos de 8 dígitos
        assertThrows(IllegalArgumentException.class, () -> {
            new Dni("711657471"); // 7 dígitos y 1 letra, no válido
        });
    }

    @Test
    public void testDniDosLetra() {
        // Caso de prueba: DNI con menos de 8 dígitos
        assertThrows(IllegalArgumentException.class, () -> {
            new Dni("7116574ad"); // 7 dígitos y 1 letra, no válido
        });
    }

    @Test
    public void testValido() {
        // Caso de prueba: DNI con menos de 8 dígitos
        assertThrows(IllegalArgumentException.class, () -> {
            new Dni("7116574ad"); // 7 dígitos y 1 letra, no válido
        });
    }

    @Test
    public void testDniValido() {
        // Caso de prueba: DNI válido
        Dni dni = new Dni("12345678A"); // Un DNI válido (8 números y 1 letra)
        assertNotNull(dni); // Verifica que el objeto se crea correctamente
    }
    
}
