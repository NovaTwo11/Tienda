package co.edu.uniquindio.tienda.tienda.controller;




import co.edu.uniquindio.tienda.tienda.exception.ClienteException;
import co.edu.uniquindio.tienda.tienda.exception.ClienteNoEncontradoException;
import co.edu.uniquindio.tienda.tienda.model.Cliente;
import co.edu.uniquindio.tienda.tienda.model.Tienda;
import co.edu.uniquindio.tienda.tienda.util.TiendaUtils;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("ALL")
public class ModelFactoryController {

    private Tienda tienda;

    public ModelFactoryController() {
        cargarDatosPrueba();
    }

    private void cargarDatosPrueba() {
        tienda = TiendaUtils.inicializarDatos();
    }

    /*
    -----------------------------------------------------------------------------------------------------------
    --------------------------------------GET INSTANCE---------------------------------------------------------
    */
    public static ModelFactoryController getInstance() {
        return SingletonHolder.eINSTANCE;
    }
    private static class SingletonHolder {
    private final static ModelFactoryController eINSTANCE = new ModelFactoryController();
    }
    /*
    -----------------------------------------------------------------------------------------------------------
    -----------------------------------------------------------------------------------------------------------
    */

    public List<Cliente> obtenerListaClientes() {
        return new ArrayList<>(tienda.getListClientes().values());
    }
    public boolean agregarCliente(Cliente cliente) throws ClienteException {
        return tienda.agregarCliente(cliente);
    }

    public boolean editarCliente(Cliente cliente, Cliente clienteSeleccionado) throws ClienteException {
        return tienda.editarCliente(cliente, clienteSeleccionado);
    }

    public boolean eliminarCliente(Cliente clienteSeleccionado) throws ClienteNoEncontradoException {
        return tienda.eliminarCliente(clienteSeleccionado.getNumIdentificacion());
    }

    public Cliente buscarCliente(String id) throws ClienteNoEncontradoException {
        return tienda.buscarCliente(id);
    }

}