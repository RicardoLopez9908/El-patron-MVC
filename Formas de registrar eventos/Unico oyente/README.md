El mayor problema de optar por esta solución es el tamaño y la complejidad del método que escucha los eventos actionPerformed. Este último es necesario para identificar la fuente del evento y luego de hacerlo, procesarlo. En la práctica, esta práctica puede ser potencialmente de cientos de líneas de código provocando complejidad en la lectura y el mantenimiento.
Para reducir la complejidad del método actionPerformed se puede hacer lo siguiente:
- Crear un método independiente para procesar cada fuente el evento
- Limitar el código dentro del método actionPerformed para identificar la fuente del evento
- Invocar al método que procesa la identificación requerida
