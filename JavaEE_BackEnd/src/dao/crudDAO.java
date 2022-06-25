package dao;

import javax.json.JsonArrayBuilder;
import javax.json.JsonObjectBuilder;
import java.sql.SQLException;

public interface crudDAO<C, Id> extends superDAO {
    JsonArrayBuilder getAll() throws SQLException;

    JsonObjectBuilder generateID() throws SQLException;

    JsonArrayBuilder search(String id) throws SQLException;

    boolean add(C c) throws SQLException;

    boolean delete(String id) throws SQLException;

    boolean update(C c) throws SQLException;
}
