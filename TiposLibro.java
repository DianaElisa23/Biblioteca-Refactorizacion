/**
 * Esta clase sirve como base para representar diferentes tipos de usuarios 
 * mediante herencia, y permite acceder y modificar los datos del usuario.
 */
public class TiposLibro {
    public static class LibroFisico extends Libro {
        public LibroFisico(int id, String titulo, String autor, int anio, String genero, boolean disponible) {
            super(id, titulo, autor, anio, genero, "Fisico", disponible);
        }
    }

    public static class LibroDigital extends Libro {
        public LibroDigital(int id, String titulo, String autor, int anio, String genero, boolean disponible) {
            super(id, titulo, autor, anio, genero, "Digital", disponible);
        }
    }

    public static class Audiolibro extends Libro {
        public Audiolibro(int id, String titulo, String autor, int anio, String genero, boolean disponible) {
            super(id, titulo, autor, anio, genero, "Audiolibro", disponible);
        }
    }
}



