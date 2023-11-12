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

