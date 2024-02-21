package es.iespuerto.ets.modelo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LibroTest {
    private String isbn= "isbn";
    private String titulo = "nombre";

    private String autor = "autor";
    private String fPublicacion="20/02/2024";

    Libro libro = new Libro();
    @BeforeEach
    public void beforeEach(){
        libro = new Libro(isbn, titulo, autor, fPublicacion);
    }

    @Test
    public void libroNotNullTest(){
        Assertions.assertNotNull(libro, "La variable no puede ser nula.");
    }

    @Test
    public void libroGetSetTest(){
        String autorUpdate = "autorUpdate";
        String fPublicacionUpdate ="21/02/2024";
        String tituloUpdate = "tituloUpdate";
        libro.setAutor(autorUpdate);
        libro.setTitulo(tituloUpdate);
        libro.setfPublicacion(fPublicacionUpdate);
        Assertions.assertEquals(tituloUpdate, libro.getTitulo(), "Resultado no esperado");
        Assertions.assertEquals(autorUpdate, libro.getAutor(), "Resultado no esperado");
        Assertions.assertEquals(fPublicacionUpdate, libro.getfPublicacion(), "Resultado no esperado");
        Assertions.assertEquals(isbn, libro.getIsbn(), "Resultado no esperado");

    }

    @Test
    public void toStringTest(){
        Assertions.assertTrue(libro.toString().contains(isbn), "No contiene el valor esperado");
        Assertions.assertTrue(libro.toString().contains(titulo), "No contiene el valor esperado");
        Assertions.assertTrue(libro.toString().contains(fPublicacion), "No contiene el valor esperado");
        Assertions.assertTrue(libro.toString().contains(autor), "No contiene el valor esperado");
    }

    @Test
    public void equalsTest(){
        Libro libro2 = new Libro(isbn, titulo, autor, fPublicacion);
        Assertions.assertTrue(libro.equals(libro2));
    }

}
