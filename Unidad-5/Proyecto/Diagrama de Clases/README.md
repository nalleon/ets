<div align="justify">

**Nabil L. A. - 1ºDAM | [Vista desde GitHub](https://github.com/nalleon/ets/tree/main/Unidad-5/Proyecto/Diagrama%20de%20Casos%20de%20Uso)** 


## Índice
- [Descripción del ejercicio](#descripción-del-ejercicio)
- [Diagrama de Clases](#diagrama-de-clases)

## Descripción del ejercicio
```
Desarrolla un sistema de llamado Gestión de Biblioteca que permita a los 
bibliotecarios buscar, prestar y devolver libros en una biblioteca.
El sistema debe tener una interfaz de usuario simple (Main con menú) y proporcionar funcionalidades básicas de administración de libros, como: (obtenerInformacion (identificadorLibro),prestarLibro(identificadorLibro),devolverLibro(identificadorLibro),agregarComentario(identificadorLibro),consultarComentarios(identificadorLibro),verificarDisponibilidad(identificadorLibro)). Además el sistema permitirá dar de alta/modificación/búsqueda/eliminación de usuarios y libros.
```

### Datos proporcionados:
---
-  **Libro:**
 ```
Atributos: ISBN, título, autor, año de publicación, cantidad de copias disponibles, etc.

Métodos: obtenerInformacion(), prestarLibro(), devolverLibro(), etc.
```

**Usuario:**
```
Atributos: nombre, número de identificación, historial de préstamos, etc.

Métodos: solicitarPrestamo(), devolverLibro(), consultarHistorial(), etc.
```
**Préstamo:**
```
Atributos: fecha de préstamo, fecha de devolución prevista, libro prestado, usuario que lo solicitó, etc.

Métodos: calcularMulta(), renovarPrestamo(), etc.
```

**Biblioteca:**
```
Atributos: lista de libros disponibles, lista de usuarios registrados, historial de préstamos, etc.

Métodos: buscarLibro(), registrarUsuario(), realizarPrestamo(), etc.
```
**EmpleadoBiblioteca:**
```
Atributos: nombre, número de empleado, horario laboral, etc.

Métodos: procesarPrestamo(), gestionarDevolucion(), etc.
```
**CategoriaLibro:**
```
Atributos: nombre de la categoría, descripción, lista de libros en la categoría, etc.

Métodos: agregarLibro(), quitarLibro(), etc.
```
**Reserva:**
```
Atributos: usuario que hizo la reserva, libro reservado, fecha de vencimiento de la reserva, etc.

Métodos: confirmarReserva(), cancelarReserva(), etc.
```
**Editorial:**
```
Atributos: nombre de la editorial, lista de libros publicados, etc.
    
Métodos: agregarLibro(), listarLibrosPublicados(), etc.
```

**Evento:**
```
Atributos: nombre del evento, fecha, descripción, lista de libros relacionados con el evento, etc.

Métodos: agregarLibroRelacionado(), notificarParticipantes(), etc.
```
**Comentario:**
```
Atributos: usuario que hizo el comentario, libro comentado, texto del comentario, etc.

Métodos: agregarComentario(), eliminarComentario(), etc.
```


</div>