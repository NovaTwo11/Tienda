package co.edu.uniquindio.tienda.tienda.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuppressWarnings("ALL")
public class Venta {
    private String codigo;
    private LocalDate fecha;
    private Double total;
    private Cliente cliente;
    private List<DetalleVenta> detallesVenta;
}