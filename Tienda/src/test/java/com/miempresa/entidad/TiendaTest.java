package com.miempresa.entidad;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class TiendaTest {

    @Test
    void testAgregarProducto() {
        Tienda tienda = new Tienda();
        Producto p = new Producto("Laptop", 1000);

        tienda.agregarProducto(p);

        List<Producto> productos = tienda.obtenerProductos();
        assertEquals(1, productos.size());
        assertEquals("Laptop", productos.get(0).getNombre());
    }

    @Test
    void testObtenerProductos() {
        Tienda tienda = new Tienda();
        Producto p1 = new Producto("Mouse", 20);
        Producto p2 = new Producto("Teclado", 50);

        tienda.agregarProducto(p1);
        tienda.agregarProducto(p2);

        List<Producto> productos = tienda.obtenerProductos();

        assertEquals(2, productos.size());
        assertTrue(productos.contains(p1));
        assertTrue(productos.contains(p2));
    }

    @Test
    void testCalcularPrecioTotal() {
        Tienda tienda = new Tienda();

        tienda.agregarProducto(new Producto("Producto1", 10));
        tienda.agregarProducto(new Producto("Producto2", 20));
        tienda.agregarProducto(new Producto("Producto3", 30));

        double total = tienda.calcularPrecioTotal();

        assertEquals(60, total);
    }
}