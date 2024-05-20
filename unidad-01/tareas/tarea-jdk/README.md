<div align="justify">

# Instalación de JDK en el Ubuntu
Nabil León Álvarez - 1º DAM (2023/2024) | 
[Vista desde el repositorio](https://github.com/nalleon/ets/tree/main/Unidad-1/tarea-jdk)

## Índice
- [Introducción](#introducción)
- [Realizar la instalación de Java en el SO](#realizar-la-instalación-de-java-en-el-so)
- [Instalar una versión específica de Java](#instalar-una-versión-específica-de-java)
- [Listar la versiones de OpenJDK instaladas](#listar-la-versiones-de-openjdk-instaladas)
- [Actualización de las variables de entorno](#actualización-de-las-variables-de-entorno)

## Introducción
Java sin dudas es un lenguaje de programación que es utilizado para diversos propósitos y es un complemento casi esencial para la ejecución y funcionamiento de diversas herramientas, la instalación de java es prácticamente una tarea esencial después de haber realizado la instalación de este.

Es por ello que en esta ocasión compartiré con ustedes un sencillo tutorial de como instalar Java en nuestro sistema con el JDK el cual es un entorno de desarrollo y el entorno de ejecución JRE.

## Realizar la instalación de Java en el SO 
Para comenzar actualizaremos el sistema. Seguidamente instalaremos java y haremos una combrabación de este.
- Operaciones a realizar:
```
  sudo apt-get update
  sudo apt-get install default-jdk
  java --version
```
- Salida:
```
nalleon@nalleon-VirtualBox:~$   sudo apt-get update
[sudo] contraseña para nalleon:                  	 
Ign:1 http://packages.linuxmint.com victoria InRelease
Obj:2 http://archive.ubuntu.com/ubuntu jammy InRelease
Des:3 http://security.ubuntu.com/ubuntu jammy-security InRelease [110 kB] 	 
...
nalleon@nalleon-VirtualBox:~$   sudo apt-get install default-jdk
Leyendo lista de paquetes... Hecho
Creando árbol de dependencias... Hecho
Leyendo la información de estado... Hecho
Se instalarán los siguientes paquetes adicionales:
  default-jdk-headless libice-dev libpthread-stubs0-dev libsm-dev libx11-6
  libx11-dev libx11-xcb1 libxau-dev libxcb1-dev libxdmcp-dev libxt-dev
  openjdk-11-jdk openjdk-11-jdk-headless openjdk-11-jre
  openjdk-11-jre-headless x11proto-dev xorg-sgml-doctools xtrans-dev
Paquetes sugeridos:
  libice-doc libsm-doc libx11-doc libxcb-doc libxt-doc openjdk-11-demo
  openjdk-11-source visualvm fonts-dejavu-extra fonts-ipafont-gothic
  fonts-ipafont-mincho fonts-wqy-microhei | fonts-wqy-zenhei
Paquetes recomendados:
  libatk-wrapper-java-jni fonts-dejavu-extra
Se instalarán los siguientes paquetes NUEVOS:
  default-jdk default-jdk-headless libice-dev libpthread-stubs0-dev libsm-dev
  libx11-dev libxau-dev libxcb1-dev libxdmcp-dev libxt-dev openjdk-11-jdk
  openjdk-11-jdk-headless x11proto-dev xorg-sgml-doctools xtrans-dev
Se actualizarán los siguientes paquetes:
  libx11-6 libx11-xcb1 openjdk-11-jre openjdk-11-jre-headless
4 actualizados, 15 nuevos se instalarán, 0 para eliminar y 211 no actualizados.
Se necesita descargar 120 MB de archivos.
Se utilizarán 90,6 MB de espacio de disco adicional después de esta operación.
¿Desea continuar? [S/n] S
...
nalleon@nalleon-VirtualBox:~$   java --version
openjdk 11.0.20.1 2023-08-24
OpenJDK Runtime Environment (build 11.0.20.1+1-post-Ubuntu-0ubuntu122.04)
OpenJDK 64-Bit Server VM (build 11.0.20.1+1-post-Ubuntu-0ubuntu122.04, mixed mode, sharing)
```

## Instalar una versión específica de Java
Continuaremos instalando las versiones 11, 13 y 8 de Java además de comprobandolas.

- Operaciones a realizar:
```
sudo apt install openjdk-11-jdk
sudo apt install openjdk-13-jdk
sudo apt install openjdk-8-jdk
  java --version
```

- Salida:
```
nalleon@nalleon-VirtualBox:~$ sudo apt install openjdk-11-jdk
Leyendo lista de paquetes... Hecho
Creando árbol de dependencias... Hecho
Leyendo la información de estado... Hecho
openjdk-11-jdk ya está en su versión más reciente (11.0.20.1+1-0ubuntu1~22.04).
fijado openjdk-11-jdk como instalado manualmente.
0 actualizados, 0 nuevos se instalarán, 0 para eliminar y 211 no actualizados.
nalleon@nalleon-VirtualBox:~$ sudo apt install openjdk-13-jdk
Leyendo lista de paquetes... Hecho
Creando árbol de dependencias... Hecho
Leyendo la información de estado... Hecho
E: No se ha podido localizar el paquete openjdk-13-jdk
nalleon@nalleon-VirtualBox:~$ sudo apt install openjdk-8-jdk
Leyendo lista de paquetes... Hecho
Creando árbol de dependencias... Hecho
Leyendo la información de estado... Hecho

nalleon@nalleon-VirtualBox:~$   java --version
openjdk 11.0.20.1 2023-08-24
OpenJDK Runtime Environment (build 11.0.20.1+1-post-Ubuntu-0ubuntu122.04)
OpenJDK 64-Bit Server VM (build 11.0.20.1+1-post-Ubuntu-0ubuntu122.04, mixed mode, sharing)
nalleon@nalleon-VirtualBox:~$
```
- Nota: 
```
La version 13 jdk no exite.
```

## Listar la versiones de OpenJDK instaladas 
Al java 8 no ejecutarse directamente, debemos de confugurar las variables de entorno. Para ello comenzaremos verificando la descarga de las versiones del jdk.

- Operaciones a realizar:
```
 ls /usr/lib/jvm
```

- Salida:
```
nalleon@nalleon-VirtualBox:~$  ls /usr/lib/jvm
default-java               java-11-openjdk-amd64     java-8-openjdk-amd64
java-1.11.0-openjdk-amd64  java-1.8.0-openjdk-amd64  openjdk-11
```
## Actualización de las variables de entorno
Seguidamente editaremos el fichero profile con el siguiente comando:
- Operaciones a realizar:
```
sudo update-alternatives --config java
```

- Salida:
```
nalleon@nalleon-VirtualBox:~$ sudo update-alternatives --config java
Existen 2 opciones para la alternativa java (que provee /usr/bin/java).

  Selección   Ruta                                        	Prioridad  Estado
------------------------------------------------------------
* 0        	/usr/lib/jvm/java-11-openjdk-amd64/bin/java  	1111  	modo automático
  1        	/usr/lib/jvm/java-11-openjdk-amd64/bin/java  	1111  	modo manual
  2        	/usr/lib/jvm/java-8-openjdk-amd64/jre/bin/java   1081  	modo manual

Pulse <Intro> para mantener el valor por omisión [*] o pulse un número de selección: 1081
Existen 2 opciones para la alternativa java (que provee /usr/bin/java).

  Selección   Ruta                                        	Prioridad  Estado
------------------------------------------------------------
* 0        	/usr/lib/jvm/java-11-openjdk-amd64/bin/java  	1111  	modo automático
  1        	/usr/lib/jvm/java-11-openjdk-amd64/bin/java  	1111  	modo manual
  2        	/usr/lib/jvm/java-8-openjdk-amd64/jre/bin/java   1081  	modo manual

Pulse <Intro> para mantener el valor por omisión [*] o pulse un número de selección: 2
update-alternatives: utilizando /usr/lib/jvm/java-8-openjdk-amd64/jre/bin/java para proveer /usr/bin/java (java) en modo manual
```

De forma alternativa, podemos utilizar el editor de texto nano en /etc/profile.d/java.sh y añadimos el siguiente código dentro:

- Operaciones a realizar:
```
sudo nano /etc/profile.d/java.sh
# Java version
JAVA_HOME=/usr/lib/jvm/(SELECCIONA UN PATH DE LA VERSION QUE DESEAS QUE SE EJECUTE)
PATH=$PATH:$HOME/bin:$JAVA_HOME/bin
export JAVA_HOME
export JRE_HOME
export PATH
```
Además, harenos que el script sea ejecutable y cargaremos las variables de entorno.
```
sudo chmod +x /etc/profile.d/java.sh
source /etc/profile.d/java.sh
```

- Salida:
```
nalleon@nalleon-VirtualBox:~$ sudo nano /etc/profile.d/java.sh
[sudo] contraseña para nalleon:                       
  GNU nano 6.2                 /etc/profile.d/java.sh                           
 # Java version
 JAVA_HOME=/usr/lib/jvm/java-8-openjdk-amd64
 PATH=$PATH:$HOME/bin:$JAVA_HOME/bin
 export JAVA_HOME
 export JRE_HOME
 export PATH
nalleon@nalleon-VirtualBox:~$ sudo chmod +x /etc/profile.d/java.sh
nalleon@nalleon-VirtualBox:~$ source /etc/profile.d/java.sh

```

</div>