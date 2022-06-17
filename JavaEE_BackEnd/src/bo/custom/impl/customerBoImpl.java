package bo.custom.impl;

import bo.custom.customerBO;
import dto.customerDTO;

import javax.json.JsonArrayBuilder;
import javax.json.JsonObjectBuilder;
import java.sql.SQLException;

public class customerBoImpl implements customerBO {
    @Override
    public JsonArrayBuilder getAllCustomer() throws SQLException {
        return null;
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
        return false;
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
