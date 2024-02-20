<div align="justify">

# Instalación del IDE IntelliJ IDEA
Nabil León Álvarez - 1º DAM (2023/2024) | 
[Vista desde el repositorio](https://github.com/nalleon/ets/tree/main/Unidad-1/tarea-intellij)

## Índice
- [Primeros pasos](#primeros-pasos)
- [Prerrequisitos](#prerrequisitos)
- [Instalación](#instalación)


## Primeros pasos
En primer lugar creamos en el repositorio un carpeta con un archivo README.md para esta tarea.
- Operaciones a realizar:

```
cd ets
cd tareas
cd Unidad-1
mkdir tarea-intellij
cd tarea-intellij
touch README.md
```
- Salida:

```
nalleon@nalleon-VirtualBox:~$ cd ets
nalleon@nalleon-VirtualBox:~/ets$ cd tareas
bash: cd: tareas: No existe el archivo o el directorio
nalleon@nalleon-VirtualBox:~/ets$ ls
images  prueba  prueba2  README.md  Unidad-1
nalleon@nalleon-VirtualBox:~/ets$ cd Unidad-1/
nalleon@nalleon-VirtualBox:~/ets/Unidad-1$ ls
README.md  tarea-jdk  tarea-maven
nalleon@nalleon-VirtualBox:~/ets/Unidad-1$ mkdir tarea-intellij
nalleon@nalleon-VirtualBox:~/ets/Unidad-1$ cd tarea-intellij
nalleon@nalleon-VirtualBox:~/ets/Unidad-1/tarea-intellij$ touch README.md
nalleon@nalleon-VirtualBox:~/ets/Unidad-1/tarea-intellij$ cd ..
nalleon@nalleon-VirtualBox:~/ets/Unidad-1$ cd ..
nalleon@nalleon-VirtualBox:~/ets$ cd ..
```

## Prerrequisitos

Para comenzar la instalación de IntelliJ debemos de comprobar si tenemos Java instalado. En nuestro caso fue instalado en una [tarea previa](https://github.com/nalleon/ets/tree/main/Unidad-1/tarea-jdk) por lo que este paso es muy simple y sencillo.

```
java -version
```

- Salida:
```
nalleon@nalleon-VirtualBox:~$ java -version
openjdk version "1.8.0_382"
OpenJDK Runtime Environment (build 1.8.0_382-8u382-ga-1~22.04.1-b05)
OpenJDK 64-Bit Server VM (build 25.382-b05, mixed mode)
```

## Instalación
Al realizar este paso nos encontramos con que "sudo" no tiene los permisos para poder realizar la instalación, es por eso por que hemos recurrido a la alternativa de descargar el paquete desde la web oficial de IntelliJ e instalarlo por línea de comando.
```
sudo tar -xzf ideaIC-2023.2.4.tar.gz -C /opt
```
Tras esto nos movemos al directorio opt, realizamos un ls para encontrar el archivo del IDE y entramos en este.

```
cd /opt
ls
cd /opt/idea-IC-232.10203.10/bin
```

Finalmente añadimos el siguiente comando para ejecutar el archivo:

```
./idea.sh
```
Tras esto IntelliJ se abrirá y podemos configurarlo para empezar a trabajar en el IDE.
- Salida:
```
nalleon@nalleon-VirtualBox:~/Descargas$ cd /opt
nalleon@nalleon-VirtualBox:/opt$ ls
apache-maven-3.8.8  idea-IC-232.10203.10  maven
nalleon@nalleon-VirtualBox:/opt$ cd /opt/idea-IC-232.10203.10/bin
nalleon@nalleon-VirtualBox:/opt/idea-IC-232.10203.10/bin
CompileCommand: exclude com/intellij/openapi/vfs/impl/FilePartNodeRoot.trieDescend bool exclude = true
oct 31, 2023 3:19:53 P. M. java.util.prefs.FileSystemPreferences$1 run
INFORMACIÓN: Created user preferences directory.
2023-10-31 15:25:15,115 [ 321386]   WARN - #c.i.c.ComponentStoreImpl - Duplicated scheme Light - old: Light, new Light
2023-10-31 15:25:15,525 [ 321796]   WARN - java.util.prefs - Prefs file removed in background /home/nalleon/.java/.userPrefs/prefs.xml
``````
