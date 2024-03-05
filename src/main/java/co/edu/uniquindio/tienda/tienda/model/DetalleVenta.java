package co.edu.uniquindio.tienda.tienda.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuppressWarnings("ALL")
public class DetalleVenta {

    private int cantidad;
    private Producto producto;
    private Double subTotal;

}
