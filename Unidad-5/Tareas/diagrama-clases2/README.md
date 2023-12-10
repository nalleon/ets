
<div align="justify">

**Nabil León Álvarez - 1ºDAM | [Vista desde GitHub](https://github.com/nalleon/ets/tree/main/Unidad-5/diagrama-clases2)** 

## Índice
- [Agencia de Viajes](#agencia-de-viajes)
    - [Diagrama de Clases](#diagrama-de-clases-1)
- [Ministerio de Defensa](#ministerio-de-defensa)
    - [Diagrama de Clases](#diagrama-de-clases)
- [Alquiler de Coches en Tenerife](#agencia-de-viajes)
    - [Diagrama de Clases](#diagrama-de-clases-2)


## Agencia de Viajes
```
Una cadena de agencias de viajes desea disponer de una Base de Datos que contemple información relativa al hospedaje y vuelos de los turistas que la contratan. Los datos a tener en cuenta son:

- La cadena de agencias está compuesta por un conjunto de sucursales. Cada sucursal viene definida por el código de sucursal, dirección y teléfono.

- La cadena tiene contratados una serie de hoteles de forma exclusiva. Cada hotel estar  definido por el código de hotel, nombre, dirección, ciudad, teléfono y número de plazas disponibles.

- De igual forma, la cadena tiene contratados una serie de vuelos regulares de forma exclusiva. Cada vuelo viene definido por el número de vuelo, fecha y hora, origen y destino, plazas totales y plazas de clase turista de las que dispone.

- La información que se desea almacenar por cada turista es el código de turista, nombre y apellidos, dirección y teléfono.

Por otra parte, hay que tener en cuenta la siguiente información:

-  A la cadena de agencias le interesa conocer que sucursal ha contratado el turista.

- A la hora de viajar el turista puede elegir cualquiera de los vuelos que ofrece la cadena, y en que clase (turista o primera) desea viajar.
        
-  De igual manera, el turista se puede hospedar en cualquiera de los hoteles que ofrece la cadena, y elegir el régimen de hospedaje (media pensión o pensión completa). Siendo significativa la fecha de llegada y de partida.

```

Se pide:
- Realizar el diagrama de clases identificando: clases, propiedades, acciones, sus relaciones y la cardinalidad de estas.


## Diagrama de clases
<img src=images/agencia.png>

## Ministerio de Defensa
```
El Ministerio de Defensa desea diseñar una Base de Datos para llevar un cierto control de los soldados que realizan el servicio militar. Los datos significativos a tener en cuenta son:

- Un soldado se define por su código de soldado (único), su nombre y apellidos, y su graduación. Decide cual puede ser el código único.

- Existen varios cuarteles, cada uno se define por su código de cuartel, nombre y ubicación.

- Hay que tener en cuenta que existen diferentes cuerpos del Ejército (Infantería, Artillería, Armada, ....), y cada uno se define por un código de Cuerpo y denominación.

- Los soldados están agrupados en compañías, siendo significativa para cada una de  estas, el número de compañía y la actividad principal que realiza.   Se desea controlar los servicios que realizan los soldados (guardias, imaginarias, cuarteleros, ...), y se definen por el código de servicio y descripción. Consideraciones de diseño:

- Un soldado pertenece a un único cuerpo y a una única compañía, durante todo el servicio militar. A una compa  a pueden pertenecer soldados de diferentes cuerpos, no habiendo relación directa entre compañías y cuerpos.

- Los soldados de una misma compañía pueden estar destinados en diferentes cuarteles, es decir, una compañía puede estar ubicada en varios cuarteles, y en un cuartel puede haber varias compañías. Eso si, un soldado sólo esta en un cuartel.

- Un soldado realiza varios servicios a lo largo de la milicia. Un mismo servicio puede ser realizado por más de un soldado (con independencia de la compañía), siendo significativa la fecha de realización.
```

Se pide:
- Realizar el diagrama de clases identificando: clases, propiedades, acciones, sus relaciones y la cardinalidad de estas.


## Diagrama de clases
<img src=images/ministeriodefensa.png>

## Alquiler de Coches en Tenerife
```
Se desea diseñar un diagrama de clases sobre la información de las reservas de una empresa dedicada al alquiler de automóviles, teniendo en cuenta que:

- Un determinado cliente puede tener en un momento dado hechas varias reservas.

- De cada cliente se desean almacenar su DNI, nombre, dirección y teléfono. Además dos clientes se diferencian por un código único.

- Cada cliente puede ser avalado por otro cliente de la empresa.

- Una reserva la realiza un único cliente pero puede involucrar varios coches.

- Es importante registrar la fecha de inicio y final de la reserva, el precio del alquiler de cada uno de los coches, los litros de gasolina en el depósito en el momento de realizar la reserva, el precio total de la reserva y un indicador de si el coche o los coches han sido entregados.

- Todo coche tiene siempre asignado un determinado garaje que no puede cambiar. De cada coche se requiere la matricula, el modelo el color y la marca.

- Cada reserva se realiza en una determinada agencia.

```
Se pide:
- Realizar el diagrama de clases identificando: clases, propiedades, acciones, sus relaciones y la cardinalidad de estas.



## Diagrama de clases
<img src=images/alquiler.png>
</div>