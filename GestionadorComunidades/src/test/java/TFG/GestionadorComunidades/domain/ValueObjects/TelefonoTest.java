package TFG.GestionadorComunidades.domain.ValueObjects;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TelefonoTest {

    @Test
    public void testTelefonoValido() {
        // Caso de prueba: teléfono válido (9 dígitos)
        Telefono telefono = new Telefono("123456789");
        assertNotNull(telefono); // Verifica que el objeto no sea nulo
    }
    @Test
    public void testTelefonoConMenosDeNueveDigitos() {
        // Caso de prueba: número de teléfono con menos de 9 dígitos
        assertThrows(IllegalArgumentException.class, () -> {
            new Telefono("12345678"); // Número con menos de 9 dígitos
        });
    }
    @Test
    public void testTelefonoConMasDeNueveDigitos() {
        // Caso de prueba: número de teléfono con más de 9 dígitos
        assertThrows(IllegalArgumentException.class, () -> {
            new Telefono("1234567890"); // Número con más de 9 dígitos
        });
    }
    @Test
    public void testTelefonoConLetras() {
        // Caso de prueba: número de teléfono que contiene letras
        assertThrows(IllegalArgumentException.class, () -> {
            new Telefono("1234567A9"); // Número que contiene una letra
        });
    }
}
