<div allign="justify">

Nabil León Álvarez 1ºDAM - Vista desde [GitHub](https://github/nalleon/ets/Unidad-5/Examenes)
## Red Social
```
Diseñe un diagrama de clases para un sistema de red social. El sistema debe permitir a los usuarios crear perfiles, publicar contenido, seguir a otros usuarios y dar "me gusta" a las publicaciones. Teniendo en cuenta la siguiente información:

    Representa a los usuarios del sistema, con los siguientes atributos: nombre de usuario, correo electrónico y lista de amigos (Otros usuarios).
    Representa las publicaciones realizadas por los usuarios, con atributos como contenido, fecha de publicación y cantidad de "me gusta". Ten en cuenta que un usuario realizará publicaciones.
    Cada usuario debe de poseer un perfil, que contiene información adicional sobre cada usuario, como la biografía y la foto de perfil.
    Se debe de gestionar la creación de perfiles de usuario, la publicación de contenido y las interacciones entre usuarios.
    Representa los comentarios realizados por los usuarios en las publicaciones, con atributos como texto y fecha. Ten en cuenta que un usuario podrá realizar comentarios sobre las publicaciones.
    Se debe de tener en cuenta los seguidores entre usuarios. Es decir, dos usuarios serán amigos si uno u otro se sigue.
```

- Pseudocódigo:


 ```
La clase usuario recopila el nombre, correo electronico para crear el perfil, la cantidad de megustas que ha dado. Un usuario tiene seguidores y si este les sigue tambien son considerados amigos.

El usuario además crea publicaciones e interactuar con estas (dar me gustas, realizar comentarios), y puede crearse mas de ún perfil.


La clase comentario debe de contener tanto el contenido de estos tanto como la fecha de su publciación.

La clase perfil contine información extra acerca del usuario, con una biograia, su foto de perfil y si la cantidad de estos.

La clase publicacion recoge como propiedades el contenido que un usuario suba así como la fecha donde este se subió y la cantidad de estos por usuario.

```


## Diagrama de Clases:
<img src=images/diagramaRedSocial.png>


## Reservas Aeropuerto
```
Diseñe un diagrama de clases para un sistema de reservas de vuelos. El sistema debe permitir a los usuarios buscar vuelos, realizar reservas, gestionar perfiles y visualizar información sobre aerolíneas y aeropuertos. Ten en cuenta la siguiente información:

    Representa a los usuarios del sistema, con atributos como nombre, número de teléfono y lista de reservas.
    Representa los vuelos disponibles, con atributos como aerolínea, origen, destino, fecha y hora.
    Almacena la información de las reservas realizadas por los usuarios, con detalles como el número de asientos reservados y el estado de la reserva.
    Representa las aerolíneas que operan en el sistema, con atributos como nombre y lista de vuelos.
    Representa la información de los aeropuertos, como nombre, ubicación y lista de vuelos asociados.
    Almacena información adicional sobre los usuarios, como preferencias de asientos y frecuencia de viaje, siendo este su perfil.
```

- Pseudocódigo:
```code
La clase Usuario tiene como propiedades privadas el nombre de este, su numero de telefono y sus reservas. 

La clase perfil es una asociacion del usuario puesto que este rttiene información relacionada como el tipo de asientpo que este ha seleccionada y su frecuencia de vuelo.

La clase reservas por su parte tiene como propiedades el numero de asientos y el estado de esta, es decir si esta ha sido concedida o no.

Por otro lado, la clase Aeropuerto tiene el nombre de este y su ubicacion así como una lista de los vuelos.

La clase Vuelos tiene tanto el origen como el destino y la fecha de estos. Tambien la lista de la aerolinea de donde pertenecen.

Finalmente la clase aerolínea tiene su nombre.
```


## Diagrama de Clases:
<img src=images/diagramaReservaVuelos.png>

</div>