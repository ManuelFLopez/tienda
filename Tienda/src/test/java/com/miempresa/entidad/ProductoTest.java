package com.miempresa.entidad;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProductoTest {

    @Test
    void testGetNombre() {
        Producto producto = new Producto("Teclado", 25.5);
        assertEquals("Teclado", producto.getNombre());
    }

    @Test
    void testGetPrecio() {
        Producto producto = new Producto("Ratón", 15.0);
        assertEquals(15.0, producto.getPrecio());
    }

    @Test
    void testSetNombre() {
        Producto producto = new Producto("Monitor", 200.0);
        producto.setNombre("Monitor Gaming");

        assertEquals("Monitor Gaming", producto.getNombre());
    }

    @Test
    void testSetPrecio() {
        Producto producto = new Producto("Auriculares", 50.0);
        producto.setPrecio(60.0);

        assertEquals(60.0, producto.getPrecio());
    }

    @Test
    void testSetPrecioNegativo() {
        Producto producto = new Producto("Altavoz", 80.0);

        assertThrows(IllegalArgumentException.class, () -> {
            producto.setPrecio(-10);
        });
    }
}