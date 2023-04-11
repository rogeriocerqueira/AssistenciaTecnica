package DAO;

import DAO.Cliente.ClienteDAO;

public class DAO {
    private static ClienteDAO clienteDAO;
    private

    static ClienteDAO getClienteDAO() {
        return clienteDAO;
    }

    public static void setClienteDAO(ClienteDAO clienteDAO) {
        DAO.clienteDAO = clienteDAO;
    }

}
