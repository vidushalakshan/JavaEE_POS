package bo.custom.impl;

import bo.custom.OrderBO;
import dto.orderDTO;

import javax.json.JsonArrayBuilder;

public class orderBoimpl implements OrderBO {
    @Override
    public boolean addOrder(orderDTO orderDTO) {
        return false;
    }

    @Override
    public JsonArrayBuilder genarateOrderID() {
        return null;
    }
}
