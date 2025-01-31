package co.edu.uniquindio.tienda.tienda.util;

import co.edu.uniquindio.tienda.tienda.exception.ClienteException;
import co.edu.uniquindio.tienda.tienda.exception.ProductoException;
import co.edu.uniquindio.tienda.tienda.model.*;

import java.time.LocalDate;
import java.util.List;

public class TiendaUtils {

    public static Tienda inicializarDatos(){
        Tienda tienda = new Tienda();

        Producto p1 = new Producto("1111", "Arroz", 5000, 50);
        Producto p2 = new Producto("2222", "Azucar", 4500, 30);
        Producto p3 = new Producto("1234", "Sal", 4500, 51);

        try {
            tienda.agregarProducto(p1);
            tienda.agregarProducto(p2);
            tienda.agregarProducto(p3);
        } catch (ProductoException e) {
            throw new RuntimeException(e);
        }

        Cliente c1 = new Cliente("Juan", "1212", "Mi casa");
        Cliente c2 = new Cliente("Jose", "1313", "Su casa");

        try {
            c1.agregarProductoAlCarrito("1111");
        } catch (ProductoException e) {
            throw new RuntimeException(e);
        }

        try {
            tienda.agregarCliente(c1);
            tienda.agregarCliente(c2);
        } catch (ClienteException e) {
            throw new RuntimeException(e);
        }

        DetalleVenta d1 = new DetalleVenta(5,p1,p1.getPrecio()*5);
        DetalleVenta d2 = new DetalleVenta(5,p2,p2.getPrecio()*5);

        Venta v1 = new Venta("1211", LocalDate.now(), calcularTotal(new DetalleVenta[]{d1, d2}), c1, List.of(new DetalleVenta[]{d1, d2}));

        tienda.realizarVenta(v1);

        return tienda;

    }

    private static Double calcularTotal(DetalleVenta[] detalleVentas) {
        double total = 0;

        for(DetalleVenta detalle : detalleVentas){
            total += detalle.getSubTotal();
        }
        return total;
    }

}
