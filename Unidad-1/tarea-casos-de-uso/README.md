<div align="justify">


## **Índice**
- [Caso práctico](#caso-práctico)
- [Actores](#actores)
- [Casos de uso](#casos-de-uso)
- [Diagrama](#diagramas)

## **Caso práctico**
```
Sistema de Gestión Hospitalaria
El sistema de gestión hospitalaria tiene como objetivo mejorar la eficiencia y coordinación de los procesos dentro de un hospital. En el sistema participan distintas personas, como son: Paciente, Médico, Enfermero, Administrador del Sistema y Recepcionista. A continuación, se presentan algunos casos de uso para este sistema:
La información que se posee de cada uno de ellos es la siguiente:
Paciente: Un individuo que busca servicios médicos en el hospital.
Médico: Profesional médico encargado de diagnosticar y tratar a los pacientes.
Enfermero: Encargado de asistir a los médicos y cuidar a los pacientes.
Administrador del Sistema: Responsable de la configuración y administración del sistema.
Recepcionista: Encargado de la recepción de pacientes y asignación de citas.
Las acciones que se realizarán en el sistema son las que siguen:
El paciente se registra en el sistema proporcionando información personal y médica.
El paciente o la recepcionista programa citas médicas para los pacientes. (Debe autenticado)
El médico realiza diagnósticos, prescribe tratamientos y registra la información médica del paciente.(Debe autenticado)
El médico y el enfermero pueden acceder y actualizar el historial médico del paciente.(Debe autenticado)
El médico asigna tareas específicas a los enfermeros relacionadas con la atención del paciente.(Debe autenticado)
El administrador del sistema realiza configuraciones y actualizaciones del sistema.(Debe autenticado)
El personal administrativo realiza tareas relacionadas con la facturación y el procesamiento del seguro médico.(Debe autenticado)
El administrador del sistema gestiona los recursos hospitalarios, como camas, equipos médicos y suministros.(Debe autenticado)
Como podemos observar, el sistema tiene distintos actores, casos de uso y relaciones entre ellos. Se pide realizar el diagrama de casos de uso, identificando: los actores, casos de uso y realizando la especificación.
```


## **Actores**
|  Actor | Paciente |
|---|---|
| Descripción  | _Un individuo que busca servicios médicos en el hospital._  |
| Características  |  |
| Relaciones | _Registra información médica, registra información personal, programa citas._  |
| Referencias | _C.U.1, C.U.13, C.U.2_ |   
|  Notas |  |
| Autor  | _Nabil León (@nalleon)_ |
|Fecha | _15/11/2023_ |

|  Atributo |||
|---|---|---|
| _Nombre_  | _Descripción_  | _Tipo_ |
| | |

|  Actor | Médico |
|---|---|
| Descripción  | _Profesional médico encargado de diagnosticar y tratar a los pacientes._  |
| Características  |  |
| Relaciones | _Asigna tareas, realiza diagnósticos, prescribe tratamientos, actualiza información, accede información._  |
| Referencias | _C.U.7, C.U.3, C.U.4, C.U.6, C.U.5_ |   
|  Notas |  |
| Autor  | _Nabil León (@nalleon)_ |
|Fecha | _15/11/2023_ |

|  Atributo |||
|---|---|---|
| _Nombre_  | _Descripción_  | _Tipo_ |
| | |

|  Actor | Enfermero |
|---|---|
| Descripción  | _Encargado de asistir a los médicos y cuidar a los pacientes._  |
| Características  |  |
| Relaciones | _Actualiza información, accede información._  |
| Referencias | _C.U.10, C.U.11, C.U.12_ |   
|  Notas |  |
| Autor  | _Nabil León (@nalleon)_ |
|Fecha | _15/11/2023_ |

|  Atributo |||
|---|---|---|
| _Nombre_  | _Descripción_  | _Tipo_ |
| | |

|  Actor | Administrador del Sistema |
|---|---|
| Descripción  | _Responsable de la configuración y administración del sistema._  |
| Características  |  |
| Relaciones | _Gestiona recursos hospitalarios, configuraciones del sistema, actualizaciones del sistema._  |
| Referencias | _C.U.10, C.U.11, C.U.12_ |   
|  Notas |  |
| Autor  | _Nabil León (@nalleon)_ |
|Fecha | _15/11/2023_ |

|  Atributo |||
|---|---|---|
| _Nombre_  | _Descripción_  | _Tipo_ |
| | |

|  Actor | Recepcionista |
|---|---|
| Descripción  | _Encargado de la recepción de pacientes y asignación de citas._  |
| Características  |  |
| Relaciones | _Programa citas, realiza facturación, procesamiento seguro médico._  |
| Referencias | _C.U.2,, C.U.8,  C.U.9_ |   
|  Notas |  |
| Autor  | _Nabil León (@nalleon)_ |
|Fecha | _15/11/2023_ |

|  Atributo |||
|---|---|---|
| _Nombre_  | _Descripción_  | _Tipo_ |
| | |

## **Casos de uso**
  |  Caso de Uso	CU | XXX  |
  |---|---|
  | Fuentes  | _Documento que sustenta el caso de uso_  |
  | Actor  |  _Actores que participan en el caso de uso_ |
  | Descripción | _Descripción del caso de uso_  |
  | Flujo básico | _Descripción paso a paso de la ejecución. (1->2->3.)_ |
  | Pre-condiciones | _Autenticar_  |  
  | Post-condiciones  | _Que debe ocurrir con posterioridad_  |  
  |  Requerimientos | _Que debe de exister para que el caso de uso se ejecute. Ej: Tarjeta de crédito_  |
  |  Notas |   |
| Autor  | _Nabil León (@nalleon)_ |
|Fecha | _15/11/2023_ |


  ## **Diagrama**
</div>