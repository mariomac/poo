# Pacman, Cocos y Supercocos

Como ejemplo de extensión de un programa mediante herencia, simularemos un trozo del videojuego pacman que cumple estas premisas:

* Pacman va por ahí comiendo cocos.
* La mayoría de los cocos (clase `Coco`) no tienen efecto sobre Pacman.
* Hay un coco especial llamado `CocoDelPoder` que confiere a Pacman un poder especial.
* Los fantasman van por ahí vigilando a Pacman.
    * Si un fantasma está desnudo, irá corriendo a casa a ponerse una sábana.
    * Si un fantasma está vestido, generalmente perseguirá a Pacman.
    * ... a no ser que Pacman esté en estado `poderoso`, por lo cual el fantasma huirá.
* Los fantasmas pueden colisionar con Pacman
    * Si el fantasma no tiene ropa, no sucederá nada.
    * Si chocan con Pacman, pacman morirá.
    * ... a no ser que Pacman esté en estado `Poderoso`, con lo que el fantasma se quedará en pelotas.

Como es tan fácil extender un programa mediante herencia, más adelante añadimos la clase `CocoVenenoso`, que matará a Pacman si es ingerido (cualquiera que sea su estado).

![](uml.png)