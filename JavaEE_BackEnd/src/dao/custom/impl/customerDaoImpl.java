package dao.custom.impl;

import dao.custom.customerDAO;
import entity.customer;
import servlet.customerServlet;

import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObjectBuilder;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class customerDaoImpl implements customerDAO {
    JsonObjectBuilder objectBuilder = Json.createObjectBuilder();
    JsonArrayBuilder arrayBuilder = Json.createArrayBuilder();

    @Override
    public JsonArrayBuilder loadCusID() {
        return null;
    }

    @Override
    public JsonArrayBuilder loadSelectCusDetails(String id) {
        return null;
    }

    @Override
    public JsonArrayBuilder getAll() throws SQLException {
        Connection connection = customerServlet.ds.getConnection();
        ResultSet resultSet = connection.prepareStatement("SELECT * FROM customer").executeQuery();
        while (resultSet.next()) {
            String id = resultSet.getString(1);
            String name = resultSet.getString(2);
            String address = resultSet.getString(3);
            double salary = resultSet.getDouble(4);

            objectBuilder.add("id", id);
            objectBuilder.add("name", name);
            objectBuilder.add("address", address);
            objectBuilder.add("salary", salary);
        }
        connection.close();
        return arrayBuilder;
    }

    @Override
    public JsonObjectBuilder generateID() throws SQLException {
        return null;
    }

    @Override
    public JsonArrayBuilder search(String id) throws SQLException {
        return null;
    }

    @Override
    public boolean add(customer customer) throws SQLException {
        Connection connection = customerServlet.ds.getConnection();
        PreparedStatement pstm = connection.prepareStatement("INSERT INTO customer VALUES(?,?,?,?)");
        pstm.setObject(1, customer.getId());
        pstm.setObject(2, customer.getName());
        pstm.setObject(3, customer.getAddress());
        pstm.setObject(4, customer.getSalary());
        boolean b = pstm.executeUpdate() > 0;
        connection.close();
        return b;
    }

    @Override
    public boolean delete(String id) throws SQLException {
        return false;
    }

    @Override
    public boolean update(customer customer) throws SQLException {
        return false;
    }
}
