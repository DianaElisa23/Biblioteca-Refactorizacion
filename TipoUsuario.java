/**
 * La clase TipoUsuario agrupa las subclases estáticas que representan los diferentes tipos de usuarios de la biblioteca: Estudiante y Profesor.
 */ 
public class TipoUsuario {
    public static class Estudiante extends Usuario {
        public Estudiante(int id, String nombre, String email, String telefono) {
            super(id, nombre, "Estudiante", email, telefono);
        }
    }

    public static class Profesor extends Usuario {
        public Profesor(int id, String nombre, String email, String telefono) {
            super(id, nombre, "Profesor", email, telefono);
        }
    }
}