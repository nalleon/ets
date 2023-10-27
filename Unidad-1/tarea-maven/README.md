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

```
nalleon@nalleon-VirtualBox:~$ wget https://www.apache.org/dist/maven/maven-3/3.8.6/binaries/apache-maven-3.8.6-bin.tar.gz -P /tmp
--2023-10-27 18:47:14--  https://www.apache.org/dist/maven/maven-3/3.8.6/binaries/apache-maven-3.8.6-bin.tar.gz
Resolviendo www.apache.org (www.apache.org)... falló: Nombre o servicio desconocido.
wget: no se pudo resolver la dirección del equipo ‘www.apache.org’
nalleon@nalleon-VirtualBox:~$ wget https://www.apache.org/dist/maven/maven-3/3.8.8/binaries/apache-maven-3.8.8-bin.tar.gz -P /tmp
--2023-10-27 18:52:40--  https://www.apache.org/dist/maven/maven-3/3.8.8/binaries/apache-maven-3.8.8-bin.tar.gz
Resolviendo www.apache.org (www.apache.org)... 151.101.2.132, 2a04:4e42::644
Conectando con www.apache.org (www.apache.org)[151.101.2.132]:443... conectado.
Petición HTTP enviada, esperando respuesta... 302 Found
Ubicación: https://downloads.apache.org/maven/maven-3/3.8.8/binaries/apache-maven-3.8.8-bin.tar.gz [siguiente]
--2023-10-27 18:52:40--  https://downloads.apache.org/maven/maven-3/3.8.8/binaries/apache-maven-3.8.8-bin.tar.gz
Resolviendo downloads.apache.org (downloads.apache.org)... 135.181.214.104, 88.99.95.219, 2a01:4f9:3a:2c57::2, ...
Conectando con downloads.apache.org (downloads.apache.org)[135.181.214.104]:443... conectado.
Petición HTTP enviada, esperando respuesta... 200 OK
Longitud: 8296049 (7,9M) [application/x-gzip]
Guardando como: ‘/tmp/apache-maven-3.8.8-bin.tar.gz’

apache-maven-3.8.8- 100%[===================>]   7,91M  4,41MB/s    en 1,8s    

2023-10-27 18:52:43 (4,41 MB/s) - ‘/tmp/apache-maven-3.8.8-bin.tar.gz’ guardado [8296049/8296049]

nalleon@nalleon-VirtualBox:~$ sudo tar xf /tmp/apache-maven-*.tar.gz -C /opt
[sudo] contraseña para nalleon:                       
nalleon@nalleon-VirtualBox:~$ sudo ln -s /opt/apache-maven-3.8.6 /opt/maven
nalleon@nalleon-VirtualBox:~$ sudo ln -s /opt/apache-maven-3.8.8 /opt/maven
ln: fallo al crear el enlace simbólico '/opt/maven': El archivo ya existe
nalleon@nalleon-VirtualBox:~$ sudo nano /etc/profile.d/maven.sh
nalleon@nalleon-VirtualBox:~$  sudo chmod +x /etc/profile.d/maven.sh
nalleon@nalleon-VirtualBox:~$  source /etc/profile.d/maven.sh
```

## Verificar instalación

```
nalleon@nalleon-VirtualBox:~$ mvn -version
Apache Maven 3.6.3
Maven home: /usr/share/maven
Java version: 1.8.0_382, vendor: Private Build, runtime: /usr/lib/jvm/java-8-openjdk-amd64/jre
Default locale: es_ES, platform encoding: UTF-8
OS name: "linux", version: "5.15.0-76-generic", arch: "amd64", family: "unix"
nalleon@nalleon-VirtualBox:~$ 
```