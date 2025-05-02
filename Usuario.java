// Usuario.java
/**
 * La clase Usuario representa a una persona registrada en la biblioteca que puede realizar préstamos de libros.
 * Contiene información básica como el ID, nombre, tipo de usuario (Estudiante o Profesor), correo electrónico y teléfono.
 */
public class Usuario {
    private int id;
    private String nombre;
    private String tipoUsuario;
    private String email;
    private String telefono;

    public Usuario(int id, String nombre, String tipoUsuario, String email, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.tipoUsuario = tipoUsuario;
        this.email = email;
        this.telefono = telefono;
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoUsuario(){
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario){
        this.tipoUsuario = tipoUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
