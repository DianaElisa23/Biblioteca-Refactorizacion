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