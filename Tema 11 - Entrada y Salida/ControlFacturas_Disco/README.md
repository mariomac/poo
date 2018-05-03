# Ejemplo de Excepciones: gestión de pedidos con Entrada/Salida de disco

Este ejercicio añade entrada y salida de datos en disco al
[Control de Facturas del tema 10](../../Tema%2010%20-%20Excepciones/ControlFacturas).

Como dato interesante (añadido sobre la solución de clase), la clase `Factura` implementa
la interfaz `Iterable<Pedido>`, que nos permitirá iterar los pedidos en un foreach como
si de otro contenedor cualquiera se tratara:

```java
Factura factura = ...
for (Pedido p : factura) {
    ...
}
```