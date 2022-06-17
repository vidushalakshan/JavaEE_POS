package dao.custom.impl;

import dao.custom.customerDAO;
import entity.customer;

import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObjectBuilder;
import java.sql.SQLException;

public class customerDaoImpl implements customerDAO {
    JsonObjectBuilder objectBuilder= Json.createObjectBuilder();
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
        return null;
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
        return false;
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
