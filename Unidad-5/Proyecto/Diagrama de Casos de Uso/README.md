<div align="justify">

**Nabil L. A. - 1ºDAM | [Vista desde GitHub](https://github.com/nalleon/ets/tree/main/Unidad-5/Proyecto/Diagrama%20de%20Casos%20de%20Uso)** 


## Índice
- [Descripción del ejercicio](#descripción-del-ejercicio)
- [Diagrama de Casos de Uso](#diagrama-de-casos-de-uso)
    - [Actores](#actores)
    - [Casos de Uso](#casos-de-uso)
    - [Diagrama CU Individual](#diagrama-individual)
    - [Diagrama Cu Final](#diagrama-final)

## Descripción del ejercicio
```
Desarrolla un sistema de llamado Gestión de Biblioteca que permita a los bibliotecarios buscar, prestar y devolver libros en una biblioteca.

El sistema permitirá además las siguientes acciones:
    El usuario:
        - El usuario busca un libro por título, autor o categoría.
        - El usuario selecciona un libro disponible y lo presta.
        - El usuario devuelve un libro prestado.
        - El usuario deja un comentario en un libro.
        - El usuario selecciona una categoría y ve la lista de libros en esa categoría.

    El bibliotecario:
        - El bibliotecario registra a un nuevo usuario en el sistema.
        - El bibliotecario agrega un nuevo libro al sistema.
        - El bibliotecario realiza un préstamo a un usuario.
        - El bibliotecario procesa la devolución de un libro.
        - El bibliotecario gestiona las reservas de libros (visualiza información/modifica).
```

## **Actores**

<img src=../images/actores.png>

|  Actor | Usuario |
|---|---|
| Descripción  | _Persona promedio que se dedica a pedir libros que no se va a leer la mayoría de veces._  |
| Características  |  |
| Relaciones | _Buscar Libro, Devolver Libro, Seleccionar Libro, Dejar Comentario, Título, Autor, Categoría, Ver Lista Libros_|
| Referencias | _C.U.1, C.U.3, C.U.4, C.U.5, C.U.10, C.U.11, C.U.12, C.U.6_ |   
|  Notas |  |
| Autor  | _Nabil L. A. (@nalleon)_ |
|Fecha | _20/12/2023_ |

|  Atributo |||
|---|---|---|
| _Nombre_  | _Nombre del usuario_  | _String_ |
| _Número de Identificación (ID)_  | _Identificación del usuario_  | int |
| _Historial de préstamos_  | _Registro de préstamos del usuario_  | _String[]_ |

|  Actor | Bibliotecario |
|---|---|
| Descripción  | _Empleado de la biblioteca_  |
| Características  |  |
| Relaciones | _Prestar Libro, Devolver Libro, Registrar Usuario, Agregar Libro, Gestionar reserva Libro, Visualizar Información, Modificar Información_  |
| Referencias | _C.U.2, C.U.3, C.U.7, C.U.8, C.U.9, C.U.13, C.U.14_ |   
|  Notas |  |
| Autor  | _Nabil L. A. (@nalleon)_ |
|Fecha | _20/12/2023_ |

|  Atributo |||
|---|---|---|
| _Nombre_  | _Nombre del bibliotecario_  | _String_ |
| _Número de Empleado (ID)_  | _Identificación del empleado_  | _int_ |
| _Horario Laboral_  | _Horario del empleado_  | _Calendar_ |
| | |

## **Casos de Uso**

<img src=../images/cu.png>

  |  Caso de Uso	CU | C.U.1: Buscar Libro  |
  |---|---|
  | Fuentes  | _https://github.com/jpexposito/docencia/tree/master/Primero/ETS/PROYECTO_  |
  | Actor  |  _Usuario_ |
  | Descripción | |
  | Flujo básico |  |
  | Pre-condiciones |   |  
  | Post-condiciones  |   |  
  |  Requerimientos |  |
  |  Notas |   |
| Autor  | _Nabil L. A. (@nalleon)_ |
|Fecha | _20/12/2023_ |


  |  Caso de Uso	CU | C.U.2: Prestar Libro |
  |---|---|
  | Fuentes  | _https://github.com/jpexposito/docencia/tree/master/Primero/ETS/PROYECTO_  |
  | Actor  |  _Bibliotecario_ |
  | Descripción |  |
  | Flujo básico |  |
  | Pre-condiciones |   |  
  | Post-condiciones  |   |  
  |  Requerimientos |  |
  |  Notas |   |
| Autor  | _Nabil L. A. (@nalleon)_ |
|Fecha | _20/12/2023_ |


  |  Caso de Uso	CU | C.U.3: Devolver Libro  |
  |---|---|
  | Fuentes  | _https://github.com/jpexposito/docencia/tree/master/Primero/ETS/PROYECTO_  |
  | Actor  |  _Usuario, Bibliotecario_ |
  | Descripción |  |
  | Flujo básico |  |
  | Pre-condiciones |   |  
  | Post-condiciones  |   |  
  |  Requerimientos |  |
  |  Notas |   |
| Autor  | _Nabil L. A. (@nalleon)_ |
|Fecha | _20/12/2023_ |


  |  Caso de Uso	CU | C.U.4: Seleccionar Libro  |
  |---|---|
  | Fuentes  | _https://github.com/jpexposito/docencia/tree/master/Primero/ETS/PROYECTO_  |
  | Actor  |  _Usuario_ |
  | Descripción |    |
  | Flujo básico |  |
  | Pre-condiciones |   |  
  | Post-condiciones  |   |  
  |  Requerimientos | _C.U.1, C.U.10, C.U.11, C.U.12, C.U.6_  |
  |  Notas |   |
| Autor  | _Nabil L. A. (@nalleon)_ |
|Fecha | _20/12/2023_ |

  |  Caso de Uso	CU | C.U.5: Dejar Comentarios  |
  |---|---|
  | Fuentes  | _https://github.com/jpexposito/docencia/tree/master/Primero/ETS/PROYECTO_  |
  | Actor  |  _Usuario_ |
  | Descripción |     |
  | Flujo básico |  |
  | Pre-condiciones |   |  
  | Post-condiciones  |   |  
  |  Requerimientos |  |
  |  Notas |   |
| Autor  | _Nabil L. A. (@nalleon)_ |
|Fecha | _20/12/2023_ |

  |  Caso de Uso	CU | C.U.6: Ver Lista Libros |
  |---|---|
  | Fuentes  | _https://github.com/jpexposito/docencia/tree/master/Primero/ETS/PROYECTO_  |
  | Actor  |  _Usuario_ |
  | Descripción |     |
  | Flujo básico |  |
  | Pre-condiciones |   |  
  | Post-condiciones  |   |  
  |  Requerimientos | _C.U.1, C.U.12_  |
  |  Notas |   |
| Autor  | _Nabil L. A. (@nalleon)_ |
|Fecha | _20/12/2023_ |

  |  Caso de Uso	CU | C.U.7: Registrar Usuario |
  |---|---|
  | Fuentes  | _https://github.com/jpexposito/docencia/tree/master/Primero/ETS/PROYECTO_  |
  | Actor  |  _Bibliotecario_ |
  | Descripción |     |
  | Flujo básico |  |
  | Pre-condiciones |   |  
  | Post-condiciones  |   |  
  |  Requerimientos |  |
  |  Notas |   |
| Autor  | _Nabil L. A. (@nalleon)_ |
|Fecha | _20/12/2023_ |

  |  Caso de Uso	CU | C.U.8: Agregar Libro |
  |---|---|
  | Fuentes  | _https://github.com/jpexposito/docencia/tree/master/Primero/ETS/PROYECTO_  |
  | Actor  |  _Bibliotecario_ |
  | Descripción |     |
  | Flujo básico |  |
  | Pre-condiciones |   |  
  | Post-condiciones  |   |  
  |  Requerimientos |  |
  |  Notas |   |
| Autor  | _Nabil L. A. (@nalleon)_ |
|Fecha | _20/12/2023_ |

  |  Caso de Uso	CU | C.U.9: Gestionar reserva Libro |
  |---|---|
  | Fuentes  | _https://github.com/jpexposito/docencia/tree/master/Primero/ETS/PROYECTO_  |
  | Actor  |  _Bibliotecario_ |
  | Descripción |     |
  | Flujo básico |  |
  | Pre-condiciones |   |  
  | Post-condiciones  |   |  
  |  Requerimientos |  |
  |  Notas |   |
| Autor  | _Nabil L. A. (@nalleon)_ |
|Fecha | _20/12/2023_ |

  |  Caso de Uso	CU | C.U.10: Buscar por Título |
  |---|---|
  | Fuentes  | _https://github.com/jpexposito/docencia/tree/master/Primero/ETS/PROYECTO_  |
  | Actor  |  _Bibliotecario_ |
  | Descripción |     |
  | Flujo básico |  |
  | Pre-condiciones |   |  
  | Post-condiciones  |   |  
  |  Requerimientos | _C.U.1_ |
  |  Notas |   |
| Autor  | _Nabil L. A. (@nalleon)_ |
|Fecha | _20/12/2023_ |

  |  Caso de Uso	CU | C.U.11: Buscar por Autor |
  |---|---|
  | Fuentes  | _https://github.com/jpexposito/docencia/tree/master/Primero/ETS/PROYECTO_  |
  | Actor  |  _Bibliotecario_ |
  | Descripción |     |
  | Flujo básico |  |
  | Pre-condiciones |   |  
  | Post-condiciones  |   |  
  |  Requerimientos | _C.U.1_ |
  |  Notas |   |
| Autor  | _Nabil L. A. (@nalleon)_ |
|Fecha | _20/12/2023_ |

  |  Caso de Uso	CU | C.U.12: Buscar por Categoría |
  |---|---|
  | Fuentes  | _https://github.com/jpexposito/docencia/tree/master/Primero/ETS/PROYECTO_  |
  | Actor  |  _Bibliotecario_ |
  | Descripción |     |
  | Flujo básico |  |
  | Pre-condiciones |   |  
  | Post-condiciones  |   |  
  |  Requerimientos | _C.U.1_ |
  |  Notas |   |
| Autor  | _Nabil L. A. (@nalleon)_ |
|Fecha | _20/12/2023_ |

  |  Caso de Uso	CU | C.U.13: Visualizar Información|
  |---|---|
  | Fuentes  | _https://github.com/jpexposito/docencia/tree/master/Primero/ETS/PROYECTO_  |
  | Actor  |  _Bibliotecario_ |
  | Descripción |     |
  | Flujo básico |  |
  | Pre-condiciones |   |  
  | Post-condiciones  |   |  
  |  Requerimientos | _C.U.9_ |
  |  Notas |   |
| Autor  | _Nabil L. A. (@nalleon)_ |
|Fecha | _20/12/2023_ |

  |  Caso de Uso	CU | C.U.14: Modificar Información|
  |---|---|
  | Fuentes  | _https://github.com/jpexposito/docencia/tree/master/Primero/ETS/PROYECTO_  |
  | Actor  |  _Bibliotecario_ |
  | Descripción |     |
  | Flujo básico |  |
  | Pre-condiciones |   |  
  | Post-condiciones  |   |  
  |  Requerimientos | _C.U.9, C.U13_ |
  |  Notas |   |
| Autor  | _Nabil L. A. (@nalleon)_ |
|Fecha | _20/12/2023_ |


## Diagrama CU Individual
<img src=../images/diagramaindividual.png>

## Diagrama CU Final
<img src=../images/diagramafinal(1).png>
</div>