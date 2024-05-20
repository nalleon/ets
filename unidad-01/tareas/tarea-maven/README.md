<div align="justify">

# Instalación de MAVEN en el Ubuntu
Nabil León Álvarez - 1º DAM (2023/2024) | 
[Vista desde el repositorio](https://github.com/nalleon/ets/tree/main/Unidad-1/tarea-maven)

## Índice
- [Introducción](#introducción)
- [Instalar Apache Maven](#instalar-apache-maven)
- [Instalar una versión concreta de Apache Maven](#instalar-una-versión-concreta-de-apache-maven)
- [Verificar instalación](#verificar-instalación)

## Introducción
Apache Maven es una herramienta de gestión y comprensión de proyectos de código abierto que se utiliza principalmente para proyectos Java. Maven usa un modelo de objetos de proyecto (POM), que es esencialmente un archivo XML que contiene información del proyecto, detalles de configuración, dependencias del proyecto y más.

## Instalar Apache Maven
La instalación de Maven en Ubunto utilizando apt es un proceso simple y directo.

En primer lugar debemos de actualizar el índice del paquete. Seguidamente instalamos Maven y comprobamos su instalacion. Para ello utilizaremos los siguientes comandos: 

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

Nuestro primer paso sera descargar la ultima versión de Apache Maven desde la página oficial. Esta sera descargada en el directorio /tmp:

- Operaciones a realizar:
```
wget https://www.apache.org/dist/maven/maven-3/3.8.6/binaries/apache-maven-3.8.8-bin.tar.gz -P /tmp
```

Una vez que la descarga haya finalizado, descomdescomprimiremos el archivo en la carpeta /opt.
```
sudo tar xf /tmp/apache-maven-*.tar.gz -C /opt
```
De cara a obtener un mayor control sobre las versiones y actualizaciones de Maven crearemos un enlace simbolico que apunte al directorio de instalación de Maven:

```
sudo ln -s /opt/apache-maven-3.8.6 /opt/maven
```
Estableceremos variables de entorno. Para ello abriremos el editor de texto y crearemos un nuevo archivo con el nomnre de mavenenv.sh en el directorio /etc/profile.d/
```
sudo nano /etc/profile.d/maven.sh
    export M2_HOME=/opt/maven
    export MAVEN_HOME=/opt/maven
    export PATH=${M2_HOME}/bin:${PATH}
```
Guardamos antes de cerrar el archivo el archivo. Este script se utilizará al iniciar el shell.

A continuación, haremos que el script sea ejecutable utilizando el comando chmod. 
```
 sudo chmod +x /etc/profile.d/maven.sh
```
Finalmente, cargaremos las variables de entorno haciendo uso del comando de source.
```
 source /etc/profile.d/maven.sh
```

- Salida:
```
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
Para comprobar que Maven se ha instalado de manera correcta usaremos el siguiente comando que imprimira la versión de Maven:

- Operaciones a realizar:
```
mvn -version
```

- Salida:
```
nalleon@nalleon-VirtualBox:~$ mvn -version
Apache Maven 3.6.3
Maven home: /usr/share/maven
Java version: 1.8.0_382, vendor: Private Build, runtime: /usr/lib/jvm/java-8-openjdk-amd64/jre
Default locale: es_ES, platform encoding: UTF-8
OS name: "linux", version: "5.15.0-76-generic", arch: "amd64", family: "unix"
nalleon@nalleon-VirtualBox:~$ 
```