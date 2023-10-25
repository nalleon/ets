<div align="justify">

# Instalación de MAVEN en el Ubuntu
Nabil León Álvarez - 1º DAM (2023/2024) | 
[Vista desde el repositorio](https://github.com/nalleon/ets/tree/main/Unidad-1)

## Índice
- 

## Introducción
Apache Maven es una herramienta de gestión y comprensión de proyectos de código abierto que se utiliza principalmente para proyectos Java. Maven usa un modelo de objetos de proyecto (POM), que es esencialmente un archivo XML que contiene información del proyecto, detalles de configuración, dependencias del proyecto y más.

## Instalar Apache Maven

- Operaciones a realizar:
```
  sudo apt-get update
  sudo apt install maven
  mvn -version
```
- Salida:
```
nalleon@nalleon-VirtualBox:~$ sudo apt update
[sudo] contraseña para nalleon:                       
Des:1 http://security.ubuntu.com/ubuntu jammy-security InRelease [110 kB]
Ign:2 http://packages.linuxmint.com victoria InRelease                         
Des:3 http://packages.microsoft.com/repos/code stable InRelease [3569 B]       
Des:4 http://packages.linuxmint.com victoria Release [24,2 kB]          
...
nalleon@nalleon-VirtualBox:~$  sudo apt install maven
Leyendo lista de paquetes... Hecho
Creando árbol de dependencias... Hecho
Leyendo la información de estado... Hecho
...
nalleon@nalleon-VirtualBox:~$  mvn -version
Apache Maven 3.6.3
Maven home: /usr/share/maven
Java version: 1.8.0_382, vendor: Private Build, runtime: /usr/lib/jvm/java-8-openjdk-amd64/jre
Default locale: es_ES, platform encoding: UTF-8
OS name: "linux", version: "5.15.0-76-generic", arch: "amd64", family: "unix"
```
##  Instalar una versión concreta de Apache Maven