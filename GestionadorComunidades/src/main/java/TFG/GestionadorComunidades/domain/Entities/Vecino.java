package TFG.GestionadorComunidades.domain.Entities;

public class Vecino {
    private final String nombre;
    private final String apellido;
    private final String dni;
    private String correo;
    private int telefono;

    public Vecino(String nombre,String apellido,String dni,String correo,int telefono){
        this.nombre=nombre;
        this.apellido=apellido;
        this.dni=dni;
        this.correo=correo;
        this.telefono=telefono;
    }

    /**
     * @return String return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return String return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @return String return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @return String return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return int return the telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

}
