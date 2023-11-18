<div align="justify">

**Nabil León Álvarez - 1ºDAM**

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
  |  Caso de Uso	CU | C.U.1: Registra información medica  |
  |---|---|
  | Fuentes  | _"El paciente se registra en el sistema proporcionando información personal y médica."_  |
  | Actor  |  _Paciente_ |
  | Descripción | _Se registran los datos médicos del paciente._  |
  | Flujo básico | 1. _El paciente registra sus datos médicos para solicitar servicios hospitalarios_ |
  | Pre-condiciones |   |  
  | Post-condiciones  |   |  
  |  Requerimientos |  |
  |  Notas |   |
| Autor  | _Nabil León (@nalleon)_ |
|Fecha | _15/11/2023_ |

  |  Caso de Uso	CU | C.U.2: Registra información personal  |
  |---|---|
  | Fuentes  | _"El paciente se registra en el sistema proporcionando información personal y médica."_  |
  | Actor  |  _Paciente_ |
  | Descripción | _Se registran los datos personales del paciente._  |
  | Flujo básico | 1. _El paciente registra sus datos personales para solicitar servicios hospitalarios_ |
  | Pre-condiciones |   |  
  | Post-condiciones  |   |  
  |  Requerimientos |  |
  |  Notas |   |
| Autor  | _Nabil León (@nalleon)_ |
|Fecha | _15/11/2023_ |

  |  Caso de Uso	CU | C.U.3: Programa citas  |
  |---|---|
  | Fuentes  | _"El paciente o la recepcionista programa citas médicas para los pacientes."_  |
  | Actor  |  _Paciente, Recepcionista_ |
  | Descripción | _El paciente pide una cita la cual puede ser programada por él o por la recepcionista._  |
  | Flujo básico | 1. _La recepcionista se autentica en el sistema._ 2. _Se programa la cita._ |
  | Pre-condiciones | _Autenticación de la recepcionista_  |  
  | Post-condiciones  |   |  
  |  Requerimientos | _Autenticación de la recepcionista. Ej: DNI_  |
  |  Notas |   |
| Autor  | _Nabil León (@nalleon)_ |
|Fecha | _15/11/2023_ |


  |  Caso de Uso	CU | C.U.4:  Realiza diagnosticos  |
  |---|---|
  | Fuentes  | _"El médico realiza diagnósticos, prescribe tratamientos y registra la información médica del paciente."_  |
  | Actor  |  _Médico_ |
  | Descripción | _Se realizan diagnósticos del paciente._  |
  | Flujo básico | 1. _El médico se autentica en el sistema._ 2. _Se realiza el diagnóstico del paciente._|
  | Pre-condiciones | _Autenticación del médico._  |  
  | Post-condiciones  |   |  
  |  Requerimientos | _Autenticación de médico. Ej: DNI_  |
  |  Notas |   |
| Autor  | _Nabil León (@nalleon)_ |
|Fecha | _15/11/2023_ |


  |  Caso de Uso	CU | C.U.5:  Prescribe tratamientos  |
  |---|---|
  | Fuentes  | _"El médico realiza diagnósticos, prescribe tratamientos y registra la información médica del paciente."_  |
  | Actor  |  _Médico_ |
  | Descripción | _Se receta un tratamiento para el paciente._  |
  | Flujo básico | 1. _Se prescribe el tratamiento de un paciente._ |
 | Pre-condiciones | _Autenticación del médico._  |  
  | Post-condiciones  |   |  
  |  Requerimientos | _Autenticación de médico. Ej: DNI._  |
  |  Notas |   |
| Autor  | _Nabil León (@nalleon)_ |
|Fecha | _15/11/2023_ |

  |  Caso de Uso	CU | C.U.6: Accede  historial médico  |
  |---|---|
  | Fuentes  | _"El médico y el enfermero pueden acceder y actualizar el historial médico del paciente."_  |
  | Actor  |  _Médico, Enfermero_ |
  | Descripción | _Se accede al historial médico del paciente._  |
  | Flujo básico | 1. _Acceso al historial médico de un paciente._ |
  | Pre-condiciones | _Autenticación del médico._  |  
  | Post-condiciones  |   |  
  |  Requerimientos | _Autenticación de médico. Ej: DNI._  |
  |  Notas |   |
  | Autor  | _Nabil León (@nalleon)_ |
  |Fecha | _15/11/2023_ |

  |  Caso de Uso	CU | C.U.7: Actualiza historial médico  |
  |---|---|
  | Fuentes  | _"El médico y el enfermero pueden acceder y actualizar el historial médico del paciente."_  |
  | Actor  | _Médico, Enfermero_ |
  | Descripción | _Se actualizan los datos médicos del paciente._  |
  | Flujo básico | 1. _El médico o el enfermero actualiza el historial de un paciente._ |
  | Pre-condiciones | _Autenticación del médico o del enfermero._  |  
  | Post-condiciones  |   |  
  |  Requerimientos | _Autenticación del médico o del enfermero. Ej: DNI._  |
  |  Notas |   |
  | Autor  | _Nabil León (@nalleon)_ |
  |Fecha | _15/11/2023_ |

  |  Caso de Uso	CU | C.U.8: Asigna tareas especificas  |
  |---|---|
  | Fuentes  | _"El médico asigna tareas específicas a los enfermeros relacionadas con la atención del paciente."_  |
  | Actor  |  _Médico_ |
  | Descripción | _Se asigna una tarea a un enfermero._  |
  | Flujo básico | 1. _El médico ordena a un enfermero realizar una tarea._ |
  | Pre-condiciones |_Autenticación del médico._  |  
  | Post-condiciones  |   |  
  |  Requerimientos | _Autenticación del médico. Ej: DNI._  |
  |  Notas |   |
| Autor  | _Nabil León (@nalleon)_ |
|Fecha | _15/11/2023_ |

  |  Caso de Uso	CU | C.U.9: Realiza facturación  |
  |---|---|
  | Fuentes  | _"El personal administrativo realiza tareas relacionadas con la facturación y el procesamiento del seguro médico."_  |
  | Actor  |  _Recepcionista_ |
  | Descripción | _La recepcionista factura el seguro médico de un paciente._  |
  | Flujo básico | 1. _Se realiza la facturación del seguro médico._ |
  | Pre-condiciones | _Autenticación de la recepcionista._  |  
  | Post-condiciones  |   |  
  |  Requerimientos | _Autenticación de recepcionista. Ej: DNI_  |
  |  Notas |   |
| Autor  | _Nabil León (@nalleon)_ |
|Fecha | _15/11/2023_ |

  |  Caso de Uso CU | C.U.10:  Procesamiento seguro médico   |
  |---|---|
  | Fuentes  | _"El personal administrativo realiza tareas relacionadas con la facturación y el procesamiento del seguro médico."_  |
  | Actor  |  _Recepcionista_ |
  | Descripción | _La recepcionista realiza el procesamiento del seguro médico del paciente._  |
  | Flujo básico | 1. _Se procesa el seguro médico del paciente._ |
  | Pre-condiciones | _Autenticación de la recepcionista._  |  
  | Post-condiciones  |   |  
  |  Requerimientos | _Autenticación de la recepcionista. Ej: DNI_  |
  |  Notas |   |
| Autor  | _Nabil León (@nalleon)_ |
|Fecha | _15/11/2023_ |

  |  Caso de Uso CU | C.U.11: Gestiona recursos hospitalarios   |
  |---|---|
  | Fuentes  | _"El administrador del sistema gestiona los recursos hospitalarios, como camas, equipos médicos y suministros."_  |
  | Actor  |  _Administrador del Sistema_ |
  | Descripción | _Se realiza la gestión de los recursos del hospital._  |
  | Flujo básico | 1. _Se gestionan los recurso hospitalarios (camas, equipos médicos y suministros.)_ |
  | Pre-condiciones | _Autenticación del administrador del sistema._  |  
  | Post-condiciones  |   |  
  |  Requerimientos | _Autenticación del administrador del sistema. Ej: DNI_  |
  |  Notas |   |
| Autor  | _Nabil León (@nalleon)_ |
|Fecha | _15/11/2023_ |

  |  Caso de Uso	CU | C.U.12: Configuraciones del sistema   |
  |---|---|
  | Fuentes  | _"El administrador del sistema realiza configuraciones y actualizaciones del sistema."_  |
  | Actor  |  _Administrador del Sistema_ |
 | Descripción | _Se realiza la configuración del sistema del hospital._  |
  | Flujo básico | 1. _El administrador configura el sistema del hospital._ |
 | Pre-condiciones | _Autenticación del administrador del sistema._  |  
  | Post-condiciones  |   |  
  |  Requerimientos | _Autenticación del administrador del sistema. Ej: DNI_  |
  |  Notas |   |
| Autor  | _Nabil León (@nalleon)_ |
|Fecha | _15/11/2023_ |

  |  Caso de Uso	CU | C.U.13: Actualizaciones del sistema   |
  |---|---|
  | Fuentes  | _"El administrador del sistema realiza configuraciones y actualizaciones del sistema."_  |
  | Actor  |  _Administrador del Sistema_ |
  | Descripción | _Se realiza la actualización del sistema del hospital._ |
  | Flujo básico |  1. _El administrador actualiza el sistema del hospital._ |
  | Pre-condiciones | _Autenticación del administrador del sistema._  |  
  | Post-condiciones  |   |  
  |  Requerimientos | _Autenticación del administrador del sistema. Ej: DNI_  |
  |  Notas |   |
| Autor  | _Nabil León (@nalleon)_ |
|Fecha | _15/11/2023_ |

  ## **Diagrama**

</div>