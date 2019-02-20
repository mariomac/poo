# Ejemplo de uso de Listas

Para ilustrar el uso de listas (`List`), creamos una clase `GestorTareas` que contiene objetos de la clase `Tarea`.

El uso de `List` aquí es adecuado porque:

* Nos importa dar un orden arbitrario a las tareas (añadimos las más prioritarias al inicio y las menos prioritarias al final).
* Queremos seleccionar tareas individuales (en este caso, según su índice, para marcarlas como hechas).
* Podemos eliminar las tareas con el método `remove` dentro de un bucle `for` mientras iteramos la lista.
    - (Esto no se puede hacer con un `Set`, ya que nos lanzaría un error llamado `ConcurrentModificationException`. Si quisiéramos hacerlo, habría que hacerlo mediante el uso de iteradores.)