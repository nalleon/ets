package es.iespuerto.ets.negocio;

import es.iespuerto.ets.modelo.Biblioteca;
import es.iespuerto.ets.modelo.Libro;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BibliotecaNegocioTest {

    private int id = 1;
    private String nombre = "nombre";
    private String direccion = "direccion";

    BibliotecaNegocio bibliotecaNegocio;
    Libro libro;
    @BeforeEach
    public void beforeEach() {
        bibliotecaNegocio = new BibliotecaNegocio(id);
        bibliotecaNegocio = new BibliotecaNegocio(id, nombre, direccion);
        libro = new Libro(String.valueOf(id), "titulo", "autor", "fPublicacion");
        bibliotecaNegocio.addLibro(libro);
    }

    @Test
    public void addLibroDuplicadoTest () {
        bibliotecaNegocio.addLibro(libro);
        Assertions.assertEquals(1, bibliotecaNegocio.obtenerLibros().size(),
                "No se ha obtenido el numero esperado");
    }

    @Test
    public void existeLibroTest () {
        Assertions.assertTrue(bibliotecaNegocio.existeLibro(libro), "Resultado no esperado");
    }

    @Test
    public void obtenerLibroTest () {
        Libro libroBuscar = new Libro(String.valueOf(id));

        Assertions.assertEquals(libroBuscar, bibliotecaNegocio.obtenerLibro(libroBuscar),
                "Resultado no esperado");
    }

    @Test
    public void actualizarlibroBuscarTest(){
        String autorUpdate = "autorUpdate";
        String fPublicacionUpdate ="21/02/2024";
        String tituloUpdate = "tituloUpdate";

        Libro libroBuscar = new Libro();
        libroBuscar.setAutor(autorUpdate);
        libroBuscar.setTitulo(tituloUpdate);
        libroBuscar.setfPublicacion(fPublicacionUpdate);

        bibliotecaNegocio.actualizarLibro(libroBuscar);
    }
    @Test
    public void obtenerLibroNoExisteTest () {
        Libro libroBuscar = new Libro(String.valueOf(2));
        Assertions.assertNull(bibliotecaNegocio.obtenerLibro(libroBuscar), "Resultado no esperado");
    }
    @Test
    public void actualizarLibroNoExisteTest(){
        Libro libroNoExiste= new Libro(String.valueOf(2));
        Assertions.assertFalse(bibliotecaNegocio.actualizarLibro(libroNoExiste), "Resultado no esperado");
    }
    @Test
    public void actualizarLibroExisteTest(){
        Libro libroExiste= new Libro(String.valueOf(1));
        Assertions.assertTrue(bibliotecaNegocio.actualizarLibro(libroExiste), "Resultado no esperado");
    }

    @Test
    public void eliminarLibroTest(){
        Libro libroExiste= new Libro(String.valueOf(1));
        Assertions.assertTrue(bibliotecaNegocio.eliminarLibro(libroExiste), "Resultado no esperado");
    }

    @Test
    public void eliminarLibroNoExisteTest(){
        Libro libroNoExiste= new Libro(String.valueOf(3));
        Assertions.assertTrue(bibliotecaNegocio.eliminarLibro(libroNoExiste), "Resultado no esperado");
    }
}
