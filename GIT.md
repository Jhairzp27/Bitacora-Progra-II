# GIT

**Fecha:** 9 de noviembre de 2023

## ¿Qué es GitBash?

Es una aplicación de línea de comandos que proporciona una interfaz de usuario para el sistema de control de versiones Git

## ¿Qué es Git?

Es un sistema de control de versiones distribuido (VCS) que permite a los desarrolladores rastrear los cambios en los archivos y el código fuente. Permitiendo hacer un seguimiento del código.

## ¿Qué es Linux?

Es un sistema operativo de código abierto y gratuito que se basa en el núcleo Linux. El núcleo Linux es el software que gestiona directamente el hardware de un sistema y sus recursos, como la CPU, la memoria y el almacenamiento

---
**Dato curioso:** Linux  y Gitbash fue creado por Linus Torvalds.

Por ello GitBash es un acercamiento a Linux.

---

## **Introducción de Linux**

|COMANDOS| FUNCIONALIDAD|
|---|---|
|***pwd***|ver el directorio actual (dir. actual)|
|***tab***|Autocompletar|
|***cd***|Volver al directorio, con **ctrl+a, e** edita el nombre el fichero|
|***cd "nombreArchivo"/***|Entra al archivo|
|***cd ..***|Entra al archivo **ctrl+a, e** edita el nombre el fichero|
|***ls***|Listado del fichero con **ctrl +r** (buscar)|
|***ls-l***|Listado del fichero (vertical) **ctrl +r** (buscar)|
|***touch file.txt***|Crea un fichero|
|***echo "Texto a imprimir" >> fileNAME.extension***|Se utiliza para imprimir texto en la terminal de Git Bash|
|***cat file.txt***|Permite visualizar el contenido de los archivos en la terminal de Git Bash. **ctrl + l o clear** (limpiar la terminal)|
|***rm archivo.txt***| Elimina el archivo|
|***rm -r carpeta1***|Eliminar un directorio|
|***rm archivo1.txt archivo2.txt***|Eliminar varios archivos|
|***rm -r carpeta1/***|Eliminar un archivo de forma recursiva|
|***rm -i archivo.txt***|Eliminar un archivo de forma segura|
|***cp file.txt newfile.txt***|Copiar |
|***mv file.txt newfile.txt***|Renombrar|
|***ls -a***|Se utiliza para listar todos los archivos y directorios, incluidos los archivos ocultos, en la terminal|

## **Intrducción Git**

|COMANDOS| FUNCIONALIDAD|
|---|---|
|***git config --global user.name "nombre"***|Crea tu usuario con el nombre que le indiques|
|***git config --global user.email [email]***|Valida tus credenciales con tu email|
|***git config user.name***|Verificar la **identidad** del usuario|
|***git config user.email***|Verificar el **email** del usuario|
|***git init***|Inciacializar repositorio se liga con el branch master|
|***git add***| Añadir todo lo que hay en el directorio actual|
|***git add fileName.ext***|Agrega el documento indicado|
|***git status***|Revisa las condiciones en las que estás trabajando, es decir *(commits or branch master)*.|
|***git reset***|Se utiliza para restablecer el estado del repositorio de Git a un punto anterior en el historial. Puede utilizarse para deshacer cambios locales, descartar commits o volver a una rama anterior.|
|***git rm --cached git rm --cached***|Esto para quitar el documento seleccionado que se agregó|
|***git commit-m "C1: prj-start"***|Inicia el commit,  es una instantánea de los cambios realizados en un proyecto. Cada commit contiene archivos modificados,cambios realizados en cada archivo, mensaje de confirmación|
|***git branch -m"master"***|Renombrar la rama master a "main"|
|***git log***|Para ver el historial de cambios|

Cada que se agrega un archivo, estos se agregan a una rama main, esto se llama **BRANCH**

    >-------- git:(master / main)
            Archivos a comitear
            o
            Archivos no agregados

#### Commit

El nombre del código se encuentra resaltado

[master (root-commit) **ac362b4**] C1: prj-star

Y este se vera modificado con cada commit y su respsectivo comentario

