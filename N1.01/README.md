# Nivel 1: Anotaciones básicas

## 📌 Enunciat del exercici
### Ejercicio 1 - Override
Crea una jerarquía de objetos con tres clases: Trabajador, Trabajador Online y Trabajador Presencial.

La clase Trabajador tiene los atributos nombre, apellido, precio/hora, y el método calcularSou()que recibe por parámetro el número de horas trabajadas y lo multiplica por el precio/hora. Las clases hijas deben sobreescribirlo, empleando @Override.

Desde el main()de la clase Principal, realiza las invocaciones necesarias para demostrar el funcionamiento de la anotación @Override.

En los trabajadores presenciales, el método para calcular su sueldo, recibirá por parámetro el número de horas trabajadas al mes. A la hora de calcular el sueldo se multiplicará el número de horas trabajadas por el precio/hora, más el valor de un atributo staticllamado benzinaque añadiremos a esta clase.

En los trabajadores online, el método para calcular su sueldo recibirá por parámetro el número de horas trabajadas al mes. A la hora de calcular el sueldo se multiplicará el número de horas trabajadas por el precio/hora y se le sumará el precio de la tarifa plana de Internet, que será una constante de la clase TreballadorOnline.

### Ejercicio 2 - Deprecated
Añade a las clases hijas algunos métodos obsoletos (deprecated), y utiliza la anotación correspondiente. Invoca desde una clase externa los métodos obsoletos, suprimiendo mediante la correspondiente anotación los “warnings” para ser obsoletos.

## ✨ Funcionalitats
- Anotaciones basicas @Override y @Depracated 

## 🛠 Tecnologies
- **Llenguatge**: Java 25
- **IDE**: IntelliJ IDEA

## Excecution
- he creado todas las clases y hecho el @Override del metodo calculateSalary() en las dos subclases
- he creado el Main y llamado los tres metodos
- he añadido gasoline al metodo de TrabajadorPresencial y onlinePlus a Trabajador Online
- he creado en trabajadorOnline un metodo @Deprecated calculateOldSalary() y en el Main me avisa de que es depracated
- en el main he usado @SuppressWarning("deprecation") y efectivamente se ha quitado el aviso