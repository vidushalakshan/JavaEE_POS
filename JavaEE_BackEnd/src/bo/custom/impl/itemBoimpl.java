package bo.custom.impl;

import bo.custom.itemBO;
import dto.itemDTO;

import javax.json.JsonArrayBuilder;
import javax.json.JsonObjectBuilder;
import java.sql.SQLException;

public class itemBoimpl implements itemBO {
    @Override
    public JsonArrayBuilder getAllItems() throws SQLException {
        return null;
    }

    @Override
    public JsonObjectBuilder generateItemID() throws SQLException {
        return null;
    }

    @Override
    public JsonArrayBuilder searchItem(String id) throws SQLException {
        return null;
    }

    @Override
    public boolean addItem(itemDTO itemDTO) throws SQLException {
        return false;
    }

    @Override
    public boolean deleteItem(String id) throws SQLException {
        return false;
    }

    @Override
    public boolean updateItem(itemDTO itemDTO) throws SQLException {
        return false;
    }

    @Override
    public JsonArrayBuilder loadAllItemIDs() throws SQLException {
        return null;
    }

    @Override
    public JsonArrayBuilder loadSelectedItemData(String id) throws SQLException {
        return null;
    }
}
