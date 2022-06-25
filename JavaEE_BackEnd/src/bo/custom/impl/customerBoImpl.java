package bo.custom.impl;

import bo.BOFactory;
import bo.custom.customerBO;
import dao.custom.impl.customerDaoImpl;
import dto.customerDTO;
import entity.customer;

import javax.json.JsonArrayBuilder;
import javax.json.JsonObjectBuilder;
import java.sql.SQLException;

public class customerBoImpl implements customerBO {

    customerDaoImpl customerDAO = (customerDaoImpl) BOFactory.BOFactory().getBO(BOFactory.BOType.CUSTOMER);

    @Override
    public JsonArrayBuilder getAllCustomer() throws SQLException {
        return customerDAO.getAll();
    }

    @Override
    public JsonObjectBuilder generateCustomerID() throws SQLException {
        return null;
    }

    @Override
    public JsonArrayBuilder searchCustomer(String id) throws SQLException {
        return null;
    }

    @Override
    public boolean addCustomer(customerDTO customerDTO) throws SQLException {
        customer customer = new customer(customerDTO.getId(), customerDTO.getName(), customerDTO.getAddress(), customerDTO.getSalary());
        return customerDAO.add(customer);
    }

    @Override
    public boolean deleteCustomer(String id) throws SQLException {
        return false;
    }

    @Override
    public boolean updateCustomer(customerDTO customerDTO) throws SQLException {
        return false;
    }

    @Override
    public JsonArrayBuilder loadAllCusIDs() throws SQLException {
        return null;
    }

    @Override
    public JsonArrayBuilder loadSelectedCusData(String id) throws SQLException {
        return null;
    }
}
