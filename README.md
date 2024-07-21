# Componente Generador de RFC para Java

## Descripción

Este componente Java permite generar un RFC de forma fácil y rápida. Está diseñado para ser usado en aplicaciones Java Swing, pudiendo ser añadido fácilmente a JFrame o JDialog.

El componente desarrollado consta de dos clases principales, `GeneradorRFCVisual` y `GeneradorHomoclave`, diseñadas para trabajar conjuntamente con el objetivo de generar RFCs completos y gestionar su interacción con el usuario a través de una interfaz gráfica.

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

## Autores

Miguel Ángel González Vásquez.
