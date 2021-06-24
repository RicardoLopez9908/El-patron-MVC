# JUnit test

La API de JUnit permite escribir de manera sencilla complicados casos de prueba. Las caracteristicas son las siguientes:

- Aseveraciones o afirmaciones (asserts) para probar resultados esperados.
 
- Fijar el estado de un conjunto de objetos para compartir datos de verificación en común que se puedan utilizar como una linea base de la prueba.

- Ejecutores de los test para correr pruebas y el patrón de diseño de Composición (Composite).

__El principio básico detras de JUnit es la comparación de rresultados esperados respecto de los obtenidos mediante un proceso llamado aseveración o afirmación (assert). Los metodos disponibles en las diferentes clases de JUnit facilian este proceso.__


## INSTRUCTIVO BASICO: 

- Creamos un nuevo proyecto de Java en nuestro entorno de desarrollo.

- Hacemos que nuestro proyecto gane visibilidad en los otros que componen el espacio de trabajo ( Configuración de proyecto > BuildPath > Configure Build Path... > Projects > Add...) y agregamos las clases que queremos testear.

-Dentro de nuestro proyecto creamos un nuevo __JUnit case__ para hacer una prueba unitaria (elegir la "Class under test" que usaremos para realizar el test).

-Si queremos hacer un conjunto de pruebas, creamos un nuevo __JUnit suite__ que contenga todas las pruebas unitarias que querramos. (los tests unitarios seleccionados deben tener visibilidad publica para esto).
