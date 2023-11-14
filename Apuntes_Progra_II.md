# **Primera clase**

**Fecha:** 07 de noviembre 2023

***Nota:*** *Para la clase de programación II, es recomendable practicar (jugar) mecanografía*

## 1.- IDE Visual Studio Code

Visual Studio Code es un editor de código fuente y de código abierto.
Destaca por ser multiplataforma y será el utilizado en esta materia.

### PASOS PARA EL FUNCIONAMIENTO DEL IDE

0. Se instaló el jdk en oracle.
1. Se instaló gitbash.
2. Se instaló el VSCode.
3. Se creó una cuenta de github.
4. Se integró la cuenta github al VSCode.
5. Consola.

### Configuración de VSCode

+ Se vinculó la cuenta de GitHub dentro de VSCode para poder trabajar en la nube.
+ Se creó una carpeta para la materia en OneDrive para poder trabajar.
+ Dentro de esta se creó una carpeta ***.md*** para trabajar MarkDown, misma que permitirá llevar los **apuntes** de la clase.
+ Dentro de VSC es necesario instalar las respectivas *extensiones* para que se pueda trabajar en los proyectos de acorde a sus lenguajes.
+ Se instaló la extensión llamada **(Extension Pack for Java)**.

## Consola

### ¿Qué es?

La consola o terminal, es una interfaz de línea de comandos que permite inteactuar a los usuarios con el sistema operativo.

### ¿Por qué configurarla?

Es recomendable personalizarla para que el ambiente sea más acogedor debido a que se trabajará en ella frecuentemente.

### ¿Cómo configurarla?

Para hacerlo más amigable con el usuario se utilizará:

+ [Oh my posh]

[Oh my posh]: ttps://ohmyposh.dev
Dentro de este se encuentran las instrucciones para personalizar el terminal tanto de PowerShell como el Gitbash, permitiéndole personalizar:

+ Tipografía: JetBrains Mono, MesloLGL Nerd Font
+ Theme
+ Icons

Los cambios efectuados en estos, se verán contemplado en VSCode.

---------------------------

workdirectory: workspace --> directorio de trabajo

---------------------------

# **Segunda clase**

**Fecha:** 08 de noviembre de 2023

## Mejores comando parra VSC

1. Papeleta de Comandos: **CTRL + SHIF + P**

    Y escribir "Abreviatura de comandos"
2. Abrir terminal: **CTRL + J**
3. Quick Open: **CTRL + P**

    Esto servirá para cambiar entre archivos.
4. Togle Sidebar: **CTRL + B**

    Abrirá y cerrará rápidamente el menú lateral izquierdo (esqueleto).
5. Multi cursor (Multi-Select): **CTRL + D, CTRL + F2**

    Con este se crearán cursores en diversas líneas de donde se tenga la palabra seleccionada.

    Es importante recalcar que **CTRL + F2** realizará el cambio en todo el documento.
6. Cortado matricial: **ALT + SHIFT RATÓN**

    Es importante poner el cursor en el prinicipio, aplastar el cortar y posteriormente marcar hasta el final, siendo así que cortará en forma de matriz.
7. Copy Line: **SHIFT + ALT + UP or SHIFT + ALT + DOWN**

    Repetirá la linea seleccionada en dirección a la cual se le haya indicado con el *up* y *down* del teclado.

8. Mover la linea seleccionada: **ALT + UP or DOWN**

    Moverá la línea o bloque seleccionado en dirección que se le indique.
9. Comentar en bloque (Multi-Line): **ALT + SHIFT +A**

    Comenta en forma varias línea al mismo tiempo ejemplo:

        /* código escrito
            código escrito */
    No se puede descomentar en forma de comando.
10. Comentar una línea (Single line): **CTRL + K + C**
    Comenta como si fuera una sola línea (puede funcionar seleccionando varias líneas).

    Para **descomentar** la o las líneas se utilizará **CTRL + K+ U**.

11. Line cut : **CTRL + X**
12. Vista previa lateral: **CTRL + K + V**
13. Cerrar: **CTRL +F4**
14. Dividir pantalla: **CTRL + SHIFT + 5**

## 2.- MarkDown

Es un lenguaje de marcado donde se le puede agregar formato a documentos de texto plano.

### 2.0 Comandos principales

#### 2.1 Textos

| Titulo  | Símbolo | Muestra|
|---|---|---|
| Título Grande | # |
| Título Mediano  | ##   |
|   Título Pequeño | ###  |
| Palabras en negrita | ** palabra **  | **palabra**|
| Palabras en cursiva | * palabra * |*palabra*|
|Palabras en negrita y cursiva|*** palabra ***| ***palabra***|
| Texto tachado | ~~  Texto  ~~ |~~Texto~~|
**Nota**: Los títulos no se pueden mostrar debido a que no cumple con las reglas de MD al mostrarlo así.

### 2.2 Enlaces

Para crear enlaces, encierra el texto del enlace entre corchetes [] y luego coloca la URL del enlace entre paréntesis ().

Ejemplo:

    [Texto del enlace](http://www.ejemplo.com)

### 2.3 Imágenes

Para insertar imágenes, se agrega un signo de exclamación (!) al principio.

Ejemplo:
       ![Texto alternativo](ruta/imagen.jpg)

### 2.4 Tablas

#### Estructura

Utiliza el carácter de barra vertical (|) para separar las columnas y los guiones (-) para definir la línea de encabezado y separar las filas de la tabla. Por ejemplo:

| Encabezado 1 | Encabezado 2 | Encabezado 3 |
| ------------ | ------------ | ------------ |
| Dato 1      | Dato 2      | Dato 3      |
| Dato 4      | Dato 5      | Dato 6      |

#### Alineación de las columnas

Puedes alinear el texto en las columnas utilizando dos puntos (:) antes o después del guion de separación. Por ejemplo, :--- alinea a la izquierda, ---: alinea a la derecha y :---: alinea al centro. Por ejemplo:

| Alineado a la izquierda | Alineado al centro | Alineado a la derecha |
| :--------------------- | :----------------: | -------------------: |
| Dato 1                 |      Dato 2        |             Dato 3   |
| Dato 4                 |      Dato 5        |             Dato 6   |

### Código

Para crear código en una línea utiliza el acento grave (`). Por ejemplo:

`var nombre = "John";`.

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

Recuerda que debes hacer un solo documento, no varios
