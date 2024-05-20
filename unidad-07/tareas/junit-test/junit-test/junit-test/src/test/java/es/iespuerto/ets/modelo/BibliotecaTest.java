package es.iespuerto.ets.modelo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Objects;

public class BibliotecaTest {

    private int id = 1;
    private String nombre = "nombre";
    private String direccion = "direccion";
    Biblioteca biblioteca = new Biblioteca();

    @BeforeEach
    public void beforeEach() {
        biblioteca = new Biblioteca(id,nombre,direccion);
    }

    @Test
    public void bibliotecaNotNullTest() {
        Assertions.assertNotNull(biblioteca, "El objeto no puede ser nulo");
    }

    @Test
    public void bibliotecaSetGetTest(){
        String nombreUpdate = "nombreUpdate";
        String direccionUpdate = "direccionUpdate";

        biblioteca.setNombre(nombreUpdate);
        biblioteca.setDireccion(direccionUpdate);

        Assertions.assertEquals(nombreUpdate, biblioteca.getNombre(), "Resultado no esperado");
        Assertions.assertEquals(direccionUpdate, biblioteca.getDireccion(), "Resultado no esperado");
        Assertions.assertEquals(id, biblioteca.getId(), "Resultado no esperado");
    }

    @Test
    public void toStringTest(){
        Assertions.assertTrue(biblioteca.toString().contains((String.valueOf(id))), "No contiene el valor esperado");
        Assertions.assertTrue(biblioteca.toString().contains(nombre),
                "No contiene el valor esperado");
        Assertions.assertTrue(biblioteca.toString().contains(direccion),
                "No contiene el valor esperado");
    }

    @Test
    public void bibliotecaEqualsTest() {
        Biblioteca bibliotecaNull = null;
        String bibliotecaOtraClase = "";
        Biblioteca bibliotecaEquals = new Biblioteca(id);
        Assertions.assertTrue(biblioteca.equals(bibliotecaEquals), "No son iguales");
        Assertions.assertFalse(biblioteca.equals(bibliotecaNull), "No son iguales");
        Assertions.assertFalse(biblioteca.equals(bibliotecaOtraClase), "No es la misma clase");
    }

    @Test
    public void hashCodeTest () {
        Assertions.assertEquals(biblioteca.hashCode(), Objects.hash(id), "No se ha obtenido el resultado esperado");
    }
}