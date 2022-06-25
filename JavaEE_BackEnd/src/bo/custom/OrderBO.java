package bo.custom;

import bo.SuperBO;
import dto.orderDTO;

import javax.json.JsonArrayBuilder;
import java.sql.SQLException;

public interface OrderBO extends SuperBO {
    boolean addOrder(orderDTO orderDTO);

    JsonArrayBuilder genarateOrderID();
}
