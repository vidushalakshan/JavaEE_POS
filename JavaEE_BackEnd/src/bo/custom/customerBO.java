package bo.custom;

import bo.SuperBO;
import dto.customerDTO;

import javax.json.JsonArrayBuilder;
import javax.json.JsonObjectBuilder;
import java.sql.SQLException;

public interface customerBO extends SuperBO {
    JsonArrayBuilder getAllCustomer() throws SQLException;

    JsonObjectBuilder generateCustomerID() throws SQLException;

    JsonArrayBuilder searchCustomer(String id) throws SQLException;

    boolean addCustomer(customerDTO customerDTO) throws SQLException;

    boolean deleteCustomer(String id) throws SQLException;

    boolean updateCustomer(customerDTO customerDTO) throws SQLException;

    JsonArrayBuilder loadAllCusIDs() throws SQLException;

    JsonArrayBuilder loadSelectedCusData(String id) throws SQLException;
}
