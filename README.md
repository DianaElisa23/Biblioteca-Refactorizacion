
Este proyecto es una aplicación de consola en Java para gestionar el préstamo de libros en una biblioteca. Permite registrar libros y usuarios, realizar préstamos, devoluciones etc.

## Características
Registrar libros con su tipo (ej. novela, ciencia, etc.).
Registrar usuarios (estudiantes y profesores).
Prestar libros a usuarios (máximo 3 libros por usuario).
Registrar devoluciones.
Validar disponibilidad de libros.
Evitar que se presten libros no disponibles.
Listar libros, usuarios y préstamos activos.

## Estructura de Clases
Libro: representa un libro con su ID, título, autor, disponibilidad y tipo.

Usuario: representa un usuario general de la biblioteca.

TipoUsuario: contiene subclases Estudiante y Profesor.

Prestamo: representa un préstamo de libro con fechas y estado.

Biblioteca: clase principal con métodos estáticos para registrar y operar sobre libros, usuarios y préstamos.