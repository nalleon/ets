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
    private String isbn= "isbn";
    private String titulo = "nombre";

    private String autor = "autor";
    private String fPublicacion="20/02/2024";

    BibliotecaNegocio bibliotecaNegocio;
    Libro libro;
    @BeforeEach
    public void beforeEach() {
        bibliotecaNegocio = new BibliotecaNegocio(id,nombre,direccion);
        libro = new Libro(isbn, titulo, autor, fPublicacion);

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
    public void actualizarLibroNoExisteTest(){
        Libro libroNoExiste= new Libro(String.valueOf(2));
        Assertions.assertFalse(bibliotecaNegocio.actualizarLibro(libroNoExiste), "Resultado no esperado");
    }
    @Test
    public void actualizarLibroExisteTest(){
        Libro libroNoExiste= new Libro(String.valueOf(1));
        Assertions.assertTrue(bibliotecaNegocio.actualizarLibro(libroNoExiste), "Resultado no esperado");
    }
}
