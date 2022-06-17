package bo.custom;

import bo.SuperBO;
import dto.itemDTO;

import javax.json.JsonArrayBuilder;
import javax.json.JsonObjectBuilder;
import java.sql.SQLException;

public interface itemBO extends SuperBO {
    JsonArrayBuilder getAllItems() throws SQLException;

    JsonObjectBuilder generateItemID() throws SQLException;

    JsonArrayBuilder searchItem(String id) throws SQLException;

    boolean addItem(itemDTO itemDTO) throws SQLException;

    boolean deleteItem(String id) throws SQLException;

    boolean updateItem(itemDTO itemDTO) throws SQLException;

    JsonArrayBuilder loadAllItemIDs() throws SQLException;

    JsonArrayBuilder loadSelectedItemData(String id) throws SQLException;
}
