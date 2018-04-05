# Reproductor MP3

Supongamos que alguien nos ha dado hecha la clase `Cancion` con los siguientes métodos:
* `void tocar()`: Empieza a sonar la canción
* `void parar()`: Deja de sonar la canción
* `String toString()`: Devuelve un String con el autor y el título de la canción

Programar la clase ReproductorMP3, que contenga una lista de reproducción e implemente los siguientes métodos:

* `void agregar(Cancion c)`: Añade una canción a la lista de reproducción
* `void tocar()`: toca la canción actual en la lista de reproducción
* `void parar()`: deja de tocar la canción actual
* `void siguiente()`: pasa a tocar la siguiente canción, o la primera si se ha llegado al final de la lista
* `void imprime()`: Muestra por pantalla la información de todas las canciones en la lista de reproducción
