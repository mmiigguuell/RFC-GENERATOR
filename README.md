# Componente Generador de RFC para Java

## Descripción

Este componente Java permite generar un RFC de forma fácil y rápida. Está diseñado para ser usado en aplicaciones Java Swing, pudiendo ser añadido fácilmente a JFrame o JDialog.

El componente desarrollado consta de dos clases principales, `GeneradorRFCVisual` y `GeneradorHomoclave`, diseñadas para trabajar conjuntamente con el objetivo de generar RFCs completos y gestionar su interacción con el usuario a través de una interfaz gráfica.

## Métodos usados

# Ejemplo de Tabla con Alineación

|  Componente visual| |
|:------------|:----:|
| Método      | Explicación |
| LeerDatos()  |  Este método declara distintas variables para después tomar los valores que ingresa el usuario en los cuadros de texto y guardar esa información en sus respectivas variables. De igual forma manda un mensaje de error en caso de que el usuario no rellene todos los campos.  |
| generarRFC(String nombre, String apellidoPaterno, String apellidoMaterno, Date fechaNacimiento) |  Este método tiene como parametro todos los valores necesarios para generar el RFC del usuario, mediante el metodo charAt() extraemos la primer letra del apellido, la primer vocal del apellido, la primer letra de nombre y la fecha de nacimiento del usuario, cada letra extraida se va concatenando en una variable de tipo String llamada rfc.  |

|  Componente NO visual| |
|:------------|:----:|
| Método      | Explicación |
| generarHomoclave() |  La función de este método es generar la Homoclave, el cual son los 3 ultimos digitos que se encuentran al final del RFC. Esto lo hará mediante la clase Random() el cual, como bien sabemos muestra numeros o valores aleatorios segun se especifique, en este caso, creamos una variable de tipo StringBuilder para guardar nuestro RFC, se llamará homoclave, después creamos una cadena que contendrá las vocales de la a a la u en miniscula y mayuscula, y mediante un ciclo for, iremos guardando en la variable homoclave las letras aleatorias que nos dará la clase Random(). | 

## Usos

### Aplicación enfocada a la creación de RFC
El componente puede ser integrado en sistemas para la creación de RFC únicos, los cuales pueden ser guardados en una base de datos para la gestión de usuarios.

### Aplicaciones de Gestión de Usuarios
El componente es ideal para sistemas de gestión de usuarios donde se requiera la generación de RFCs precisos y únicos para nuevos usuarios o para la verificación de datos existentes.

### Herramientas Administrativas
Puede ser utilizado en herramientas administrativas que requieran la validación y generación de RFCs como parte de sus procesos de negocio, especialmente en entornos donde se maneja información fiscal o de identidad.

### Aplicaciones Web y Móviles
El componente también puede ser adaptado para aplicaciones web o móviles que necesiten generar y validar RFCs, proporcionando una solución segura y eficiente para manejar información de identidad.

## Características

- **Generación precisa y rápida de RFCs.**
- **Incluye la generación de homoclaves aleatorias para evitar duplicados.**
- **Fácil integración con cualquier componente Swing (`JFrame`, `JDialog`).**
- **Interfaz de arrastrar y soltar para una fácil manipulación en interfaces gráficas.**

## Requisitos

- **Java JDK 8 o superior.**
- **IDE con soporte para Swing si se desea visualizar el componente gráficamente (por ejemplo, NetBeans o IntelliJ IDEA).**
- **Asegurate de que en la carpeta de librerias se encuentre el archivo jCalendar.jar.**

## Instalación

Para usar estos componentes, sigue estos pasos:

1. Descarga los archivos y compila el proyecto, si todo funciona bien, da clic en la parte superior sobre el icono que tiene un martillo y una escoba, esta opcion se llama: Clean and Build Project, para generar tu archivo Jar.

2. Da clic derecho sobre la paleta de diseño>palette Manager>add from Jar y selecciona el archivo .jar en la carpeta de tu proyecto llamada dist.

3. Selecciona en que apartado de la paleta te gustaria que aparezca el componente y da clic en finish.

## Uso

### Componente Visual

1. Arrastra y suelta el componente visual en tu formulario.
2. Ingresa los datos requeridos: nombre, apellidos y fecha de nacimiento.
3. El componente generará automáticamente los primeros 10 dígitos del RFC.

### Componente No Visual

1. Incluye el componente no visual en tu proyecto.
2. Llámalo en tu código para generar la homoclave.

### Link de YOUTUBE.

Acontinuación se encuentra el link de un video en youtube donde se muestra la forma de usar el componente ya agregado en la paleta: https://youtu.be/neGwxGshmkg

## Autores

Miguel Ángel González Vásquez.

Paola Hernández Lázaro.
