package TFG.GestionadorComunidades.domain.ValueObjects;

public class Dni {
    private final String dni;
    
    public Dni(String dni) {
        this.dni = dni;
        // Valida el formato del DNI al momento de la creación
        if (!isValidDni()) {
            throw new IllegalArgumentException("Formato de DNI inválido");
        }
        
    }


    private boolean isValidDni() {

        if (dni.length() != 9 || dni == null ) {
            return false;
        }
        
        String numeros = dni.substring(0, 8); 
        char letra = dni.charAt(8); 
        if (!numeros.matches("\\d+") || !Character.isLetter(letra)) {
            return false;
        }
        
        return true; 
    }
}
