package TFG.GestionadorComunidades.domain.ValueObjects;

public class Telefono {
    private final String numero;

    public Telefono(String numero) {
        // Validamos el número de teléfono al momento de la creación
        if (!esTelefonoValido(numero)) {
            throw new IllegalArgumentException("Formato de teléfono inválido");
        }
        this.numero = numero; // Asignamos el valor después de la validación
    }

    private boolean esTelefonoValido(String numero) {
        if (numero == null || numero.length() != 9) { // Verificar si el parámetro numero es nulo o si no tiene 9 dígitos
            return false;
        }

        // Verificar que solo contenga números
        return numero.matches("\\d+");
    }
}
