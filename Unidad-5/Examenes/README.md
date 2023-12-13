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

- Clases: 
```code
Class Usuario:
    private int nombre;
    private String correoElec;
    private int cantidadMeGustas;

 - Constructores:
      public Usuario (){}

    public Usuario(int nombre) {
        this.nombre = nombre;
    }

    public Usuario(int nombre, String correoElec) {
        this.nombre = nombre;
        this.correoElec = correoElec;
    }

    public Usuario(int nombre, String correoElec, int cantidadMeGustas) {
        this.nombre = nombre;
        this.correoElec = correoElec;
        this.cantidadMeGustas = cantidadMeGustas;
    }


 - Gettes/Setters:
    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public String getCorreoElec() {
        return correoElec;
    }

    public void setCorreoElec(String correoElec) {
        this.correoElec = correoElec;
    }

    public int getCantidadMeGustas() {
        return cantidadMeGustas;
    }

    public void setCantidadMeGustas(int cantidadMeGustas) {
        this.cantidadMeGustas = cantidadMeGustas;
    }

public class Perfiles {

    private  String biografia;
    private String fotoPerfil;
    private int cantidadPerfiles;

    public Perfiles() {}
    public Perfiles(String biografia) {
        this.biografia = biografia;
    }

    public Perfiles(String biografia, String fotoPerfil) {
        this.biografia = biografia;
        this.fotoPerfil = fotoPerfil;
    }

    public Perfiles(String biografia, String fotoPerfil, int cantidadPerfiles) {
        this.biografia = biografia;
        this.fotoPerfil = fotoPerfil;
        this.cantidadPerfiles = cantidadPerfiles;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public String getFotoPerfil() {
        return fotoPerfil;
    }

    public void setFotoPerfil(String fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }

    public int getCantidadPerfiles() {
        return cantidadPerfiles;
    }

    public void setCantidadPerfiles(int cantidadPerfiles) {
        this.cantidadPerfiles = cantidadPerfiles;
    }


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
Usuario:
private int nombre;
private String correoElec;
private int cantidadMeGustas;
private seguidores;
private publicaciones;
private comentarios;
 - Gettes/Setters:

    
```


## Diagrama de Clases:
<img src=images/diagramaReservaVuelos.png>

</div>