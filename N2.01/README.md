# Nivel 2: Creación de anotaciones personalizadas

## 📌 Enunciat del exercici
En este nivel vas a dar un paso más allá creando tu propia anotación. Esta anotación servirá para indicar que un objeto Java debe ser serializado en formato JSON, y recibirá como parámetro el directorio de destino . Comenzarás a ver cómo las anotaciones no sólo informan, sino que pueden afectar a la lógica del programa cuando se interpretan con herramientas adicionales.

Objetivo: Comprender cómo se pueden definir anotaciones personalizadas con parámetros para enriquecer la funcionalidad del código.

#### Ejercicio 1 - JSON Serialization
Crea una anotación personalizada que debe permitir serializar un objeto Java en un archivo JSON. La anotación debe recibir el directorio donde se colocará el archivo resultante.

## ✨ Funcionalitats
- JSON serialization

## 🛠 Tecnologies
- **Llenguatge**: Java 25
- **IDE**: IntelliJ IDEA

## Execution
- creo la annotation JsonSerializable usando @Target y @Retention
- he creado la utils JsonUtils usando Gson de Google para escribir en formato Json.
- he creado la clase Person con el @JsonSerializable pasandole (directory = "directory path")
- en el main he crado una Person y con le metodo JsonUtils.serializeToJson() se ha serializado en un Json.